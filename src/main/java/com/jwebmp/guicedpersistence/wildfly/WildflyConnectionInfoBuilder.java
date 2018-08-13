package com.jwebmp.guicedpersistence.wildfly;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jboss.wildfly.schema.*;
import com.jwebmp.guicedpersistence.btm.BTMTransactionIsolation;
import com.jwebmp.guicedpersistence.db.ConnectionBaseInfo;
import com.jwebmp.guicedpersistence.db.PropertiesConnectionInfoReader;
import com.jwebmp.guicedpersistence.db.exceptions.NoConnectionInfoException;
import com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;
import com.jwebmp.logger.LogFactory;
import com.oracle.jaxb21.PersistenceUnit;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.util.List;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;

public class WildflyConnectionInfoBuilder
		implements PropertiesConnectionInfoReader
{
	private static final Logger log = LogFactory.getLog("WildflyConnectionInfoReader");
	private static String standaloneFileName = "standalone.xml";
	/**
	 * The sub system type
	 */
	private static SubsystemType subsystemType = null;

	public static String getStandaloneFileName()
	{
		return WildflyConnectionInfoBuilder.standaloneFileName;
	}

	public static void setStandaloneFileName(String standaloneFileName)
	{
		WildflyConnectionInfoBuilder.standaloneFileName = standaloneFileName;
	}

	@Override
	public ConnectionBaseInfo populateConnectionBaseInfo(PersistenceUnit unit, Properties filteredProperties, ConnectionBaseInfo cbi)
	{
		SubsystemType type = getDatasourceSubsystem();

		IDataSource ds = findDatasource(type, unit.getJtaDataSource());
		if (XaDatasourceType.class.isAssignableFrom(ds.getClass()))
		{
			cbi = getConnectionBaseInfo(type, (XaDatasourceType) ds, unit.getJtaDataSource(), cbi);
		}
		else
		{
			cbi = getConnectionBaseInfo(type, (DatasourceType) ds, unit.getJtaDataSource(), unit, cbi);
		}
		return cbi;
	}

	private SubsystemType getDatasourceSubsystem()
	{
		String jbossHome = System.getProperty("jboss.server.config.dir");
		if (jbossHome == null || jbossHome.isEmpty())
		{
			WildflyConnectionInfoBuilder.log.log(Level.SEVERE, "Unable to find the server configuration directory. Set system property jboss.server.config.dir");
			throw new NoConnectionInfoException("Unable to find the server configuration directory. Set system property jboss.server.config.dir");
		}
		File standaloneFile = new File(jbossHome + "/" + WildflyConnectionInfoBuilder.standaloneFileName);
		if (!standaloneFile.exists())
		{
			throw new NoConnectionInfoException("Unable to find the server configuration file. Looked in " + jbossHome + "/" + WildflyConnectionInfoBuilder.standaloneFileName);
		}

		if (WildflyConnectionInfoBuilder.subsystemType == null)
		{
			try
			{
				String xml = FileUtils.readFileToString(standaloneFile, "UTF-8");
				String filtered = xml.substring(xml.indexOf("<datasources>"), xml.indexOf("</datasources>") + 14);
				filtered = "<subsystem xmlns=\"urn:jboss:domain:datasources:4.0\">" + filtered + "</subsystem>";

				JSONObject jsonObj = XML.toJSONObject(filtered);
				String json = String.valueOf(jsonObj);
				jsonObj = XML.toJSONObject(xml);

				ObjectMapper om = new ObjectMapper();
				om.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
				WildflyDatasourceContainer container = om.readValue(json, WildflyDatasourceContainer.class);
				WildflyConnectionInfoBuilder.subsystemType = container.getSubsystem();
			}
			catch (Exception e)
			{
				WildflyConnectionInfoBuilder.log.log(Level.SEVERE, "Unable to read the standalone file configured in " + jbossHome
				                                                   + "\nPlease make sure to set the jboss.server.config.dir property if running standalone.", e);
			}
		}
		return WildflyConnectionInfoBuilder.subsystemType;
	}

	private IDataSource findDatasource(SubsystemType datasources, String jndiMapping)
	{
		List<DatasourceType> nonXaDataSources = datasources.getDatasources()
		                                                   .getDatasourceTypes();
		List<XaDatasourceType> xaDataSources = datasources.getDatasources()
		                                                  .getXaDatasourceTypes();

		for (DatasourceType o : nonXaDataSources)
		{
			if (o.getJndiName()
			     .equals(jndiMapping))
			{
				return o;
			}

		}
		for (XaDatasourceType o : xaDataSources)
		{
			if (o.getJndiName()
			     .equals(jndiMapping))
			{
				return o;
			}
		}

		throw new NoConnectionInfoException("The JNDI Name [" + jndiMapping + "] must be available in the standalone config file.");
	}

	private ConnectionBaseInfo getConnectionBaseInfo(SubsystemType ds, XaDatasourceType xa, String jndiMapping, ConnectionBaseInfo cbi)
	{
		cbi.setDatabaseName(findProperty(xa, "DatabaseName"));
		cbi.setUsername(findProperty(xa, "User"));
		cbi.setPassword(findProperty(xa, "Password"));
		cbi.setServerName(findProperty(xa, "ServerName"));
		cbi.setInstanceName(findProperty(xa, "Instance"));
		cbi.setPort(findProperty(xa, "Port"));
		cbi.setJndiName(jndiMapping);

		cbi.setDriverClass(findDriverClassForDriver(ds, xa.getDriver()));

		if (xa.getNewConnectionSql() != null)
		{
			cbi.setTestQuery(xa.getNewConnectionSql());
		}

		//	cbi.setEnableJdbc4ConnectionTest(true);
		//	cbi.setShareTransactionConnections(true);
		if (xa.getTransactionIsolation() != null)
		{
			cbi.setTransactionIsolation(translateIsolation(xa.getTransactionIsolation()).toString());
		}
		//cbi.setPreparedStatementCacheSize(50);
		//cbi.setIgnoreRecoveryFailures(false);
		//cbi.setAllowLocalTransactions(true);
		//cbi.setAcquireIncrement(5);

		cbi.setDriver(xa.getDriver());
		cbi.setUrl(null);
		cbi.setXa(true);
		return cbi;
	}

	private ConnectionBaseInfo getConnectionBaseInfo(SubsystemType ds, DatasourceType xa, String jndiMapping, PersistenceUnit persistenceUnit, ConnectionBaseInfo cbi)
	{
		ServiceLoader<IWildflyDriverRegistration> driverRegistrations = ServiceLoader.load(IWildflyDriverRegistration.class);
		boolean found = false;
		for (IWildflyDriverRegistration driverRegistration : driverRegistrations)
		{
			Matcher matched = driverRegistration.driverPattern()
			                                    .matcher(xa.getConnectionUrl());
			if (matched.find())
			{
				cbi = driverRegistration.fromConnectionString(matched, xa.getConnectionUrl(), cbi, persistenceUnit, ds, xa, jndiMapping);
				found = true;
				break;
			}
		}
		if (!found)
		{
			throw new NoConnectionInfoException("Unable to find a valid driver registration using a pattern for " + jndiMapping);
		}

		cbi.setXa(false);
		return cbi;
	}

	private String findProperty(XaDatasourceType xa, String propertyName)
	{
		for (XaDatasourcePropertyType propertyType : xa.getXaDatasourceProperty())
		{
			if (propertyType.getName()
			                .equalsIgnoreCase(propertyName))
			{
				return propertyType.getContent()
				                   .trim();
			}
		}
		return null;
	}

	private String findDriverClassForDriver(SubsystemType ds, String driver)
	{
		for (DriverType driverType : ds.getDatasources()
		                               .getDrivers()
		                               .getDriver())
		{
			if (driverType.getName()
			              .equalsIgnoreCase(driver))
			{
				return driverType.getXaDatasourceClass();
			}
		}
		throw new NoConnectionInfoException("Unable to determine the XA Driver from the given name " + driver);
	}

	private BTMTransactionIsolation translateIsolation(TransactionIsolationType isoType)
	{
		return BTMTransactionIsolation.valueOf(isoType.name()
		                                              .replace("TRANSACTION_", ""));
	}

	private String getDriverClassForNonXA(String driver)
	{
		switch (driver)
		{
			case "sqlserver":
			{
				return "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			}
			case "h2":
			{
				return "org.h2.Driver";
			}
			case "IBMDB2":
			{
				return "com.ibm.as400.access.AS400JDBCDriver";
			}
			case "jtds":
			{
				return "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			}
			default:
			{
				throw new NoConnectionInfoException("Unable to determine a driver for the non xa resource");
			}
		}
	}
}

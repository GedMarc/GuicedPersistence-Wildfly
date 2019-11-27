package com.jwebmp.guicedpersistence.wildfly;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.guicedee.guicedinjection.GuiceContext;
import com.guicedee.guicedpersistence.db.ConnectionBaseInfo;
import com.guicedee.guicedpersistence.db.exceptions.InvalidConnectionInfoException;
import com.guicedee.guicedpersistence.db.exceptions.NoConnectionInfoException;
import com.guicedee.guicedpersistence.services.IPropertiesConnectionInfoReader;
import com.guicedee.logger.LogFactory;
import com.jboss.wildfly.schema.*;

import com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;

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

/**
 * The wildfly connection details information builder for Guiced Persistence
 */
public class WildflyConnectionInfoBuilder
		implements IPropertiesConnectionInfoReader
{
	/**
	 * The log file
	 */
	private static final Logger log = LogFactory.getLog("WildflyConnectionInfoReader");
	/**
	 * The standalone file to read from the system property jboss config - can be different to what is actually being used in wildfly.
	 */
	private static String standaloneFileName = "standalone.xml";
	/**
	 * The sub system type
	 */
	private static SubsystemType subsystemType = null;

	/**
	 * Method getStandaloneFileName returns the standaloneFileName of this WildflyConnectionInfoBuilder object.
	 * <p>
	 * The standalone file to read from the system property jboss config - can be different to what is actually being used in wildfly.
	 *
	 * @return the standaloneFileName (type String) of this WildflyConnectionInfoBuilder object.
	 */
	@SuppressWarnings("unused")
	public static String getStandaloneFileName()
	{
		return WildflyConnectionInfoBuilder.standaloneFileName;
	}

	/**
	 * Method setStandaloneFileName sets the standaloneFileName of this WildflyConnectionInfoBuilder object.
	 * <p>
	 * The standalone file to read from the system property jboss config - can be different to what is actually being used in wildfly.
	 *
	 * @param standaloneFileName
	 * 		the standaloneFileName of this WildflyConnectionInfoBuilder object.
	 */
	@SuppressWarnings("WeakerAccess")
	public static void setStandaloneFileName(String standaloneFileName)
	{
		WildflyConnectionInfoBuilder.standaloneFileName = standaloneFileName;
	}

	/**
	 * Method populateConnectionBaseInfo ...
	 *
	 * @param unit
	 * 		of type PersistenceUnit
	 * @param filteredProperties
	 * 		of type Properties
	 * @param cbi
	 * 		of type ConnectionBaseInfo
	 *
	 * @return ConnectionBaseInfo
	 */
	@Override
	public ConnectionBaseInfo populateConnectionBaseInfo(PersistenceUnit unit, Properties filteredProperties, ConnectionBaseInfo cbi)
	{
		SubsystemType type = WildflyConnectionInfoBuilder.getDatasourceSubsystem();
		try
		{
			IDataSource ds = findDatasource(type, unit.getJtaDataSource());
			if (XaDatasourceType.class.isAssignableFrom(ds.getClass()))
			{
				getConnectionBaseInfo(type, (XaDatasourceType) ds, unit.getJtaDataSource(), cbi);
			}
			else
			{
				getConnectionBaseInfo(type, (DatasourceType) ds, unit.getJtaDataSource(), unit, cbi);
			}
		}
		catch (NoConnectionInfoException nfi)
		{
			log.log(Level.WARNING, "Unable to find connection information with the provided JTA name [" + unit.getJtaDataSource() + "]. " +
			                       "No properties will be loaded from standalone for this entry", nfi);
		}
		return cbi;
	}

	/**
	 * Method getDatasourceSubsystem returns the datasourceSubsystem of this WildflyConnectionInfoBuilder object.
	 * <p>
	 * Returns the datasource subsystem type from the specified standalone file
	 *
	 * @return the datasourceSubsystem (type SubsystemType) of this WildflyConnectionInfoBuilder object.
	 */
	private static SubsystemType getDatasourceSubsystem()
	{
		String jbossHome = System.getProperty("jboss.server.config.dir");
		if (jbossHome == null || jbossHome.isEmpty())
		{
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

	/**
	 * FInds a given data source in the types with the given jndi mapping
	 *
	 * @param datasources
	 * 		The datasources
	 * @param jndiMapping
	 * 		The mapping
	 *
	 * @return An IDatasource XA or Not
	 */
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

	/**
	 * Returns the standard connection base info for the jndi mapping
	 *
	 * @param ds
	 * 		The subsystem
	 * @param xa
	 * 		The xa type
	 * @param jndiMapping
	 * 		The mapping specified
	 * @param cbi
	 * 		Incoming info object
	 */
	private void getConnectionBaseInfo(SubsystemType ds, XaDatasourceType xa, String jndiMapping, ConnectionBaseInfo cbi)
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
		if (xa.getTransactionIsolation() != null)
		{
			cbi.setTransactionIsolation(translateIsolation(xa.getTransactionIsolation()));
		}
		if (xa.getXaPool() != null)
		{
			if (xa.getXaPool()
			      .getMinPoolSize() != null)
			{
				cbi.setMinPoolSize(xa.getXaPool()
				                     .getMinPoolSize()
				                     .intValue());
			}
			if (xa.getXaPool()
			      .getMaxPoolSize() != null)
			{
				cbi.setMaxPoolSize(xa.getXaPool()
				                     .getMaxPoolSize()
				                     .intValue());
			}
			if (xa.getXaPool()
			      .isPrefill() != null)
			{
				cbi.setPrefill(xa.getXaPool()
				                 .isPrefill());
			}
			if (xa.getXaPool()
			      .isUseStrictMin() != null)
			{
				cbi.setUseStrictMin(xa.getXaPool()
				                      .isUseStrictMin());
			}
		}
		cbi.setDriver(xa.getDriver());
		cbi.setUrl(null);
		cbi.setXa(true);
	}

	/**
	 * Method getConnectionBaseInfo for Non-Xa types
	 *
	 * @param ds
	 * 		of type SubsystemType
	 * @param xa
	 * 		of type DatasourceType
	 * @param jndiMapping
	 * 		of type String
	 * @param persistenceUnit
	 * 		of type PersistenceUnit
	 * @param cbi
	 * 		of type ConnectionBaseInfo
	 */
	private void getConnectionBaseInfo(SubsystemType ds, DatasourceType xa, String jndiMapping, PersistenceUnit persistenceUnit, ConnectionBaseInfo cbi)
	{
		boolean found = false;
		for (IWildflyDriverRegistration driverRegistration : GuiceContext.instance()
		                                                                 .getLoader(IWildflyDriverRegistration.class, true, ServiceLoader.load(
				                                                                 IWildflyDriverRegistration.class)))
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
			throw new InvalidConnectionInfoException("Unable to find a valid driver registration using a pattern for " + jndiMapping);
		}

		cbi.setXa(false);
	}

	/**
	 * Finds a property from the given property name
	 *
	 * @param xa
	 * 		The xa type
	 * @param propertyName
	 * 		The property to find
	 *
	 * @return The string or null
	 */
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

	/**
	 * Gets the driver class from the subsystem
	 *
	 * @param ds
	 * 		The datasource type
	 * @param driver
	 * 		The driver
	 *
	 * @return The string of the class name
	 */
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
		throw new InvalidConnectionInfoException("Unable to determine the XA Driver from the given name " + driver);
	}

	/**
	 * Gets the translation isolation for the type
	 *
	 * @param isoType
	 * 		of type TransactionIsolationType
	 *
	 * @return String
	 */
	private String translateIsolation(TransactionIsolationType isoType)
	{
		return isoType.name()
		              .replace("TRANSACTION_", "");
	}
}

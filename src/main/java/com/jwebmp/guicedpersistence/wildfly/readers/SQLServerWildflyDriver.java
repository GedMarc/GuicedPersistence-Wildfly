package com.jwebmp.guicedpersistence.wildfly.readers;

import com.google.common.base.Strings;
import com.jboss.wildfly.schema.DatasourceType;
import com.jboss.wildfly.schema.SubsystemType;
import com.jwebmp.guicedpersistence.db.ConnectionBaseInfo;
import com.oracle.jaxb21.PersistenceUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Reads a sql server jdbc url string
 */
public class SQLServerWildflyDriver
		implements IWildflyDriverRegistration
{
	/**
	 * Method driverName ...
	 *
	 * @return String
	 */
	@Override
	public String driverName()
	{
		return "sqlserver";
	}

	/**
	 * Method driverNonXAClassName ...
	 *
	 * @return String
	 */
	@Override
	public String driverNonXAClassName()
	{
		return "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	}

	/**
	 * Method driverPattern ...
	 *
	 * @return Pattern
	 */
	@Override
	public Pattern driverPattern()
	{
		return Pattern.compile("(://)([0-9\\.A-Za-z]*)\\\\?([A-Za-z_0-9]*)?:?([0-9]*)?;databaseName=(.*);?");
	}

	/**
	 * Method fromConnectionString ...
	 *
	 * @param sqlMatch
	 * 		of type Matcher
	 * @param connectionInfo
	 * 		of type String
	 * @param cbi
	 * 		of type ConnectionBaseInfo
	 * @param persistenceUnit
	 * 		of type PersistenceUnit
	 * @param ds
	 * 		of type SubsystemType
	 * @param xa
	 * 		of type DatasourceType
	 * @param jndiMapping
	 * 		of type String
	 *
	 * @return ConnectionBaseInfo
	 */
	@Override
	public ConnectionBaseInfo fromConnectionString(Matcher sqlMatch, String connectionInfo, ConnectionBaseInfo cbi, PersistenceUnit persistenceUnit, SubsystemType ds, DatasourceType xa, String jndiMapping)
	{
		String s1 = sqlMatch.group(1);
		String serverName = sqlMatch.group(2);
		String instanceName = sqlMatch.group(3);
		String port = sqlMatch.group(4);
		String database = sqlMatch.group(5);
		cbi.setPort(Strings.emptyToNull(port));
		cbi.setServerName(Strings.emptyToNull(port));
		cbi.setInstanceName(Strings.emptyToNull(instanceName));
		cbi.setDatabaseName(Strings.emptyToNull(database.replaceAll(";", "")));
		cbi.setServerName(serverName);

		cbi.setUsername(xa.getSecurity()
		                  .getUserName());
		cbi.setPassword(xa.getSecurity()
		                  .getPassword());

		if (xa.getTransactionIsolation() != null)
		{
			cbi.setTransactionIsolation(translateIsolation(xa.getTransactionIsolation()));
		}

		loadValidation(xa, cbi);
		cbi = loadPoolSettings(cbi, xa);

		cbi.setJndiName(jndiMapping);
		cbi.setUrl(xa.getConnectionUrl());
		cbi.setDriver(xa.getDriver());
		cbi.setDriverClass(driverNonXAClassName());

		return cbi;
	}
}

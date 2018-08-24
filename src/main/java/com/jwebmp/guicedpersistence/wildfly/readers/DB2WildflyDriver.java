package com.jwebmp.guicedpersistence.wildfly.readers;

import com.google.common.base.Strings;
import com.jboss.wildfly.schema.DatasourceType;
import com.jboss.wildfly.schema.SubsystemType;
import com.jwebmp.guicedpersistence.db.ConnectionBaseInfo;
import com.oracle.jaxb21.PersistenceUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DB2WildflyDriver
		implements IWildflyDriverRegistration
{
	@Override
	public String driverName()
	{
		return "IBMDB2";
	}

	@Override
	public String driverNonXAClassName()
	{
		return "com.ibm.as400.access.AS400JDBCDriver";
	}

	@Override
	public Pattern driverPattern()
	{
		return Pattern.compile("(://)([0-9\\.]*);(prompt=false);(naming=system);libraries=([A-Za-z,]*);(.*)");
	}

	@Override
	public ConnectionBaseInfo fromConnectionString(Matcher sqlMatch, String connectionInfo, ConnectionBaseInfo cbi, PersistenceUnit persistenceUnit, SubsystemType ds, DatasourceType xa, String jndiMapping)
	{
		cbi.setUrl(xa.getConnectionUrl());
		// String s1 = sqlMatch.group(1);
		String serverName = sqlMatch.group(2);
		String database = sqlMatch.group(5);
		cbi.setDatabaseName(Strings.emptyToNull(database.replaceAll(";", "")
		                                                .trim()));
		cbi.setServerName(serverName.trim());

		cbi.setUsername(xa.getSecurity()
		                  .getUserName()
		                  .trim());
		cbi.setPassword(xa.getSecurity()
		                  .getPassword()
		                  .trim());

		if (xa.getTransactionIsolation() != null)
		{
			cbi.setTransactionIsolation(translateIsolation(xa.getTransactionIsolation()));
		}
		if (xa.getValidation() != null)
		{
			if (xa.getValidation()
			      .getCheckValidConnectionSql() != null)
			{
				cbi.setTestQuery(xa.getValidation()
				                   .getCheckValidConnectionSql());
			}
		}

		cbi = loadPoolSettings(cbi, xa);
		cbi.setJndiName(jndiMapping);
		cbi.setUrl(xa.getConnectionUrl());
		cbi.setDriver(xa.getDriver());
		cbi.setDriverClass(driverNonXAClassName());
		return cbi;
	}
}

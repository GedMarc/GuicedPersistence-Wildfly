package com.guicedee.guicedpersistence.wildfly.readers;

import com.guicedee.guicedpersistence.db.ConnectionBaseInfo;
import com.jboss.wildfly.schema.DatasourceType;
import com.jboss.wildfly.schema.SubsystemType;
import com.jboss.wildfly.schema.TransactionIsolationType;
import org.hibernate.jpa.boot.internal.ParsedPersistenceXmlDescriptor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Reads some driver and connection details from the item
 */
public interface IWildflyDriverRegistration
{
	String driverName();

	String driverNonXAClassName();

	Pattern driverPattern();

	ConnectionBaseInfo fromConnectionString(Matcher matched, String connectionInfo, ConnectionBaseInfo connectionBaseInfo, ParsedPersistenceXmlDescriptor persistenceUnit, SubsystemType ds, DatasourceType xa, String jndiMapping);

	/**
	 * Converts wildfly transaction isolation's to btm
	 *
	 * @param isoType
	 * 		the incoming isoType
	 *
	 * @return The BTM Transaction Isolation
	 */
	default String translateIsolation(TransactionIsolationType isoType)
	{
		return isoType.name()
		              .replace("TRANSACTION_", "");
	}

	default ConnectionBaseInfo loadPoolSettings(ConnectionBaseInfo cbi, DatasourceType xa)
	{
		if (xa.getPool() != null)
		{
			if (xa.getPool()
			      .getMinPoolSize() != null)
			{
				cbi.setMinPoolSize(xa.getPool()
				                     .getMinPoolSize()
				                     .intValue());
			}
			if (xa.getPool()
			      .getMaxPoolSize() != null)
			{
				cbi.setMaxPoolSize(xa.getPool()
				                     .getMaxPoolSize()
				                     .intValue());
			}
			if (xa.getPool()
			      .isPrefill() != null)
			{
				cbi.setPrefill(xa.getPool()
				                 .isPrefill());
			}
			if (xa.getPool()
			      .isUseStrictMin() != null)
			{
				cbi.setUseStrictMin(xa.getPool()
				                      .isUseStrictMin());
			}
		}
		return cbi;
	}

	default void loadValidation(DatasourceType xa, ConnectionBaseInfo cbi)
	{
		if (xa.getValidation() != null)
		{
			if (xa.getValidation()
			      .getCheckValidConnectionSql() != null)
			{
				cbi.setTestQuery(xa.getValidation()
				                   .getCheckValidConnectionSql());
			}
		}
	}
}

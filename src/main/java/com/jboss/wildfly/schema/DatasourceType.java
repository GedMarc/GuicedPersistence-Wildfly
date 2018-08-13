

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for datasourceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="datasourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connection-url" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="driver-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="datasource-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="driver" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="connection-property" type="{urn:jboss:domain:datasources:4.0}connection-propertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="new-connection-sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transaction-isolation" type="{urn:jboss:domain:datasources:4.0}transaction-isolationType" minOccurs="0"/>
 *         &lt;element name="url-delimiter" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="url-property" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="url-selector-strategy-class-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="pool" type="{urn:jboss:domain:datasources:4.0}poolType" minOccurs="0"/>
 *         &lt;element name="security" type="{urn:jboss:domain:datasources:4.0}dsSecurityType" minOccurs="0"/>
 *         &lt;element name="validation" type="{urn:jboss:domain:datasources:4.0}validationType" minOccurs="0"/>
 *         &lt;element name="timeout" type="{urn:jboss:domain:datasources:4.0}timeoutType" minOccurs="0"/>
 *         &lt;element name="statement" type="{urn:jboss:domain:datasources:4.0}statementType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:jboss:domain:datasources:4.0}common-datasourceAttributes"/>
 *       &lt;attribute name="jta" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@JsonAutoDetect(fieldVisibility = ANY,
		getterVisibility = NONE,
		setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatasourceType
		implements IDataSource
{
	@JsonProperty(value = "connection-url")
	private String connectionUrl;
	@JsonProperty(value = "driver-class")
	private String driverClass;
	@JsonProperty(value = "datasource-class")
	private String datasourceClass;

	private String driver;
	@JsonProperty(value = "connection-property")
	private List<ConnectionPropertyType> connectionProperty;
	@JsonProperty(value = "new-connection-sql")
	private String newConnectionSql;
	@JsonProperty(value = "transaction-isolation")
	private TransactionIsolationType transactionIsolation;
	@JsonProperty(value = "url-delimiter")

	private String urlDelimiter;
	@JsonProperty(value = "url-property")

	private String urlProperty;
	@JsonProperty(value = "url-selector-strategy-class-name")

	private String urlSelectorStrategyClassName;
	private PoolType pool;
	private DsSecurityType security;
	private ValidationType validation;
	private TimeoutType timeout;
	private StatementType statement;
	@JsonProperty(value = "jta")
	private Boolean jta;
	@JsonProperty(value = "jndi-name")
	private String jndiName;
	@JsonProperty(value = "pool-name")
	private String poolName;
	@JsonProperty(value = "enabled")
	private Boolean enabled;
	@JsonProperty(value = "use-java-context")
	private Boolean useJavaContext;
	@JsonProperty(value = "spy")
	private Boolean spy;
	@JsonProperty(value = "use-ccm")
	private Boolean useCcm;
	@JsonProperty(value = "connectable")
	private Boolean connectable;
	@JsonProperty(value = "tracking")
	private Boolean tracking;
	@JsonProperty(value = "statistics-enabled")
	private Boolean statisticsEnabled;
	@JsonProperty(value = "mcp")
	private String mcp;
	@JsonProperty(value = "enlistment-trace")
	private Boolean enlistmentTrace;

	/**
	 * Gets the value of the connectionUrl property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getConnectionUrl()
	{
		return connectionUrl;
	}

	/**
	 * Sets the value of the connectionUrl property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setConnectionUrl(String value)
	{
		this.connectionUrl = value;
	}

	/**
	 * Gets the value of the driverClass property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getDriverClass()
	{
		return driverClass;
	}

	/**
	 * Sets the value of the driverClass property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setDriverClass(String value)
	{
		this.driverClass = value;
	}

	/**
	 * Gets the value of the datasourceClass property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getDatasourceClass()
	{
		return datasourceClass;
	}

	/**
	 * Sets the value of the datasourceClass property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setDatasourceClass(String value)
	{
		this.datasourceClass = value;
	}

	/**
	 * Gets the value of the driver property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getDriver()
	{
		return driver;
	}

	/**
	 * Sets the value of the driver property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setDriver(String value)
	{
		this.driver = value;
	}

	/**
	 * Gets the value of the connectionProperty property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the connectionProperty property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getConnectionProperty().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ConnectionPropertyType }
	 */
	public List<ConnectionPropertyType> getConnectionProperty()
	{
		if (connectionProperty == null)
		{
			connectionProperty = new ArrayList<ConnectionPropertyType>();
		}
		return this.connectionProperty;
	}

	/**
	 * Gets the value of the newConnectionSql property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getNewConnectionSql()
	{
		return newConnectionSql;
	}

	/**
	 * Sets the value of the newConnectionSql property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setNewConnectionSql(String value)
	{
		this.newConnectionSql = value;
	}

	/**
	 * Gets the value of the transactionIsolation property.
	 *
	 * @return possible object is
	 * 		{@link TransactionIsolationType }
	 */
	public TransactionIsolationType getTransactionIsolation()
	{
		return transactionIsolation;
	}

	/**
	 * Sets the value of the transactionIsolation property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link TransactionIsolationType }
	 */
	public void setTransactionIsolation(TransactionIsolationType value)
	{
		this.transactionIsolation = value;
	}

	/**
	 * Gets the value of the urlDelimiter property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getUrlDelimiter()
	{
		return urlDelimiter;
	}

	/**
	 * Sets the value of the urlDelimiter property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setUrlDelimiter(String value)
	{
		this.urlDelimiter = value;
	}

	/**
	 * Gets the value of the urlProperty property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getUrlProperty()
	{
		return urlProperty;
	}

	/**
	 * Sets the value of the urlProperty property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setUrlProperty(String value)
	{
		this.urlProperty = value;
	}

	/**
	 * Gets the value of the urlSelectorStrategyClassName property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getUrlSelectorStrategyClassName()
	{
		return urlSelectorStrategyClassName;
	}

	/**
	 * Sets the value of the urlSelectorStrategyClassName property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setUrlSelectorStrategyClassName(String value)
	{
		this.urlSelectorStrategyClassName = value;
	}

	/**
	 * Gets the value of the pool property.
	 *
	 * @return possible object is
	 * 		{@link PoolType }
	 */
	public PoolType getPool()
	{
		return pool;
	}

	/**
	 * Sets the value of the pool property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link PoolType }
	 */
	public void setPool(PoolType value)
	{
		this.pool = value;
	}

	/**
	 * Gets the value of the security property.
	 *
	 * @return possible object is
	 * 		{@link DsSecurityType }
	 */
	public DsSecurityType getSecurity()
	{
		return security;
	}

	/**
	 * Sets the value of the security property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link DsSecurityType }
	 */
	public void setSecurity(DsSecurityType value)
	{
		this.security = value;
	}

	/**
	 * Gets the value of the validation property.
	 *
	 * @return possible object is
	 * 		{@link ValidationType }
	 */
	public ValidationType getValidation()
	{
		return validation;
	}

	/**
	 * Sets the value of the validation property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link ValidationType }
	 */
	public void setValidation(ValidationType value)
	{
		this.validation = value;
	}

	/**
	 * Gets the value of the timeout property.
	 *
	 * @return possible object is
	 * 		{@link TimeoutType }
	 */
	public TimeoutType getTimeout()
	{
		return timeout;
	}

	/**
	 * Sets the value of the timeout property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link TimeoutType }
	 */
	public void setTimeout(TimeoutType value)
	{
		this.timeout = value;
	}

	/**
	 * Gets the value of the statement property.
	 *
	 * @return possible object is
	 * 		{@link StatementType }
	 */
	public StatementType getStatement()
	{
		return statement;
	}

	/**
	 * Sets the value of the statement property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link StatementType }
	 */
	public void setStatement(StatementType value)
	{
		this.statement = value;
	}

	/**
	 * Gets the value of the jta property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public boolean isJta()
	{
		if (jta == null)
		{
			return true;
		}
		else
		{
			return jta;
		}
	}

	/**
	 * Sets the value of the jta property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setJta(Boolean value)
	{
		this.jta = value;
	}

	/**
	 * Gets the value of the jndiName property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	@Override
	public String getJndiName()
	{
		return jndiName;
	}

	/**
	 * Sets the value of the jndiName property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setJndiName(String value)
	{
		this.jndiName = value;
	}

	/**
	 * Gets the value of the poolName property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getPoolName()
	{
		return poolName;
	}

	/**
	 * Sets the value of the poolName property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setPoolName(String value)
	{
		this.poolName = value;
	}

	/**
	 * Gets the value of the enabled property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public boolean isEnabled()
	{
		if (enabled == null)
		{
			return true;
		}
		else
		{
			return enabled;
		}
	}

	/**
	 * Sets the value of the enabled property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setEnabled(Boolean value)
	{
		this.enabled = value;
	}

	/**
	 * Gets the value of the useJavaContext property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public boolean isUseJavaContext()
	{
		if (useJavaContext == null)
		{
			return true;
		}
		else
		{
			return useJavaContext;
		}
	}

	/**
	 * Sets the value of the useJavaContext property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setUseJavaContext(Boolean value)
	{
		this.useJavaContext = value;
	}

	/**
	 * Gets the value of the spy property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public boolean isSpy()
	{
		if (spy == null)
		{
			return false;
		}
		else
		{
			return spy;
		}
	}

	/**
	 * Sets the value of the spy property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setSpy(Boolean value)
	{
		this.spy = value;
	}

	/**
	 * Gets the value of the useCcm property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public boolean isUseCcm()
	{
		if (useCcm == null)
		{
			return true;
		}
		else
		{
			return useCcm;
		}
	}

	/**
	 * Sets the value of the useCcm property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setUseCcm(Boolean value)
	{
		this.useCcm = value;
	}

	/**
	 * Gets the value of the connectable property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public boolean isConnectable()
	{
		if (connectable == null)
		{
			return false;
		}
		else
		{
			return connectable;
		}
	}

	/**
	 * Sets the value of the connectable property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setConnectable(Boolean value)
	{
		this.connectable = value;
	}

	/**
	 * Gets the value of the tracking property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isTracking()
	{
		return tracking;
	}

	/**
	 * Sets the value of the tracking property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setTracking(Boolean value)
	{
		this.tracking = value;
	}

	/**
	 * Gets the value of the statisticsEnabled property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public boolean isStatisticsEnabled()
	{
		if (statisticsEnabled == null)
		{
			return false;
		}
		else
		{
			return statisticsEnabled;
		}
	}

	/**
	 * Sets the value of the statisticsEnabled property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setStatisticsEnabled(Boolean value)
	{
		this.statisticsEnabled = value;
	}

	/**
	 * Gets the value of the mcp property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getMcp()
	{
		return mcp;
	}

	/**
	 * Sets the value of the mcp property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setMcp(String value)
	{
		this.mcp = value;
	}

	/**
	 * Gets the value of the enlistmentTrace property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isEnlistmentTrace()
	{
		return enlistmentTrace;
	}

	/**
	 * Sets the value of the enlistmentTrace property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setEnlistmentTrace(Boolean value)
	{
		this.enlistmentTrace = value;
	}

}

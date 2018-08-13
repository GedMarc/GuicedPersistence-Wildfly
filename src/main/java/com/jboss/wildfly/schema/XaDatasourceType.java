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
 * <p>Java class for xa-datasourceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="xa-datasourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xa-datasource-property" type="{urn:jboss:domain:datasources:4.0}xa-datasource-propertyType" maxOccurs="unbounded"/>
 *         &lt;element name="xa-datasource-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="driver" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="url-delimiter" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="url-selector-strategy-class-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="new-connection-sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transaction-isolation" type="{urn:jboss:domain:datasources:4.0}transaction-isolationType" minOccurs="0"/>
 *         &lt;element name="xa-pool" type="{urn:jboss:domain:datasources:4.0}xa-poolType" minOccurs="0"/>
 *         &lt;element name="security" type="{urn:jboss:domain:datasources:4.0}dsSecurityType" minOccurs="0"/>
 *         &lt;element name="validation" type="{urn:jboss:domain:datasources:4.0}validationType" minOccurs="0"/>
 *         &lt;element name="timeout" type="{urn:jboss:domain:datasources:4.0}timeoutType" minOccurs="0"/>
 *         &lt;element name="statement" type="{urn:jboss:domain:datasources:4.0}statementType" minOccurs="0"/>
 *         &lt;element name="recovery" type="{urn:jboss:domain:datasources:4.0}recoverType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:jboss:domain:datasources:4.0}common-datasourceAttributes"/>
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
public class XaDatasourceType
		implements IDataSource
{

	@JsonProperty(value = "xa-datasource-property")
	private List<XaDatasourcePropertyType> xaDatasourceProperty;
	@JsonProperty(value = "xa-datasource-class")
	private String xaDatasourceClass;
	private String driver;
	@JsonProperty(value = "url-delimiter")
	private String urlDelimiter;
	@JsonProperty(value = "url-selector-strategy-class-name")
	private String urlSelectorStrategyClassName;
	@JsonProperty(value = "new-connection-sql")
	private String newConnectionSql;
	@JsonProperty(value = "transaction-isolation")
	private TransactionIsolationType transactionIsolation;
	@JsonProperty(value = "xa-pool")
	private XaPoolType xaPool;
	private DsSecurityType security;
	private ValidationType validation;
	private TimeoutType timeout;
	private StatementType statement;
	private RecoverType recovery;
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
	 * Gets the value of the xaDatasourceProperty property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the xaDatasourceProperty property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getXaDatasourceProperty().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link XaDatasourcePropertyType }
	 */
	public List<XaDatasourcePropertyType> getXaDatasourceProperty()
	{
		if (xaDatasourceProperty == null)
		{
			xaDatasourceProperty = new ArrayList<XaDatasourcePropertyType>();
		}
		return this.xaDatasourceProperty;
	}

	/**
	 * Gets the value of the xaDatasourceClass property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getXaDatasourceClass()
	{
		return xaDatasourceClass;
	}

	/**
	 * Sets the value of the xaDatasourceClass property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setXaDatasourceClass(String value)
	{
		this.xaDatasourceClass = value;
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
	 * Gets the value of the xaPool property.
	 *
	 * @return possible object is
	 * 		{@link XaPoolType }
	 */
	public XaPoolType getXaPool()
	{
		return xaPool;
	}

	/**
	 * Sets the value of the xaPool property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link XaPoolType }
	 */
	public void setXaPool(XaPoolType value)
	{
		this.xaPool = value;
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
	 * Gets the value of the recovery property.
	 *
	 * @return possible object is
	 * 		{@link RecoverType }
	 */
	public RecoverType getRecovery()
	{
		return recovery;
	}

	/**
	 * Sets the value of the recovery property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link RecoverType }
	 */
	public void setRecovery(RecoverType value)
	{
		this.recovery = value;
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

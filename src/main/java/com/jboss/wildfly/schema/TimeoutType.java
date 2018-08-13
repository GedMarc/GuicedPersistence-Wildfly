

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for timeoutType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="timeoutType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blocking-timeout-millis" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="idle-timeout-minutes" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="set-tx-query-timeout" type="{urn:jboss:domain:datasources:4.0}boolean-presenceType" minOccurs="0"/>
 *         &lt;element name="query-timeout" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="use-try-lock" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="allocation-retry" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="allocation-retry-wait-millis" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="xa-resource-timeout" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
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
public class TimeoutType
{

	@JsonProperty(value = "blocking-timeout-millis")
	private BigInteger blockingTimeoutMillis;
	@JsonProperty(value = "idle-timeout-minutes")
	private BigInteger idleTimeoutMinutes;
	@JsonProperty(value = "set-tx-query-timeout")
	private BooleanPresenceType setTxQueryTimeout;
	@JsonProperty(value = "query-timeout")
	private BigInteger queryTimeout;
	@JsonProperty(value = "use-try-lock")
	private BigInteger useTryLock;
	@JsonProperty(value = "allocation-retry")
	private BigInteger allocationRetry;
	@JsonProperty(value = "allocation-retry-wait-millis")
	private BigInteger allocationRetryWaitMillis;
	@JsonProperty(value = "xa-resource-timeout")
	private String xaResourceTimeout;

	/**
	 * Gets the value of the blockingTimeoutMillis property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getBlockingTimeoutMillis()
	{
		return blockingTimeoutMillis;
	}

	/**
	 * Sets the value of the blockingTimeoutMillis property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setBlockingTimeoutMillis(BigInteger value)
	{
		this.blockingTimeoutMillis = value;
	}

	/**
	 * Gets the value of the idleTimeoutMinutes property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getIdleTimeoutMinutes()
	{
		return idleTimeoutMinutes;
	}

	/**
	 * Sets the value of the idleTimeoutMinutes property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setIdleTimeoutMinutes(BigInteger value)
	{
		this.idleTimeoutMinutes = value;
	}

	/**
	 * Gets the value of the setTxQueryTimeout property.
	 *
	 * @return possible object is
	 * 		{@link BooleanPresenceType }
	 */
	public BooleanPresenceType getSetTxQueryTimeout()
	{
		return setTxQueryTimeout;
	}

	/**
	 * Sets the value of the setTxQueryTimeout property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link BooleanPresenceType }
	 */
	public void setSetTxQueryTimeout(BooleanPresenceType value)
	{
		this.setTxQueryTimeout = value;
	}

	/**
	 * Gets the value of the queryTimeout property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getQueryTimeout()
	{
		return queryTimeout;
	}

	/**
	 * Sets the value of the queryTimeout property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setQueryTimeout(BigInteger value)
	{
		this.queryTimeout = value;
	}

	/**
	 * Gets the value of the useTryLock property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getUseTryLock()
	{
		return useTryLock;
	}

	/**
	 * Sets the value of the useTryLock property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setUseTryLock(BigInteger value)
	{
		this.useTryLock = value;
	}

	/**
	 * Gets the value of the allocationRetry property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getAllocationRetry()
	{
		return allocationRetry;
	}

	/**
	 * Sets the value of the allocationRetry property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setAllocationRetry(BigInteger value)
	{
		this.allocationRetry = value;
	}

	/**
	 * Gets the value of the allocationRetryWaitMillis property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getAllocationRetryWaitMillis()
	{
		return allocationRetryWaitMillis;
	}

	/**
	 * Sets the value of the allocationRetryWaitMillis property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setAllocationRetryWaitMillis(BigInteger value)
	{
		this.allocationRetryWaitMillis = value;
	}

	/**
	 * Gets the value of the xaResourceTimeout property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getXaResourceTimeout()
	{
		return xaResourceTimeout;
	}

	/**
	 * Sets the value of the xaResourceTimeout property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setXaResourceTimeout(String value)
	{
		this.xaResourceTimeout = value;
	}

}



package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for poolType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="poolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="min-pool-size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="initial-pool-size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="max-pool-size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="prefill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fair" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="use-strict-min" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flush-strategy" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="allow-multiple-users" type="{urn:jboss:domain:datasources:4.0}boolean-presenceType" minOccurs="0"/>
 *         &lt;element name="capacity" type="{urn:jboss:domain:datasources:4.0}capacityType" minOccurs="0"/>
 *         &lt;element name="connection-listener" type="{urn:jboss:domain:datasources:4.0}extensionType" minOccurs="0"/>
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
public class PoolType
{

	@JsonProperty(value = "min-pool-size")
	private BigInteger minPoolSize;
	@JsonProperty(value = "initial-pool-size")
	private BigInteger initialPoolSize;
	@JsonProperty(value = "max-pool-size")
	private BigInteger maxPoolSize;
	private Boolean prefill;
	private Boolean fair;
	@JsonProperty(value = "use-strict-min")
	private Boolean useStrictMin;
	@JsonProperty(value = "flush-strategy")
	private String flushStrategy;
	@JsonProperty(value = "allow-multiple-users")
	private BooleanPresenceType allowMultipleUsers;
	private CapacityType capacity;
	@JsonProperty(value = "connection-listener")
	private ExtensionType connectionListener;

	/**
	 * Gets the value of the minPoolSize property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getMinPoolSize()
	{
		return minPoolSize;
	}

	/**
	 * Sets the value of the minPoolSize property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setMinPoolSize(BigInteger value)
	{
		this.minPoolSize = value;
	}

	/**
	 * Gets the value of the initialPoolSize property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getInitialPoolSize()
	{
		return initialPoolSize;
	}

	/**
	 * Sets the value of the initialPoolSize property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setInitialPoolSize(BigInteger value)
	{
		this.initialPoolSize = value;
	}

	/**
	 * Gets the value of the maxPoolSize property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getMaxPoolSize()
	{
		return maxPoolSize;
	}

	/**
	 * Sets the value of the maxPoolSize property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setMaxPoolSize(BigInteger value)
	{
		this.maxPoolSize = value;
	}

	/**
	 * Gets the value of the prefill property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isPrefill()
	{
		return prefill;
	}

	/**
	 * Sets the value of the prefill property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setPrefill(Boolean value)
	{
		this.prefill = value;
	}

	/**
	 * Gets the value of the fair property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isFair()
	{
		return fair;
	}

	/**
	 * Sets the value of the fair property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setFair(Boolean value)
	{
		this.fair = value;
	}

	/**
	 * Gets the value of the useStrictMin property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isUseStrictMin()
	{
		return useStrictMin;
	}

	/**
	 * Sets the value of the useStrictMin property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setUseStrictMin(Boolean value)
	{
		this.useStrictMin = value;
	}

	/**
	 * Gets the value of the flushStrategy property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getFlushStrategy()
	{
		return flushStrategy;
	}

	/**
	 * Sets the value of the flushStrategy property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setFlushStrategy(String value)
	{
		this.flushStrategy = value;
	}

	/**
	 * Gets the value of the allowMultipleUsers property.
	 *
	 * @return possible object is
	 * 		{@link BooleanPresenceType }
	 */
	public BooleanPresenceType getAllowMultipleUsers()
	{
		return allowMultipleUsers;
	}

	/**
	 * Sets the value of the allowMultipleUsers property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link BooleanPresenceType }
	 */
	public void setAllowMultipleUsers(BooleanPresenceType value)
	{
		this.allowMultipleUsers = value;
	}

	/**
	 * Gets the value of the capacity property.
	 *
	 * @return possible object is
	 * 		{@link CapacityType }
	 */
	public CapacityType getCapacity()
	{
		return capacity;
	}

	/**
	 * Sets the value of the capacity property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link CapacityType }
	 */
	public void setCapacity(CapacityType value)
	{
		this.capacity = value;
	}

	/**
	 * Gets the value of the connectionListener property.
	 *
	 * @return possible object is
	 * 		{@link ExtensionType }
	 */
	public ExtensionType getConnectionListener()
	{
		return connectionListener;
	}

	/**
	 * Sets the value of the connectionListener property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link ExtensionType }
	 */
	public void setConnectionListener(ExtensionType value)
	{
		this.connectionListener = value;
	}

}

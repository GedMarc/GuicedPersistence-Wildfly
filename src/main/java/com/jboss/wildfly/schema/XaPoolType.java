

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for xa-poolType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &lt;complexType name="xa-poolType"&gt;
 * &lt;complexContent&gt;
 * &lt;extension base="{urn:jboss:domain:datasources:4.0}poolType"&gt;
 * &lt;sequence&gt;
 * &lt;element name="is-same-rm-override" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 * &lt;element name="interleaving" type="{urn:jboss:domain:datasources:4.0}boolean-presenceType" minOccurs="0"/&gt;
 * &lt;element name="no-tx-separate-pools" type="{urn:jboss:domain:datasources:4.0}boolean-presenceType" minOccurs="0"/&gt;
 * &lt;element name="pad-xid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 * &lt;element name="wrap-xa-resource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 * &lt;/sequence&gt;
 * &lt;/extension&gt;
 * &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * &lt;/pre&gt;
 */
@JsonAutoDetect(fieldVisibility = ANY,
		getterVisibility = NONE,
		setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class XaPoolType
		extends PoolType
{

	@JsonProperty(value = "is-same-rm-override")
	private Boolean isSameRmOverride;
	private BooleanPresenceType interleaving;
	@JsonProperty(value = "no-tx-separate-pools")
	private BooleanPresenceType noTxSeparatePools;
	@JsonProperty(value = "pad-xid")
	private Boolean padXid;
	@JsonProperty(value = "wrap-xa-resource")
	private Boolean wrapXaResource;

	/**
	 * Gets the value of the isSameRmOverride property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isIsSameRmOverride()
	{
		return isSameRmOverride;
	}

	/**
	 * Sets the value of the isSameRmOverride property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setIsSameRmOverride(Boolean value)
	{
		isSameRmOverride = value;
	}

	/**
	 * Gets the value of the interleaving property.
	 *
	 * @return possible object is
	 * 		{@link BooleanPresenceType }
	 */
	public BooleanPresenceType getInterleaving()
	{
		return interleaving;
	}

	/**
	 * Sets the value of the interleaving property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link BooleanPresenceType }
	 */
	public void setInterleaving(BooleanPresenceType value)
	{
		interleaving = value;
	}

	/**
	 * Gets the value of the noTxSeparatePools property.
	 *
	 * @return possible object is
	 * 		{@link BooleanPresenceType }
	 */
	public BooleanPresenceType getNoTxSeparatePools()
	{
		return noTxSeparatePools;
	}

	/**
	 * Sets the value of the noTxSeparatePools property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link BooleanPresenceType }
	 */
	public void setNoTxSeparatePools(BooleanPresenceType value)
	{
		noTxSeparatePools = value;
	}

	/**
	 * Gets the value of the padXid property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isPadXid()
	{
		return padXid;
	}

	/**
	 * Sets the value of the padXid property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setPadXid(Boolean value)
	{
		padXid = value;
	}

	/**
	 * Gets the value of the wrapXaResource property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isWrapXaResource()
	{
		return wrapXaResource;
	}

	/**
	 * Sets the value of the wrapXaResource property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setWrapXaResource(Boolean value)
	{
		wrapXaResource = value;
	}

}

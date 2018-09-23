

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for recoverType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &lt;complexType name="recoverType"&gt;
 * &lt;complexContent&gt;
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 * &lt;sequence&gt;
 * &lt;element name="recover-credential" type="{urn:jboss:domain:datasources:4.0}dsSecurityType" minOccurs="0"/&gt;
 * &lt;element name="recover-plugin" type="{urn:jboss:domain:datasources:4.0}extensionType" minOccurs="0"/&gt;
 * &lt;/sequence&gt;
 * &lt;attribute name="no-recovery" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 * &lt;/restriction&gt;
 * &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * &lt;/pre&gt;
 */
@JsonAutoDetect(fieldVisibility = ANY,
		getterVisibility = NONE,
		setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecoverType
{

	@JsonProperty(value = "recover-credential")
	private DsSecurityType recoverCredential;
	@JsonProperty(value = "recover-plugin")
	private ExtensionType recoverPlugin;
	@JsonProperty(value = "no-recovery")
	private Boolean noRecovery;

	/**
	 * Gets the value of the recoverCredential property.
	 *
	 * @return possible object is
	 * 		{@link DsSecurityType }
	 */
	public DsSecurityType getRecoverCredential()
	{
		return recoverCredential;
	}

	/**
	 * Sets the value of the recoverCredential property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link DsSecurityType }
	 */
	public void setRecoverCredential(DsSecurityType value)
	{
		recoverCredential = value;
	}

	/**
	 * Gets the value of the recoverPlugin property.
	 *
	 * @return possible object is
	 * 		{@link ExtensionType }
	 */
	public ExtensionType getRecoverPlugin()
	{
		return recoverPlugin;
	}

	/**
	 * Sets the value of the recoverPlugin property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link ExtensionType }
	 */
	public void setRecoverPlugin(ExtensionType value)
	{
		recoverPlugin = value;
	}

	/**
	 * Gets the value of the noRecovery property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public boolean isNoRecovery()
	{
		if (noRecovery == null)
		{
			return false;
		}
		else
		{
			return noRecovery;
		}
	}

	/**
	 * Sets the value of the noRecovery property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setNoRecovery(Boolean value)
	{
		noRecovery = value;
	}

}

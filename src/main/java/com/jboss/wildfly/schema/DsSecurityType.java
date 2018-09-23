

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for dsSecurityType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &lt;complexType name="dsSecurityType"&gt;
 * &lt;complexContent&gt;
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 * &lt;sequence&gt;
 * &lt;choice&gt;
 * &lt;sequence&gt;
 * &lt;element name="user-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 * &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 * &lt;/sequence&gt;
 * &lt;element name="security-domain" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 * &lt;/choice&gt;
 * &lt;element name="reauth-plugin" type="{urn:jboss:domain:datasources:4.0}extensionType" minOccurs="0"/&gt;
 * &lt;/sequence&gt;
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
public class DsSecurityType
{

	@JsonProperty(value = "user-name")
	private String userName;
	private String password;
	@JsonProperty(value = "security-domain")
	private String securityDomain;
	@JsonProperty(value = "reauth-plugin")
	private ExtensionType reauthPlugin;

	/**
	 * Gets the value of the userName property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * Sets the value of the userName property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setUserName(String value)
	{
		userName = value;
	}

	/**
	 * Gets the value of the password property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Sets the value of the password property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setPassword(String value)
	{
		password = value;
	}

	/**
	 * Gets the value of the securityDomain property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getSecurityDomain()
	{
		return securityDomain;
	}

	/**
	 * Sets the value of the securityDomain property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setSecurityDomain(String value)
	{
		securityDomain = value;
	}

	/**
	 * Gets the value of the reauthPlugin property.
	 *
	 * @return possible object is
	 * 		{@link ExtensionType }
	 */
	public ExtensionType getReauthPlugin()
	{
		return reauthPlugin;
	}

	/**
	 * Sets the value of the reauthPlugin property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link ExtensionType }
	 */
	public void setReauthPlugin(ExtensionType value)
	{
		reauthPlugin = value;
	}

}

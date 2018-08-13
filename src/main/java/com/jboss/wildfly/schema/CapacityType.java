package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for capacityType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="capacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incrementer" type="{urn:jboss:domain:datasources:4.0}extensionType" minOccurs="0"/>
 *         &lt;element name="decrementer" type="{urn:jboss:domain:datasources:4.0}extensionType" minOccurs="0"/>
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
public class CapacityType
{

	private ExtensionType incrementer;
	private ExtensionType decrementer;

	/**
	 * Gets the value of the incrementer property.
	 *
	 * @return possible object is
	 * 		{@link ExtensionType }
	 */
	public ExtensionType getIncrementer()
	{
		return incrementer;
	}

	/**
	 * Sets the value of the incrementer property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link ExtensionType }
	 */
	public void setIncrementer(ExtensionType value)
	{
		this.incrementer = value;
	}

	/**
	 * Gets the value of the decrementer property.
	 *
	 * @return possible object is
	 * 		{@link ExtensionType }
	 */
	public ExtensionType getDecrementer()
	{
		return decrementer;
	}

	/**
	 * Sets the value of the decrementer property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link ExtensionType }
	 */
	public void setDecrementer(ExtensionType value)
	{
		this.decrementer = value;
	}

}

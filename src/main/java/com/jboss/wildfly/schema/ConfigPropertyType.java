

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * [
 * Specifies a Java bean property value
 *
 *
 *
 * <p>Java class for config-propertyType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &lt;complexType name="config-propertyType"&gt;
 * &lt;simpleContent&gt;
 * &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
 * &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 * &lt;/extension&gt;
 * &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * &lt;/pre&gt;
 */
@JsonAutoDetect(fieldVisibility = ANY,
		getterVisibility = NONE,
		setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfigPropertyType
{

	private String value;
	@JsonProperty(value = "name")
	private String name;

	/**
	 * Gets the value of the value property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Sets the value of the value property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setValue(String value)
	{
		this.value = value;
	}

	/**
	 * Gets the value of the name property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the name property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setName(String value)
	{
		name = value;
	}

}

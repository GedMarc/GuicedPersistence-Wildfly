

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for xa-datasource-propertyType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="xa-datasource-propertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
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
public class XaDatasourcePropertyType
{

	private String content;
	@JsonProperty(value = "name")
	private String name;

	/**
	 * Gets the value of the content property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 * Sets the value of the content property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setContent(String value)
	{
		this.content = value;
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
		this.name = value;
	}

}

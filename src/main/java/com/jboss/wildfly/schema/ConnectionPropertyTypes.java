package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Designates a any connection property type
 */
public class ConnectionPropertyTypes
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
		content = value;
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



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
 * <p>Java class for extensionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &lt;complexType name="extensionType"&gt;
 * &lt;complexContent&gt;
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 * &lt;sequence&gt;
 * &lt;element name="config-property" type="{urn:jboss:domain:datasources:4.0}config-propertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 * &lt;/sequence&gt;
 * &lt;attribute name="class-name" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
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
public class ExtensionType
{

	@JsonProperty(value = "config-property")
	private List<ConfigPropertyType> configProperty;
	@JsonProperty(value = "class-name")
	private String className;

	/**
	 * Gets the value of the configProperty property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the configProperty property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getConfigProperty().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ConfigPropertyType }
	 */
	public List<ConfigPropertyType> getConfigProperty()
	{
		if (configProperty == null)
		{
			configProperty = new ArrayList<>();
		}
		return configProperty;
	}

	/**
	 * Gets the value of the className property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getClassName()
	{
		return className;
	}

	/**
	 * Sets the value of the className property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setClassName(String value)
	{
		className = value;
	}

}

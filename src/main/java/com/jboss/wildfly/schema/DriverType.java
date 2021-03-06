

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for driverType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &lt;complexType name="driverType"&gt;
 * &lt;complexContent&gt;
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 * &lt;sequence&gt;
 * &lt;element name="driver-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 * &lt;element name="xa-datasource-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 * &lt;element name="datasource-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 * &lt;/sequence&gt;
 * &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 * &lt;attribute name="module" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 * &lt;attribute name="major-version" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 * &lt;attribute name="minor-verion" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
public class DriverType
{
	@JsonProperty(value = "driver-class")
	private String driverClass;
	@JsonProperty(value = "xa-datasource-class")
	private String xaDatasourceClass;
	@JsonProperty(value = "datasource-class")
	private String datasourceClass;
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "module")
	private String module;
	@JsonProperty(value = "major-version")
	private Integer majorVersion;
	@JsonProperty(value = "minor-verion")
	private Integer minorVerion;

	/**
	 * Gets the value of the driverClass property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getDriverClass()
	{
		return driverClass;
	}

	/**
	 * Sets the value of the driverClass property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setDriverClass(String value)
	{
		driverClass = value;
	}

	/**
	 * Gets the value of the xaDatasourceClass property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getXaDatasourceClass()
	{
		return xaDatasourceClass;
	}

	/**
	 * Sets the value of the xaDatasourceClass property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setXaDatasourceClass(String value)
	{
		xaDatasourceClass = value;
	}

	/**
	 * Gets the value of the datasourceClass property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getDatasourceClass()
	{
		return datasourceClass;
	}

	/**
	 * Sets the value of the datasourceClass property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setDatasourceClass(String value)
	{
		datasourceClass = value;
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

	/**
	 * Gets the value of the module property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getModule()
	{
		return module;
	}

	/**
	 * Sets the value of the module property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setModule(String value)
	{
		module = value;
	}

	/**
	 * Gets the value of the majorVersion property.
	 *
	 * @return possible object is
	 * 		{@link Integer }
	 */
	public Integer getMajorVersion()
	{
		return majorVersion;
	}

	/**
	 * Sets the value of the majorVersion property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Integer }
	 */
	public void setMajorVersion(Integer value)
	{
		majorVersion = value;
	}

	/**
	 * Gets the value of the minorVerion property.
	 *
	 * @return possible object is
	 * 		{@link Integer }
	 */
	public Integer getMinorVerion()
	{
		return minorVerion;
	}

	/**
	 * Sets the value of the minorVerion property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Integer }
	 */
	public void setMinorVerion(Integer value)
	{
		minorVerion = value;
	}

}

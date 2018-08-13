

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
 *
 * <pre>
 * &lt;complexType name="driverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="driver-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="xa-datasource-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="datasource-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="module" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="major-version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minor-verion" type="{http://www.w3.org/2001/XMLSchema}int" />
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
		this.driverClass = value;
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
		this.xaDatasourceClass = value;
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
		this.datasourceClass = value;
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
		this.module = value;
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
		this.majorVersion = value;
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
		this.minorVerion = value;
	}

}



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
 * <p>Java class for datasourcesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &lt;complexType name="datasourcesType"&gt;
 * &lt;complexContent&gt;
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 * &lt;sequence&gt;
 * &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 * &lt;element name="datasource" type="{urn:jboss:domain:datasources:4.0}datasourceType"/&gt;
 * &lt;element name="xa-datasource" type="{urn:jboss:domain:datasources:4.0}xa-datasourceType"/&gt;
 * &lt;/choice&gt;
 * &lt;element name="drivers" type="{urn:jboss:domain:datasources:4.0}driversType" minOccurs="0"/&gt;
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
public class DatasourcesType
{
	@JsonProperty("xa-datasource")
	private List<XaDatasourceType> xaDatasourceTypes;
	@JsonProperty("datasource")
	private List<DatasourceType> datasourceTypes;

	private DriversType drivers;

	public List<XaDatasourceType> getXaDatasourceTypes()
	{
		if (xaDatasourceTypes == null)
		{
			xaDatasourceTypes = new ArrayList<>();
		}
		return xaDatasourceTypes;
	}

	public void setXaDatasourceTypes(List<XaDatasourceType> xaDatasourceTypes)
	{
		this.xaDatasourceTypes = xaDatasourceTypes;
	}

	public List<DatasourceType> getDatasourceTypes()
	{
		if (datasourceTypes == null)
		{
			datasourceTypes = new ArrayList<>();
		}
		return datasourceTypes;
	}

	public void setDatasourceTypes(List<DatasourceType> datasourceTypes)
	{
		this.datasourceTypes = datasourceTypes;
	}

	/**
	 * Gets the value of the drivers property.
	 *
	 * @return possible object is
	 * 		{@link DriversType }
	 */
	public DriversType getDrivers()
	{
		return drivers;
	}

	/**
	 * Sets the value of the drivers property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link DriversType }
	 */
	public void setDrivers(DriversType value)
	{
		drivers = value;
	}

}

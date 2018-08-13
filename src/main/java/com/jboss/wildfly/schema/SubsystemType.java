

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for subsystemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="subsystemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="datasources" type="{urn:jboss:domain:datasources:4.0}datasourcesType"/>
 *       &lt;/all>
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
public class SubsystemType
{

	private DatasourcesType datasources;

	/**
	 * Gets the value of the datasources property.
	 *
	 * @return possible object is
	 * 		{@link DatasourcesType }
	 */
	public DatasourcesType getDatasources()
	{
		return datasources;
	}

	/**
	 * Sets the value of the datasources property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link DatasourcesType }
	 */
	public void setDatasources(DatasourcesType value)
	{
		this.datasources = value;
	}

}

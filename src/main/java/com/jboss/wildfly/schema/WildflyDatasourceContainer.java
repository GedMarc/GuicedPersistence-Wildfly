package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * A JSON Container for the datasource type
 */
@JsonAutoDetect(fieldVisibility = ANY,
		getterVisibility = NONE,
		setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WildflyDatasourceContainer
{
	/**
	 * Field subsystem
	 */
	@JsonProperty("subsystem")
	private SubsystemType subsystem;

	public SubsystemType getSubsystem()
	{
		return subsystem;
	}

	public void setSubsystem(SubsystemType subsystem)
	{
		this.subsystem = subsystem;
	}
}

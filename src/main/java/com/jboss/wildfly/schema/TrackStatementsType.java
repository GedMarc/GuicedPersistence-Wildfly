

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for track-statementsType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="track-statementsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="true"/>
 *     &lt;enumeration value="false"/>
 *     &lt;enumeration value="nowarn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@JsonAutoDetect(fieldVisibility = ANY,
		getterVisibility = NONE,
		setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public enum TrackStatementsType
{
	TRUE("true"),
	FALSE("false"),
	NOWARN("nowarn");
	private final String value;

	TrackStatementsType(String v)
	{
		value = v;
	}

	public static TrackStatementsType fromValue(String v)
	{
		for (TrackStatementsType c : TrackStatementsType.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

	public String value()
	{
		return value;
	}

}



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
 * &lt;pre&gt;
 * &lt;simpleType name="track-statementsType"&gt;
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 * &lt;enumeration value="true"/&gt;
 * &lt;enumeration value="false"/&gt;
 * &lt;enumeration value="nowarn"/&gt;
 * &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * &lt;/pre&gt;
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



package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for statementType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &lt;complexType name="statementType"&gt;
 * &lt;complexContent&gt;
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 * &lt;sequence&gt;
 * &lt;element name="track-statements" type="{urn:jboss:domain:datasources:4.0}track-statementsType" minOccurs="0"/&gt;
 * &lt;element name="prepared-statement-cache-size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 * &lt;element name="share-prepared-statements" type="{urn:jboss:domain:datasources:4.0}boolean-presenceType" minOccurs="0"/&gt;
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
public class StatementType
{

	@JsonProperty(value = "track-statements")
	private TrackStatementsType trackStatements;
	@JsonProperty(value = "prepared-statement-cache-size")
	private BigInteger preparedStatementCacheSize;
	@JsonProperty(value = "share-prepared-statements")
	private BooleanPresenceType sharePreparedStatements;

	/**
	 * Gets the value of the trackStatements property.
	 *
	 * @return possible object is
	 * 		{@link TrackStatementsType }
	 */
	public TrackStatementsType getTrackStatements()
	{
		return trackStatements;
	}

	/**
	 * Sets the value of the trackStatements property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link TrackStatementsType }
	 */
	public void setTrackStatements(TrackStatementsType value)
	{
		trackStatements = value;
	}

	/**
	 * Gets the value of the preparedStatementCacheSize property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getPreparedStatementCacheSize()
	{
		return preparedStatementCacheSize;
	}

	/**
	 * Sets the value of the preparedStatementCacheSize property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setPreparedStatementCacheSize(BigInteger value)
	{
		preparedStatementCacheSize = value;
	}

	/**
	 * Gets the value of the sharePreparedStatements property.
	 *
	 * @return possible object is
	 * 		{@link BooleanPresenceType }
	 */
	public BooleanPresenceType getSharePreparedStatements()
	{
		return sharePreparedStatements;
	}

	/**
	 * Sets the value of the sharePreparedStatements property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link BooleanPresenceType }
	 */
	public void setSharePreparedStatements(BooleanPresenceType value)
	{
		sharePreparedStatements = value;
	}

}

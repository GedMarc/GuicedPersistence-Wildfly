

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for validationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &lt;complexType name="validationType"&gt;
 * &lt;complexContent&gt;
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 * &lt;sequence&gt;
 * &lt;element name="valid-connection-checker" type="{urn:jboss:domain:datasources:4.0}extensionType" minOccurs="0"/&gt;
 * &lt;element name="check-valid-connection-sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 * &lt;element name="validate-on-match" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 * &lt;element name="background-validation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 * &lt;element name="background-validation-millis" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 * &lt;element name="use-fast-fail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 * &lt;element name="stale-connection-checker" type="{urn:jboss:domain:datasources:4.0}extensionType" minOccurs="0"/&gt;
 * &lt;element name="exception-sorter" type="{urn:jboss:domain:datasources:4.0}extensionType" minOccurs="0"/&gt;
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

public class ValidationType
{

	/**
	 * Field validConnectionChecker
	 */
	@JsonProperty(value = "valid-connection-checker")
	private ExtensionType validConnectionChecker;
	/**
	 * Field checkValidConnectionSql
	 */
	@JsonProperty(value = "check-valid-connection-sql")
	private String checkValidConnectionSql;
	/**
	 * Field validateOnMatch
	 */
	@JsonProperty(value = "validate-on-match")
	private Boolean validateOnMatch;
	/**
	 * Field backgroundValidation
	 */
	@JsonProperty(value = "background-validation")
	private Boolean backgroundValidation;
	/**
	 * Field backgroundValidationMillis
	 */
	@JsonProperty(value = "background-validation-millis")
	private BigInteger backgroundValidationMillis;
	/**
	 * Field useFastFail
	 */
	@JsonProperty(value = "use-fast-fail")
	private Boolean useFastFail;
	/**
	 * Field staleConnectionChecker
	 */
	@JsonProperty(value = "stale-connection-checker")
	private ExtensionType staleConnectionChecker;
	/**
	 * Field exceptionSorter
	 */
	@JsonProperty(value = "exception-sorter")
	private ExtensionType exceptionSorter;

	/**
	 * Gets the value of the validConnectionChecker property.
	 *
	 * @return possible object is
	 * 		{@link ExtensionType }
	 */
	public ExtensionType getValidConnectionChecker()
	{
		return validConnectionChecker;
	}

	/**
	 * Sets the value of the validConnectionChecker property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link ExtensionType }
	 */
	public void setValidConnectionChecker(ExtensionType value)
	{
		validConnectionChecker = value;
	}

	/**
	 * Gets the value of the checkValidConnectionSql property.
	 *
	 * @return possible object is
	 * 		{@link String }
	 */
	public String getCheckValidConnectionSql()
	{
		return checkValidConnectionSql;
	}

	/**
	 * Sets the value of the checkValidConnectionSql property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setCheckValidConnectionSql(String value)
	{
		checkValidConnectionSql = value;
	}

	/**
	 * Gets the value of the validateOnMatch property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isValidateOnMatch()
	{
		return validateOnMatch;
	}

	/**
	 * Sets the value of the validateOnMatch property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setValidateOnMatch(Boolean value)
	{
		validateOnMatch = value;
	}

	/**
	 * Gets the value of the backgroundValidation property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isBackgroundValidation()
	{
		return backgroundValidation;
	}

	/**
	 * Sets the value of the backgroundValidation property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setBackgroundValidation(Boolean value)
	{
		backgroundValidation = value;
	}

	/**
	 * Gets the value of the backgroundValidationMillis property.
	 *
	 * @return possible object is
	 * 		{@link java.math.BigInteger }
	 */
	public BigInteger getBackgroundValidationMillis()
	{
		return backgroundValidationMillis;
	}

	/**
	 * Sets the value of the backgroundValidationMillis property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link java.math.BigInteger }
	 */
	public void setBackgroundValidationMillis(BigInteger value)
	{
		backgroundValidationMillis = value;
	}

	/**
	 * Gets the value of the useFastFail property.
	 *
	 * @return possible object is
	 * 		{@link Boolean }
	 */
	public Boolean isUseFastFail()
	{
		return useFastFail;
	}

	/**
	 * Sets the value of the useFastFail property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Boolean }
	 */
	public void setUseFastFail(Boolean value)
	{
		useFastFail = value;
	}

	/**
	 * Gets the value of the staleConnectionChecker property.
	 *
	 * @return possible object is
	 * 		{@link ExtensionType }
	 */
	public ExtensionType getStaleConnectionChecker()
	{
		return staleConnectionChecker;
	}

	/**
	 * Sets the value of the staleConnectionChecker property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link ExtensionType }
	 */
	public void setStaleConnectionChecker(ExtensionType value)
	{
		staleConnectionChecker = value;
	}

	/**
	 * Gets the value of the exceptionSorter property.
	 *
	 * @return possible object is
	 * 		{@link ExtensionType }
	 */
	public ExtensionType getExceptionSorter()
	{
		return exceptionSorter;
	}

	/**
	 * Sets the value of the exceptionSorter property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link ExtensionType }
	 */
	public void setExceptionSorter(ExtensionType value)
	{
		exceptionSorter = value;
	}

}

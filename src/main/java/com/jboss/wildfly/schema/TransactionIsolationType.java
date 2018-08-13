

package com.jboss.wildfly.schema;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * <p>Java class for transaction-isolationType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transaction-isolationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="TRANSACTION_READ_UNCOMMITTED"/>
 *     &lt;enumeration value="TRANSACTION_READ_COMMITTED"/>
 *     &lt;enumeration value="TRANSACTION_REPEATABLE_READ"/>
 *     &lt;enumeration value="TRANSACTION_SERIALIZABLE"/>
 *     &lt;enumeration value="TRANSACTION_NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@JsonAutoDetect(fieldVisibility = ANY,
		getterVisibility = NONE,
		setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public enum TransactionIsolationType
{

	TRANSACTION_READ_UNCOMMITTED,
	TRANSACTION_READ_COMMITTED,
	TRANSACTION_REPEATABLE_READ,
	TRANSACTION_SERIALIZABLE,
	TRANSACTION_NONE;

	public static TransactionIsolationType fromValue(String v)
	{
		return TransactionIsolationType.valueOf(v);
	}

	public String value()
	{
		return name();
	}

}

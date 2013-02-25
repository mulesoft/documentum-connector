/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepositoryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepositoryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRUNCATED"/>
 *     &lt;enumeration value="INTERNAL_FAILURE"/>
 *     &lt;enumeration value="NOT_CONSTRAINED"/>
 *     &lt;enumeration value="UNREACHABLE"/>
 *     &lt;enumeration value="LOGIN_FAILED"/>
 *     &lt;enumeration value="COULD_NOT_FETCH"/>
 *     &lt;enumeration value="EXT_SOURCE_UNAVAILABLE"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *     &lt;enumeration value="QUERY_SCOPE_UNREACHABLE"/>
 *     &lt;enumeration value="WAS_STOPPED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="OVERLOADED"/>
 *     &lt;enumeration value="TOO_MANY_RESULTS"/>
 *     &lt;enumeration value="QUERY_SYNTAX_NOT_VALID"/>
 *     &lt;enumeration value="WILDCARD_SYNTAX_ERROR"/>
 *     &lt;enumeration value="UNSUPPORTED_ATTRIBUTE_ERROR"/>
 *     &lt;enumeration value="FACET_DEFINITION_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RepositoryStatus")
@XmlEnum
public enum RepositoryStatus {

    TRUNCATED,
    INTERNAL_FAILURE,
    NOT_CONSTRAINED,
    UNREACHABLE,
    LOGIN_FAILED,
    COULD_NOT_FETCH,
    EXT_SOURCE_UNAVAILABLE,
    UNAVAILABLE,
    QUERY_SCOPE_UNREACHABLE,
    WAS_STOPPED,
    EXPIRED,
    TYPE_NOT_SUPPORTED,
    OVERLOADED,
    TOO_MANY_RESULTS,
    QUERY_SYNTAX_NOT_VALID,
    WILDCARD_SYNTAX_ERROR,
    UNSUPPORTED_ATTRIBUTE_ERROR,
    FACET_DEFINITION_ERROR;

    public String value() {
        return name();
    }

    public static RepositoryStatus fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for Condition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Condition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="EQUAL"/>
 *     &lt;enumeration value="NOT_EQUAL"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="LESS_THAN"/>
 *     &lt;enumeration value="GREATER_EQUAL"/>
 *     &lt;enumeration value="LESS_EQUAL"/>
 *     &lt;enumeration value="BEGINS_WITH"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="DOES_NOT_CONTAIN"/>
 *     &lt;enumeration value="ENDS_WITH"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="NOT_IN"/>
 *     &lt;enumeration value="BETWEEN"/>
 *     &lt;enumeration value="IS_NULL"/>
 *     &lt;enumeration value="IS_NOT_NULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Condition")
@XmlEnum
public enum Condition {

    UNDEFINED,
    EQUAL,
    NOT_EQUAL,
    GREATER_THAN,
    LESS_THAN,
    GREATER_EQUAL,
    LESS_EQUAL,
    BEGINS_WITH,
    CONTAINS,
    DOES_NOT_CONTAIN,
    ENDS_WITH,
    IN,
    NOT_IN,
    BETWEEN,
    IS_NULL,
    IS_NOT_NULL;

    public String value() {
        return name();
    }

    public static Condition fromValue(String v) {
        return valueOf(v);
    }

}

/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectIdentityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectIdentityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="OBJECT_ID"/>
 *     &lt;enumeration value="OBJECT_KEY"/>
 *     &lt;enumeration value="OBJECT_PATH"/>
 *     &lt;enumeration value="QUALIFICATION"/>
 *     &lt;enumeration value="COMPOSITE_OBJECT_ID"/>
 *     &lt;enumeration value="STRING_URI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectIdentityType")
@XmlEnum
public enum ObjectIdentityType {

    UNDEFINED,
    OBJECT_ID,
    OBJECT_KEY,
    OBJECT_PATH,
    QUALIFICATION,
    COMPOSITE_OBJECT_ID,
    STRING_URI;

    public String value() {
        return name();
    }

    public static ObjectIdentityType fromValue(String v) {
        return valueOf(v);
    }

}

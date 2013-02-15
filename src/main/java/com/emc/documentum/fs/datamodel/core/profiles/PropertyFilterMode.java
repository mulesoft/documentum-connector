/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyFilterMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyFilterMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="IMPLIED"/>
 *     &lt;enumeration value="SPECIFIED_BY_INCLUDE"/>
 *     &lt;enumeration value="SPECIFIED_BY_EXCLUDE"/>
 *     &lt;enumeration value="ALL_NON_SYSTEM"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyFilterMode")
@XmlEnum
public enum PropertyFilterMode {

    NONE,
    IMPLIED,
    SPECIFIED_BY_INCLUDE,
    SPECIFIED_BY_EXCLUDE,
    ALL_NON_SYSTEM,
    ALL;

    public String value() {
        return name();
    }

    public static PropertyFilterMode fromValue(String v) {
        return valueOf(v);
    }

}

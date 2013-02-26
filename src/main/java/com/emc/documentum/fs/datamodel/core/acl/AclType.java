/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.acl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AclType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AclType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REGULAR"/>
 *     &lt;enumeration value="TEMPLATE"/>
 *     &lt;enumeration value="TEMPLATE_INSTANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AclType")
@XmlEnum
public enum AclType {

    REGULAR,
    TEMPLATE,
    TEMPLATE_INSTANCE;

    public String value() {
        return name();
    }

    public static AclType fromValue(String v) {
        return valueOf(v);
    }

}


package com.emc.documentum.fs.datamodel.core.acl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERMIT"/>
 *     &lt;enumeration value="RESTRICT"/>
 *     &lt;enumeration value="REQUIRE_GROUP"/>
 *     &lt;enumeration value="REQUIRE_GROUP_SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessType")
@XmlEnum
public enum AccessType {

    PERMIT,
    RESTRICT,
    REQUIRE_GROUP,
    REQUIRE_GROUP_SET;

    public String value() {
        return name();
    }

    public static AccessType fromValue(String v) {
        return valueOf(v);
    }

}

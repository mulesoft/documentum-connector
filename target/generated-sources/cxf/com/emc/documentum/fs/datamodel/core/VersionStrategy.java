
package com.emc.documentum.fs.datamodel.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionStrategy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VersionStrategy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMPLIED"/>
 *     &lt;enumeration value="NEXT_MAJOR"/>
 *     &lt;enumeration value="NEXT_MINOR"/>
 *     &lt;enumeration value="SAME_VERSION"/>
 *     &lt;enumeration value="BRANCH_VERSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VersionStrategy")
@XmlEnum
public enum VersionStrategy {

    IMPLIED,
    NEXT_MAJOR,
    NEXT_MINOR,
    SAME_VERSION,
    BRANCH_VERSION;

    public String value() {
        return name();
    }

    public static VersionStrategy fromValue(String v) {
        return valueOf(v);
    }

}

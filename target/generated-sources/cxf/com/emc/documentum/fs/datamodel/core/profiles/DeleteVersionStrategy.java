
package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteVersionStrategy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeleteVersionStrategy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMPLIED"/>
 *     &lt;enumeration value="SELECTED_VERSIONS"/>
 *     &lt;enumeration value="UNUSED_VERSIONS"/>
 *     &lt;enumeration value="ALL_VERSIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeleteVersionStrategy")
@XmlEnum
public enum DeleteVersionStrategy {

    IMPLIED,
    SELECTED_VERSIONS,
    UNUSED_VERSIONS,
    ALL_VERSIONS;

    public String value() {
        return name();
    }

    public static DeleteVersionStrategy fromValue(String v) {
        return valueOf(v);
    }

}

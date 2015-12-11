
package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepthFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepthFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE"/>
 *     &lt;enumeration value="SPECIFIED"/>
 *     &lt;enumeration value="UNLIMITED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepthFilter")
@XmlEnum
public enum DepthFilter {

    SINGLE,
    SPECIFIED,
    UNLIMITED;

    public String value() {
        return name();
    }

    public static DepthFilter fromValue(String v) {
        return valueOf(v);
    }

}

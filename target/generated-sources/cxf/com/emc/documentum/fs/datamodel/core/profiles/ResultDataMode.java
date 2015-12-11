
package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDataMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultDataMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REFERENCE"/>
 *     &lt;enumeration value="OBJECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultDataMode")
@XmlEnum
public enum ResultDataMode {

    REFERENCE,
    OBJECT;

    public String value() {
        return name();
    }

    public static ResultDataMode fromValue(String v) {
        return valueOf(v);
    }

}


package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenditionOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RenditionOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLIENT"/>
 *     &lt;enumeration value="SERVER"/>
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="CLIENT_AND_SERVER"/>
 *     &lt;enumeration value="PRIMARY_AND_CLIENT"/>
 *     &lt;enumeration value="PRIMARY_AND_SERVER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RenditionOption")
@XmlEnum
public enum RenditionOption {

    CLIENT,
    SERVER,
    PRIMARY,
    CLIENT_AND_SERVER,
    PRIMARY_AND_CLIENT,
    PRIMARY_AND_SERVER;

    public String value() {
        return name();
    }

    public static RenditionOption fromValue(String v) {
        return valueOf(v);
    }

}

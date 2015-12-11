
package com.emc.documentum.fs.datamodel.core.content;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RenditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLIENT"/>
 *     &lt;enumeration value="SERVER"/>
 *     &lt;enumeration value="PRIMARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RenditionType")
@XmlEnum
public enum RenditionType {

    CLIENT,
    SERVER,
    PRIMARY;

    public String value() {
        return name();
    }

    public static RenditionType fromValue(String v) {
        return valueOf(v);
    }

}

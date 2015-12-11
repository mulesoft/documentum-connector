
package com.emc.documentum.fs.datamodel.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AspectIntentModifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AspectIntentModifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATTACH"/>
 *     &lt;enumeration value="DETACH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AspectIntentModifier")
@XmlEnum
public enum AspectIntentModifier {

    ATTACH,
    DETACH;

    public String value() {
        return name();
    }

    public static AspectIntentModifier fromValue(String v) {
        return valueOf(v);
    }

}

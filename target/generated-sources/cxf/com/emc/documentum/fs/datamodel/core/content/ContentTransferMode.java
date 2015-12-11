
package com.emc.documentum.fs.datamodel.core.content;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentTransferMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentTransferMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASE64"/>
 *     &lt;enumeration value="MTOM"/>
 *     &lt;enumeration value="UCF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentTransferMode")
@XmlEnum
public enum ContentTransferMode {

    @XmlEnumValue("BASE64")
    BASE_64("BASE64"),
    MTOM("MTOM"),
    UCF("UCF");
    private final String value;

    ContentTransferMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentTransferMode fromValue(String v) {
        for (ContentTransferMode c: ContentTransferMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

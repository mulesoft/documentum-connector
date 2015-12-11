
package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListUpdateMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListUpdateMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REPLACE"/>
 *     &lt;enumeration value="MERGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListUpdateMethod")
@XmlEnum
public enum ListUpdateMethod {

    REPLACE,
    MERGE;

    public String value() {
        return name();
    }

    public static ListUpdateMethod fromValue(String v) {
        return valueOf(v);
    }

}

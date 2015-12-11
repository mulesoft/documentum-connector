
package com.emc.documentum.fs.datamodel.core.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="SHORT"/>
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="LONG"/>
 *     &lt;enumeration value="DOUBLE"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="OBJECT_ID"/>
 *     &lt;enumeration value="CUSTOM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataType", namespace = "http://schema.core.datamodel.fs.documentum.emc.com/")
@XmlEnum
public enum DataType {

    STRING,
    SHORT,
    INTEGER,
    LONG,
    DOUBLE,
    DATE,
    BOOLEAN,
    OBJECT_ID,
    CUSTOM;

    public String value() {
        return name();
    }

    public static DataType fromValue(String v) {
        return valueOf(v);
    }

}


package com.emc.documentum.fs.datamodel.core.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacetSort.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FacetSort">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREQUENCY"/>
 *     &lt;enumeration value="VALUE_ASCENDING"/>
 *     &lt;enumeration value="VALUE_DESCENDING"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FacetSort")
@XmlEnum
public enum FacetSort {

    FREQUENCY,
    VALUE_ASCENDING,
    VALUE_DESCENDING,
    NONE;

    public String value() {
        return name();
    }

    public static FacetSort fromValue(String v) {
        return valueOf(v);
    }

}

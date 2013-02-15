/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package org.w3._2001.xmlschema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for positiveInteger simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="positiveInteger">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *     &lt;minInclusive value="1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positiveInteger", propOrder = {
    "value"
})
public class PositiveInteger
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    @XmlSchemaType(name = "positiveInteger")
    protected NonNegativeInteger value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger }
     *     
     */
    public NonNegativeInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger }
     *     
     */
    public void setValue(NonNegativeInteger value) {
        this.value = value;
    }

}

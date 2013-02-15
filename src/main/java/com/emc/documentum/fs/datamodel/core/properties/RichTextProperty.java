/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.properties;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.RichText;


/**
 * <p>Java class for RichTextProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RichTextProperty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://properties.core.datamodel.fs.documentum.emc.com/}Property">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://core.datamodel.fs.documentum.emc.com/}RichText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RichTextProperty", propOrder = {
    "value"
})
public class RichTextProperty
    extends Property
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Value")
    protected RichText value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link RichText }
     *     
     */
    public RichText getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichText }
     *     
     */
    public void setValue(RichText value) {
        this.value = value;
    }

}


package com.emc.documentum.fs.datamodel.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aspect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aspect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="intentModifier" type="{http://core.datamodel.fs.documentum.emc.com/}AspectIntentModifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aspect")
public class Aspect {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "intentModifier")
    protected AspectIntentModifier intentModifier;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the intentModifier property.
     * 
     * @return
     *     possible object is
     *     {@link AspectIntentModifier }
     *     
     */
    public AspectIntentModifier getIntentModifier() {
        return intentModifier;
    }

    /**
     * Sets the value of the intentModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AspectIntentModifier }
     *     
     */
    public void setIntentModifier(AspectIntentModifier value) {
        this.intentModifier = value;
    }

}

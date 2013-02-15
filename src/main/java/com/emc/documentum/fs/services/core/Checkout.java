/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.services.core;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.ObjectIdentitySet;
import com.emc.documentum.fs.datamodel.core.OperationOptions;


/**
 * <p>Java class for checkout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectIdentitySet" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectIdentitySet" minOccurs="0"/>
 *         &lt;element name="options" type="{http://core.datamodel.fs.documentum.emc.com/}OperationOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkout", propOrder = {
    "objectIdentitySet",
    "options"
})
@XmlRootElement(name = "checkout")
public class Checkout
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ObjectIdentitySet objectIdentitySet;
    protected OperationOptions options;

    /**
     * Gets the value of the objectIdentitySet property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentitySet }
     *     
     */
    public ObjectIdentitySet getObjectIdentitySet() {
        return objectIdentitySet;
    }

    /**
     * Sets the value of the objectIdentitySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentitySet }
     *     
     */
    public void setObjectIdentitySet(ObjectIdentitySet value) {
        this.objectIdentitySet = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link OperationOptions }
     *     
     */
    public OperationOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationOptions }
     *     
     */
    public void setOptions(OperationOptions value) {
        this.options = value;
    }

}

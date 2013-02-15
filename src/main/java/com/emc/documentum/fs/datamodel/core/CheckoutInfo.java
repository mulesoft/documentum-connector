/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckoutInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckoutInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identity" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectIdentity" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isCheckedOut" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckoutInfo", propOrder = {
    "identity"
})
public class CheckoutInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Identity")
    protected ObjectIdentity identity;
    @XmlAttribute(name = "isCheckedOut", required = true)
    protected boolean isCheckedOut;
    @XmlAttribute(name = "userName")
    protected String userName;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentity }
     *     
     */
    public ObjectIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentity }
     *     
     */
    public void setIdentity(ObjectIdentity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the isCheckedOut property.
     * 
     */
    public boolean isIsCheckedOut() {
        return isCheckedOut;
    }

    /**
     * Sets the value of the isCheckedOut property.
     * 
     */
    public void setIsCheckedOut(boolean value) {
        this.isCheckedOut = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}

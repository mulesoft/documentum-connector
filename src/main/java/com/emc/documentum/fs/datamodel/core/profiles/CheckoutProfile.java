/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.profiles;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckoutProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckoutProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="checkoutOnlyVDMRoot" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckoutProfile")
public class CheckoutProfile
    extends Profile
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "checkoutOnlyVDMRoot", required = true)
    protected boolean checkoutOnlyVDMRoot;

    /**
     * Gets the value of the checkoutOnlyVDMRoot property.
     * 
     */
    public boolean isCheckoutOnlyVDMRoot() {
        return checkoutOnlyVDMRoot;
    }

    /**
     * Sets the value of the checkoutOnlyVDMRoot property.
     * 
     */
    public void setCheckoutOnlyVDMRoot(boolean value) {
        this.checkoutOnlyVDMRoot = value;
    }

}

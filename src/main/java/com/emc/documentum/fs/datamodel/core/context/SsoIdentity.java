/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsoIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsoIdentity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://context.core.datamodel.fs.documentum.emc.com/}BasicIdentity">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="ssoType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsoIdentity")
public class SsoIdentity
    extends BasicIdentity
{

    @XmlAttribute(name = "ssoType")
    protected String ssoType;

    /**
     * Gets the value of the ssoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsoType() {
        return ssoType;
    }

    /**
     * Sets the value of the ssoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsoType(String value) {
        this.ssoType = value;
    }

}

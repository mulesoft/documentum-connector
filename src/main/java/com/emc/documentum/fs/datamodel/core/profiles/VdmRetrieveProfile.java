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
 * <p>Java class for VdmRetrieveProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VdmRetrieveProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="shouldFollowAssembly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="binding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VdmRetrieveProfile")
public class VdmRetrieveProfile
    extends Profile
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "shouldFollowAssembly", required = true)
    protected boolean shouldFollowAssembly;
    @XmlAttribute(name = "binding")
    protected String binding;

    /**
     * Gets the value of the shouldFollowAssembly property.
     * 
     */
    public boolean isShouldFollowAssembly() {
        return shouldFollowAssembly;
    }

    /**
     * Sets the value of the shouldFollowAssembly property.
     * 
     */
    public void setShouldFollowAssembly(boolean value) {
        this.shouldFollowAssembly = value;
    }

    /**
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinding(String value) {
        this.binding = value;
    }

}
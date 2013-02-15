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
 * <p>Java class for SearchProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="isAsyncCall" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchProfile")
public class SearchProfile
    extends Profile
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "isAsyncCall", required = true)
    protected boolean isAsyncCall;

    /**
     * Gets the value of the isAsyncCall property.
     * 
     */
    public boolean isIsAsyncCall() {
        return isAsyncCall;
    }

    /**
     * Sets the value of the isAsyncCall property.
     * 
     */
    public void setIsAsyncCall(boolean value) {
        this.isAsyncCall = value;
    }

}

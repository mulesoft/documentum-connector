/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="isNonCurrentObjectAllowed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveProfile")
public class MoveProfile
    extends Profile
{

    @XmlAttribute(name = "isNonCurrentObjectAllowed", required = true)
    protected boolean isNonCurrentObjectAllowed;

    /**
     * Gets the value of the isNonCurrentObjectAllowed property.
     * 
     */
    public boolean isIsNonCurrentObjectAllowed() {
        return isNonCurrentObjectAllowed;
    }

    /**
     * Sets the value of the isNonCurrentObjectAllowed property.
     * 
     */
    public void setIsNonCurrentObjectAllowed(boolean value) {
        this.isNonCurrentObjectAllowed = value;
    }

}

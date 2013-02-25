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
 * <p>Java class for CheckinProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckinProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="deleteLocalFileHint" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="makeCurrent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="checkinOnlyVDMRoot" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckinProfile")
public class CheckinProfile
    extends Profile
{

    @XmlAttribute(name = "deleteLocalFileHint", required = true)
    protected boolean deleteLocalFileHint;
    @XmlAttribute(name = "makeCurrent", required = true)
    protected boolean makeCurrent;
    @XmlAttribute(name = "checkinOnlyVDMRoot", required = true)
    protected boolean checkinOnlyVDMRoot;

    /**
     * Gets the value of the deleteLocalFileHint property.
     * 
     */
    public boolean isDeleteLocalFileHint() {
        return deleteLocalFileHint;
    }

    /**
     * Sets the value of the deleteLocalFileHint property.
     * 
     */
    public void setDeleteLocalFileHint(boolean value) {
        this.deleteLocalFileHint = value;
    }

    /**
     * Gets the value of the makeCurrent property.
     * 
     */
    public boolean isMakeCurrent() {
        return makeCurrent;
    }

    /**
     * Sets the value of the makeCurrent property.
     * 
     */
    public void setMakeCurrent(boolean value) {
        this.makeCurrent = value;
    }

    /**
     * Gets the value of the checkinOnlyVDMRoot property.
     * 
     */
    public boolean isCheckinOnlyVDMRoot() {
        return checkinOnlyVDMRoot;
    }

    /**
     * Sets the value of the checkinOnlyVDMRoot property.
     * 
     */
    public void setCheckinOnlyVDMRoot(boolean value) {
        this.checkinOnlyVDMRoot = value;
    }

}

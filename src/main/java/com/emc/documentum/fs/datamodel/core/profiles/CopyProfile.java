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
 * <p>Java class for CopyProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopyProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="nonCurrentObjectAllowed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="deepCopyFolders" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="copyOnlyVDMRoot" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="leaveAssemblies" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="leaveRelationships" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="copyChildrenAsReferences" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyProfile")
public class CopyProfile
    extends Profile
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "nonCurrentObjectAllowed", required = true)
    protected boolean nonCurrentObjectAllowed;
    @XmlAttribute(name = "deepCopyFolders", required = true)
    protected boolean deepCopyFolders;
    @XmlAttribute(name = "copyOnlyVDMRoot", required = true)
    protected boolean copyOnlyVDMRoot;
    @XmlAttribute(name = "leaveAssemblies", required = true)
    protected boolean leaveAssemblies;
    @XmlAttribute(name = "leaveRelationships", required = true)
    protected boolean leaveRelationships;
    @XmlAttribute(name = "copyChildrenAsReferences", required = true)
    protected boolean copyChildrenAsReferences;

    /**
     * Gets the value of the nonCurrentObjectAllowed property.
     * 
     */
    public boolean isNonCurrentObjectAllowed() {
        return nonCurrentObjectAllowed;
    }

    /**
     * Sets the value of the nonCurrentObjectAllowed property.
     * 
     */
    public void setNonCurrentObjectAllowed(boolean value) {
        this.nonCurrentObjectAllowed = value;
    }

    /**
     * Gets the value of the deepCopyFolders property.
     * 
     */
    public boolean isDeepCopyFolders() {
        return deepCopyFolders;
    }

    /**
     * Sets the value of the deepCopyFolders property.
     * 
     */
    public void setDeepCopyFolders(boolean value) {
        this.deepCopyFolders = value;
    }

    /**
     * Gets the value of the copyOnlyVDMRoot property.
     * 
     */
    public boolean isCopyOnlyVDMRoot() {
        return copyOnlyVDMRoot;
    }

    /**
     * Sets the value of the copyOnlyVDMRoot property.
     * 
     */
    public void setCopyOnlyVDMRoot(boolean value) {
        this.copyOnlyVDMRoot = value;
    }

    /**
     * Gets the value of the leaveAssemblies property.
     * 
     */
    public boolean isLeaveAssemblies() {
        return leaveAssemblies;
    }

    /**
     * Sets the value of the leaveAssemblies property.
     * 
     */
    public void setLeaveAssemblies(boolean value) {
        this.leaveAssemblies = value;
    }

    /**
     * Gets the value of the leaveRelationships property.
     * 
     */
    public boolean isLeaveRelationships() {
        return leaveRelationships;
    }

    /**
     * Sets the value of the leaveRelationships property.
     * 
     */
    public void setLeaveRelationships(boolean value) {
        this.leaveRelationships = value;
    }

    /**
     * Gets the value of the copyChildrenAsReferences property.
     * 
     */
    public boolean isCopyChildrenAsReferences() {
        return copyChildrenAsReferences;
    }

    /**
     * Sets the value of the copyChildrenAsReferences property.
     * 
     */
    public void setCopyChildrenAsReferences(boolean value) {
        this.copyChildrenAsReferences = value;
    }

}


package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.PermissionType;


/**
 * <p>Java class for PermissionProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="permissionTypeFilter" type="{http://profiles.core.datamodel.fs.documentum.emc.com/}PermissionTypeFilter" />
 *       &lt;attribute name="permissionType" type="{http://core.datamodel.fs.documentum.emc.com/}PermissionType" />
 *       &lt;attribute name="isUseCompoundPermissions" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionProfile")
public class PermissionProfile
    extends Profile
{

    @XmlAttribute(name = "permissionTypeFilter")
    protected PermissionTypeFilter permissionTypeFilter;
    @XmlAttribute(name = "permissionType")
    protected PermissionType permissionType;
    @XmlAttribute(name = "isUseCompoundPermissions", required = true)
    protected boolean isUseCompoundPermissions;

    /**
     * Gets the value of the permissionTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionTypeFilter }
     *     
     */
    public PermissionTypeFilter getPermissionTypeFilter() {
        return permissionTypeFilter;
    }

    /**
     * Sets the value of the permissionTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionTypeFilter }
     *     
     */
    public void setPermissionTypeFilter(PermissionTypeFilter value) {
        this.permissionTypeFilter = value;
    }

    /**
     * Gets the value of the permissionType property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionType }
     *     
     */
    public PermissionType getPermissionType() {
        return permissionType;
    }

    /**
     * Sets the value of the permissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionType }
     *     
     */
    public void setPermissionType(PermissionType value) {
        this.permissionType = value;
    }

    /**
     * Gets the value of the isUseCompoundPermissions property.
     * 
     */
    public boolean isIsUseCompoundPermissions() {
        return isUseCompoundPermissions;
    }

    /**
     * Sets the value of the isUseCompoundPermissions property.
     * 
     */
    public void setIsUseCompoundPermissions(boolean value) {
        this.isUseCompoundPermissions = value;
    }

}

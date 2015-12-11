
package com.emc.documentum.fs.services.core.acl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.acl.AclPackage;


/**
 * <p>Java class for create complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="create">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aclPackage" type="{http://acl.core.datamodel.fs.documentum.emc.com/}AclPackage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create", propOrder = {
    "aclPackage"
})
public class Create {

    protected AclPackage aclPackage;

    /**
     * Gets the value of the aclPackage property.
     * 
     * @return
     *     possible object is
     *     {@link AclPackage }
     *     
     */
    public AclPackage getAclPackage() {
        return aclPackage;
    }

    /**
     * Sets the value of the aclPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclPackage }
     *     
     */
    public void setAclPackage(AclPackage value) {
        this.aclPackage = value;
    }

}

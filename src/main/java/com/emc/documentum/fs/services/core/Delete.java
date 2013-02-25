/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.services.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.ObjectIdentitySet;
import com.emc.documentum.fs.datamodel.core.OperationOptions;


/**
 * <p>Java class for delete complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectsToDelete" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectIdentitySet" minOccurs="0"/>
 *         &lt;element name="options" type="{http://core.datamodel.fs.documentum.emc.com/}OperationOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delete", propOrder = {
    "objectsToDelete",
    "options"
})
public class Delete {

    protected ObjectIdentitySet objectsToDelete;
    protected OperationOptions options;

    /**
     * Gets the value of the objectsToDelete property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentitySet }
     *     
     */
    public ObjectIdentitySet getObjectsToDelete() {
        return objectsToDelete;
    }

    /**
     * Sets the value of the objectsToDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentitySet }
     *     
     */
    public void setObjectsToDelete(ObjectIdentitySet value) {
        this.objectsToDelete = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link OperationOptions }
     *     
     */
    public OperationOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationOptions }
     *     
     */
    public void setOptions(OperationOptions value) {
        this.options = value;
    }

}

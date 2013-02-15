/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.services.core;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.DataPackage;
import com.emc.documentum.fs.datamodel.core.ObjectIdentitySet;
import com.emc.documentum.fs.datamodel.core.ObjectLocation;
import com.emc.documentum.fs.datamodel.core.OperationOptions;


/**
 * <p>Java class for copy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="copy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromObjects" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectIdentitySet" minOccurs="0"/>
 *         &lt;element name="targetLocation" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectLocation" minOccurs="0"/>
 *         &lt;element name="modifyObjects" type="{http://core.datamodel.fs.documentum.emc.com/}DataPackage" minOccurs="0"/>
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
@XmlType(name = "copy", propOrder = {
    "fromObjects",
    "targetLocation",
    "modifyObjects",
    "options"
})
@XmlRootElement(name = "copy")
public class Copy
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ObjectIdentitySet fromObjects;
    protected ObjectLocation targetLocation;
    protected DataPackage modifyObjects;
    protected OperationOptions options;

    /**
     * Gets the value of the fromObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentitySet }
     *     
     */
    public ObjectIdentitySet getFromObjects() {
        return fromObjects;
    }

    /**
     * Sets the value of the fromObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentitySet }
     *     
     */
    public void setFromObjects(ObjectIdentitySet value) {
        this.fromObjects = value;
    }

    /**
     * Gets the value of the targetLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectLocation }
     *     
     */
    public ObjectLocation getTargetLocation() {
        return targetLocation;
    }

    /**
     * Sets the value of the targetLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectLocation }
     *     
     */
    public void setTargetLocation(ObjectLocation value) {
        this.targetLocation = value;
    }

    /**
     * Gets the value of the modifyObjects property.
     * 
     * @return
     *     possible object is
     *     {@link DataPackage }
     *     
     */
    public DataPackage getModifyObjects() {
        return modifyObjects;
    }

    /**
     * Sets the value of the modifyObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPackage }
     *     
     */
    public void setModifyObjects(DataPackage value) {
        this.modifyObjects = value;
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

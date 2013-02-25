/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectRelationship">
 *   &lt;complexContent>
 *     &lt;extension base="{http://core.datamodel.fs.documentum.emc.com/}Relationship">
 *       &lt;sequence>
 *         &lt;element name="Target" type="{http://core.datamodel.fs.documentum.emc.com/}DataObject"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectRelationship", propOrder = {
    "target"
})
public class ObjectRelationship
    extends Relationship
{

    @XmlElement(name = "Target", required = true)
    protected DataObject target;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link DataObject }
     *     
     */
    public DataObject getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObject }
     *     
     */
    public void setTarget(DataObject value) {
        this.target = value;
    }

}

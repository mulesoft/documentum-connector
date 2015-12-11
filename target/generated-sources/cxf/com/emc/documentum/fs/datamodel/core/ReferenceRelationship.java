
package com.emc.documentum.fs.datamodel.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceRelationship">
 *   &lt;complexContent>
 *     &lt;extension base="{http://core.datamodel.fs.documentum.emc.com/}Relationship">
 *       &lt;sequence>
 *         &lt;element name="Target" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectIdentity"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceRelationship", propOrder = {
    "target"
})
public class ReferenceRelationship
    extends Relationship
{

    @XmlElement(name = "Target", required = true)
    protected ObjectIdentity target;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentity }
     *     
     */
    public ObjectIdentity getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentity }
     *     
     */
    public void setTarget(ObjectIdentity value) {
        this.target = value;
    }

}

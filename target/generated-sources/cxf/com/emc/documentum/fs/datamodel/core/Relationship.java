
package com.emc.documentum.fs.datamodel.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.properties.PropertySet;


/**
 * <p>Java class for Relationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelationshipProperties" type="{http://properties.core.datamodel.fs.documentum.emc.com/}PropertySet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetRole" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="intentModifier" type="{http://core.datamodel.fs.documentum.emc.com/}RelationshipIntentModifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relationship", propOrder = {
    "relationshipProperties"
})
@XmlSeeAlso({
    ObjectRelationship.class,
    ReferenceRelationship.class
})
public abstract class Relationship {

    @XmlElement(name = "RelationshipProperties")
    protected PropertySet relationshipProperties;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "targetRole", required = true)
    protected String targetRole;
    @XmlAttribute(name = "intentModifier")
    protected RelationshipIntentModifier intentModifier;

    /**
     * Gets the value of the relationshipProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySet }
     *     
     */
    public PropertySet getRelationshipProperties() {
        return relationshipProperties;
    }

    /**
     * Sets the value of the relationshipProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySet }
     *     
     */
    public void setRelationshipProperties(PropertySet value) {
        this.relationshipProperties = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the targetRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetRole() {
        return targetRole;
    }

    /**
     * Sets the value of the targetRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetRole(String value) {
        this.targetRole = value;
    }

    /**
     * Gets the value of the intentModifier property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipIntentModifier }
     *     
     */
    public RelationshipIntentModifier getIntentModifier() {
        return intentModifier;
    }

    /**
     * Sets the value of the intentModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipIntentModifier }
     *     
     */
    public void setIntentModifier(RelationshipIntentModifier value) {
        this.intentModifier = value;
    }

}

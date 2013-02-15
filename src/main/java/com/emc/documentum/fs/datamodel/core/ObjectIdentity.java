/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ObjectId" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectId"/>
 *           &lt;element name="ObjectKey" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectKey"/>
 *           &lt;element name="ObjectPath" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectPath"/>
 *           &lt;element name="Qualification" type="{http://core.datamodel.fs.documentum.emc.com/}Qualification"/>
 *           &lt;element name="CompositeObjectId" type="{http://core.datamodel.fs.documentum.emc.com/}CompositeObjectId"/>
 *           &lt;element name="StringUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="valueType" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectIdentityType" />
 *       &lt;attribute name="repositoryName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectIdentity", propOrder = {
    "stringUri",
    "compositeObjectId",
    "qualification",
    "objectPath",
    "objectKey",
    "objectId"
})
public class ObjectIdentity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StringUri")
    protected String stringUri;
    @XmlElement(name = "CompositeObjectId")
    protected CompositeObjectId compositeObjectId;
    @XmlElement(name = "Qualification")
    protected Qualification qualification;
    @XmlElement(name = "ObjectPath")
    protected ObjectPath objectPath;
    @XmlElement(name = "ObjectKey")
    protected ObjectKey objectKey;
    @XmlElement(name = "ObjectId")
    protected ObjectId objectId;
    @XmlAttribute(name = "valueType")
    protected ObjectIdentityType valueType;
    @XmlAttribute(name = "repositoryName")
    protected String repositoryName;

    /**
     * Gets the value of the stringUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringUri() {
        return stringUri;
    }

    /**
     * Sets the value of the stringUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringUri(String value) {
        this.stringUri = value;
    }

    /**
     * Gets the value of the compositeObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link CompositeObjectId }
     *     
     */
    public CompositeObjectId getCompositeObjectId() {
        return compositeObjectId;
    }

    /**
     * Sets the value of the compositeObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeObjectId }
     *     
     */
    public void setCompositeObjectId(CompositeObjectId value) {
        this.compositeObjectId = value;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link Qualification }
     *     
     */
    public Qualification getQualification() {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Qualification }
     *     
     */
    public void setQualification(Qualification value) {
        this.qualification = value;
    }

    /**
     * Gets the value of the objectPath property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectPath }
     *     
     */
    public ObjectPath getObjectPath() {
        return objectPath;
    }

    /**
     * Sets the value of the objectPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectPath }
     *     
     */
    public void setObjectPath(ObjectPath value) {
        this.objectPath = value;
    }

    /**
     * Gets the value of the objectKey property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectKey }
     *     
     */
    public ObjectKey getObjectKey() {
        return objectKey;
    }

    /**
     * Sets the value of the objectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectKey }
     *     
     */
    public void setObjectKey(ObjectKey value) {
        this.objectKey = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectId }
     *     
     */
    public ObjectId getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectId }
     *     
     */
    public void setObjectId(ObjectId value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentityType }
     *     
     */
    public ObjectIdentityType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentityType }
     *     
     */
    public void setValueType(ObjectIdentityType value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the repositoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * Sets the value of the repositoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryName(String value) {
        this.repositoryName = value;
    }

}

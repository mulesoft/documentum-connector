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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.content.Content;
import com.emc.documentum.fs.datamodel.core.properties.PropertySet;


/**
 * <p>Java class for DataObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aspects" type="{http://core.datamodel.fs.documentum.emc.com/}Aspect" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Identity" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectIdentity" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://properties.core.datamodel.fs.documentum.emc.com/}PropertySet" minOccurs="0"/>
 *         &lt;element name="Relationships" type="{http://core.datamodel.fs.documentum.emc.com/}Relationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contents" type="{http://content.core.datamodel.fs.documentum.emc.com/}Content" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Permissions" type="{http://core.datamodel.fs.documentum.emc.com/}Permission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transientId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataObject", propOrder = {
    "aspects",
    "identity",
    "properties",
    "relationships",
    "contents",
    "permissions"
})
public class DataObject
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Aspects")
    protected List<Aspect> aspects;
    @XmlElement(name = "Identity")
    protected ObjectIdentity identity;
    @XmlElement(name = "Properties")
    protected PropertySet properties;
    @XmlElement(name = "Relationships")
    protected List<Relationship> relationships;
    @XmlElement(name = "Contents")
    protected List<Content> contents;
    @XmlElement(name = "Permissions")
    protected List<Permission> permissions;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "transientId")
    protected String transientId;

    /**
     * Gets the value of the aspects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aspects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAspects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aspect }
     * 
     * 
     */
    public List<Aspect> getAspects() {
        if (aspects == null) {
            aspects = new ArrayList<Aspect>();
        }
        return this.aspects;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentity }
     *     
     */
    public ObjectIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentity }
     *     
     */
    public void setIdentity(ObjectIdentity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySet }
     *     
     */
    public PropertySet getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySet }
     *     
     */
    public void setProperties(PropertySet value) {
        this.properties = value;
    }

    /**
     * Gets the value of the relationships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Relationship }
     * 
     * 
     */
    public List<Relationship> getRelationships() {
        if (relationships == null) {
            relationships = new ArrayList<Relationship>();
        }
        return this.relationships;
    }

    /**
     * Gets the value of the contents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Content }
     * 
     * 
     */
    public List<Content> getContents() {
        if (contents == null) {
            contents = new ArrayList<Content>();
        }
        return this.contents;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Permission }
     * 
     * 
     */
    public List<Permission> getPermissions() {
        if (permissions == null) {
            permissions = new ArrayList<Permission>();
        }
        return this.permissions;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the transientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransientId() {
        return transientId;
    }

    /**
     * Sets the value of the transientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransientId(String value) {
        this.transientId = value;
    }

}

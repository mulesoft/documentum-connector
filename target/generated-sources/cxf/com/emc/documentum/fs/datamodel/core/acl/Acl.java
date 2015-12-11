
package com.emc.documentum.fs.datamodel.core.acl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Acl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Acl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identity" type="{http://acl.core.datamodel.fs.documentum.emc.com/}AclIdentity" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemCreated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Type" type="{http://acl.core.datamodel.fs.documentum.emc.com/}AclType" minOccurs="0"/>
 *         &lt;element name="Visibility" type="{http://acl.core.datamodel.fs.documentum.emc.com/}AclVisibility" minOccurs="0"/>
 *         &lt;element name="entries" type="{http://acl.core.datamodel.fs.documentum.emc.com/}AclEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acl", propOrder = {
    "identity",
    "description",
    "systemCreated",
    "type",
    "visibility",
    "entries"
})
public class Acl {

    @XmlElement(name = "Identity")
    protected AclIdentity identity;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SystemCreated")
    protected boolean systemCreated;
    @XmlElement(name = "Type")
    protected AclType type;
    @XmlElement(name = "Visibility")
    protected AclVisibility visibility;
    protected List<AclEntry> entries;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link AclIdentity }
     *     
     */
    public AclIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclIdentity }
     *     
     */
    public void setIdentity(AclIdentity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the systemCreated property.
     * 
     */
    public boolean isSystemCreated() {
        return systemCreated;
    }

    /**
     * Sets the value of the systemCreated property.
     * 
     */
    public void setSystemCreated(boolean value) {
        this.systemCreated = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AclType }
     *     
     */
    public AclType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclType }
     *     
     */
    public void setType(AclType value) {
        this.type = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link AclVisibility }
     *     
     */
    public AclVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclVisibility }
     *     
     */
    public void setVisibility(AclVisibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AclEntry }
     * 
     * 
     */
    public List<AclEntry> getEntries() {
        if (entries == null) {
            entries = new ArrayList<AclEntry>();
        }
        return this.entries;
    }

}

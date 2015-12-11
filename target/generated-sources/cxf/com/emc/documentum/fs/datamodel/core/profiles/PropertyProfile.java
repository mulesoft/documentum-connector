
package com.emc.documentum.fs.datamodel.core.profiles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *         &lt;element name="IncludeProperties" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcludeProperties" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="filterMode" type="{http://profiles.core.datamodel.fs.documentum.emc.com/}PropertyFilterMode" />
 *       &lt;attribute name="isProcessIncludedUnknown" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyProfile", propOrder = {
    "includeProperties",
    "excludeProperties"
})
public class PropertyProfile
    extends Profile
{

    @XmlElement(name = "IncludeProperties")
    protected List<String> includeProperties;
    @XmlElement(name = "ExcludeProperties")
    protected List<String> excludeProperties;
    @XmlAttribute(name = "filterMode")
    protected PropertyFilterMode filterMode;
    @XmlAttribute(name = "isProcessIncludedUnknown", required = true)
    protected boolean isProcessIncludedUnknown;

    /**
     * Gets the value of the includeProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludeProperties() {
        if (includeProperties == null) {
            includeProperties = new ArrayList<String>();
        }
        return this.includeProperties;
    }

    /**
     * Gets the value of the excludeProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeProperties() {
        if (excludeProperties == null) {
            excludeProperties = new ArrayList<String>();
        }
        return this.excludeProperties;
    }

    /**
     * Gets the value of the filterMode property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyFilterMode }
     *     
     */
    public PropertyFilterMode getFilterMode() {
        return filterMode;
    }

    /**
     * Sets the value of the filterMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyFilterMode }
     *     
     */
    public void setFilterMode(PropertyFilterMode value) {
        this.filterMode = value;
    }

    /**
     * Gets the value of the isProcessIncludedUnknown property.
     * 
     */
    public boolean isIsProcessIncludedUnknown() {
        return isProcessIncludedUnknown;
    }

    /**
     * Sets the value of the isProcessIncludedUnknown property.
     * 
     */
    public void setIsProcessIncludedUnknown(boolean value) {
        this.isProcessIncludedUnknown = value;
    }

}

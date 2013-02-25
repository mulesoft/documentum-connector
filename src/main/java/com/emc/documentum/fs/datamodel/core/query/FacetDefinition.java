/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.properties.PropertySet;


/**
 * <p>Java class for FacetDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacetDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://query.core.datamodel.fs.documentum.emc.com/}GroupingStrategy">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="facetSort" type="{http://query.core.datamodel.fs.documentum.emc.com/}FacetSort" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://properties.core.datamodel.fs.documentum.emc.com/}PropertySet" minOccurs="0"/>
 *         &lt;element name="subFacetDefinition" type="{http://query.core.datamodel.fs.documentum.emc.com/}FacetDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxFacetValues" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacetDefinition", propOrder = {
    "attributes",
    "facetSort",
    "properties",
    "subFacetDefinition"
})
public class FacetDefinition
    extends GroupingStrategy
{

    protected List<String> attributes;
    protected FacetSort facetSort;
    protected PropertySet properties;
    protected FacetDefinition subFacetDefinition;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "groupBy")
    protected String groupBy;
    @XmlAttribute(name = "maxFacetValues", required = true)
    protected int maxFacetValues;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<String>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the facetSort property.
     * 
     * @return
     *     possible object is
     *     {@link FacetSort }
     *     
     */
    public FacetSort getFacetSort() {
        return facetSort;
    }

    /**
     * Sets the value of the facetSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacetSort }
     *     
     */
    public void setFacetSort(FacetSort value) {
        this.facetSort = value;
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
     * Gets the value of the subFacetDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link FacetDefinition }
     *     
     */
    public FacetDefinition getSubFacetDefinition() {
        return subFacetDefinition;
    }

    /**
     * Sets the value of the subFacetDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacetDefinition }
     *     
     */
    public void setSubFacetDefinition(FacetDefinition value) {
        this.subFacetDefinition = value;
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
     * Gets the value of the groupBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupBy() {
        return groupBy;
    }

    /**
     * Sets the value of the groupBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupBy(String value) {
        this.groupBy = value;
    }

    /**
     * Gets the value of the maxFacetValues property.
     * 
     */
    public int getMaxFacetValues() {
        return maxFacetValues;
    }

    /**
     * Sets the value of the maxFacetValues property.
     * 
     */
    public void setMaxFacetValues(int value) {
        this.maxFacetValues = value;
    }

}

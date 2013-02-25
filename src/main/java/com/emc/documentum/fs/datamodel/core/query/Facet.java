/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.query;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Facet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Facet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://query.core.datamodel.fs.documentum.emc.com/}GroupingTree">
 *       &lt;sequence>
 *         &lt;element name="values" type="{http://query.core.datamodel.fs.documentum.emc.com/}FacetValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="facetDefinition" type="{http://query.core.datamodel.fs.documentum.emc.com/}FacetDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Facet", propOrder = {
    "values",
    "facetDefinition"
})
public class Facet
    extends GroupingTree
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<FacetValue> values;
    protected FacetDefinition facetDefinition;

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacetValue }
     * 
     * 
     */
    public List<FacetValue> getValues() {
        if (values == null) {
            values = new ArrayList<FacetValue>();
        }
        return this.values;
    }

    /**
     * Gets the value of the facetDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link FacetDefinition }
     *     
     */
    public FacetDefinition getFacetDefinition() {
        return facetDefinition;
    }

    /**
     * Sets the value of the facetDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacetDefinition }
     *     
     */
    public void setFacetDefinition(FacetDefinition value) {
        this.facetDefinition = value;
    }

}

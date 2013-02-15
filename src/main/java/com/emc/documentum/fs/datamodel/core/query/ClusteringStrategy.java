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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.properties.PropertySet;


/**
 * <p>Java class for ClusteringStrategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusteringStrategy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://query.core.datamodel.fs.documentum.emc.com/}GroupingStrategy">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tokenizers" type="{http://properties.core.datamodel.fs.documentum.emc.com/}PropertySet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="clusteringRange" type="{http://query.core.datamodel.fs.documentum.emc.com/}ClusteringRange" />
 *       &lt;attribute name="clusteringThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="strategyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="returnIdentitySet" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusteringStrategy", propOrder = {
    "attributes",
    "tokenizers"
})
public class ClusteringStrategy
    extends GroupingStrategy
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<String> attributes;
    protected PropertySet tokenizers;
    @XmlAttribute(name = "clusteringRange")
    protected ClusteringRange clusteringRange;
    @XmlAttribute(name = "clusteringThreshold", required = true)
    protected int clusteringThreshold;
    @XmlAttribute(name = "strategyName")
    protected String strategyName;
    @XmlAttribute(name = "returnIdentitySet", required = true)
    protected boolean returnIdentitySet;

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
     * Gets the value of the tokenizers property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySet }
     *     
     */
    public PropertySet getTokenizers() {
        return tokenizers;
    }

    /**
     * Sets the value of the tokenizers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySet }
     *     
     */
    public void setTokenizers(PropertySet value) {
        this.tokenizers = value;
    }

    /**
     * Gets the value of the clusteringRange property.
     * 
     * @return
     *     possible object is
     *     {@link ClusteringRange }
     *     
     */
    public ClusteringRange getClusteringRange() {
        return clusteringRange;
    }

    /**
     * Sets the value of the clusteringRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusteringRange }
     *     
     */
    public void setClusteringRange(ClusteringRange value) {
        this.clusteringRange = value;
    }

    /**
     * Gets the value of the clusteringThreshold property.
     * 
     */
    public int getClusteringThreshold() {
        return clusteringThreshold;
    }

    /**
     * Sets the value of the clusteringThreshold property.
     * 
     */
    public void setClusteringThreshold(int value) {
        this.clusteringThreshold = value;
    }

    /**
     * Gets the value of the strategyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyName() {
        return strategyName;
    }

    /**
     * Sets the value of the strategyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyName(String value) {
        this.strategyName = value;
    }

    /**
     * Gets the value of the returnIdentitySet property.
     * 
     */
    public boolean isReturnIdentitySet() {
        return returnIdentitySet;
    }

    /**
     * Sets the value of the returnIdentitySet property.
     * 
     */
    public void setReturnIdentitySet(boolean value) {
        this.returnIdentitySet = value;
    }

}

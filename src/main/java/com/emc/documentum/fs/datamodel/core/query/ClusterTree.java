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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterTree complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusterTree">
 *   &lt;complexContent>
 *     &lt;extension base="{http://query.core.datamodel.fs.documentum.emc.com/}GroupingTree">
 *       &lt;sequence>
 *         &lt;element name="Clusters" type="{http://query.core.datamodel.fs.documentum.emc.com/}Cluster" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Strategy" type="{http://query.core.datamodel.fs.documentum.emc.com/}ClusteringStrategy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterTree", propOrder = {
    "clusters",
    "strategy"
})
public class ClusterTree
    extends GroupingTree
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Clusters")
    protected List<Cluster> clusters;
    @XmlElement(name = "Strategy")
    protected ClusteringStrategy strategy;

    /**
     * Gets the value of the clusters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cluster }
     * 
     * 
     */
    public List<Cluster> getClusters() {
        if (clusters == null) {
            clusters = new ArrayList<Cluster>();
        }
        return this.clusters;
    }

    /**
     * Gets the value of the strategy property.
     * 
     * @return
     *     possible object is
     *     {@link ClusteringStrategy }
     *     
     */
    public ClusteringStrategy getStrategy() {
        return strategy;
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusteringStrategy }
     *     
     */
    public void setStrategy(ClusteringStrategy value) {
        this.strategy = value;
    }

}

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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.ObjectIdentitySet;


/**
 * <p>Java class for Cluster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cluster">
 *   &lt;complexContent>
 *     &lt;extension base="{http://query.core.datamodel.fs.documentum.emc.com/}Grouping">
 *       &lt;sequence>
 *         &lt;element name="clusterValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClusterObjectsIdentities" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectIdentitySet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="clusterSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cluster", propOrder = {
    "clusterValues",
    "clusterObjectsIdentities"
})
public class Cluster
    extends Grouping
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<String> clusterValues;
    @XmlElement(name = "ClusterObjectsIdentities")
    protected ObjectIdentitySet clusterObjectsIdentities;
    @XmlAttribute(name = "clusterSize", required = true)
    protected int clusterSize;

    /**
     * Gets the value of the clusterValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusterValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClusterValues() {
        if (clusterValues == null) {
            clusterValues = new ArrayList<String>();
        }
        return this.clusterValues;
    }

    /**
     * Gets the value of the clusterObjectsIdentities property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentitySet }
     *     
     */
    public ObjectIdentitySet getClusterObjectsIdentities() {
        return clusterObjectsIdentities;
    }

    /**
     * Sets the value of the clusterObjectsIdentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentitySet }
     *     
     */
    public void setClusterObjectsIdentities(ObjectIdentitySet value) {
        this.clusterObjectsIdentities = value;
    }

    /**
     * Gets the value of the clusterSize property.
     * 
     */
    public int getClusterSize() {
        return clusterSize;
    }

    /**
     * Sets the value of the clusterSize property.
     * 
     */
    public void setClusterSize(int value) {
        this.clusterSize = value;
    }

}

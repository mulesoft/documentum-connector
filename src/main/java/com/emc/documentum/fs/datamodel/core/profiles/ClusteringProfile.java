/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.profiles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.query.ClusteringStrategy;


/**
 * <p>Java class for ClusteringProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusteringProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *         &lt;element name="ClusteringStrategies" type="{http://query.core.datamodel.fs.documentum.emc.com/}ClusteringStrategy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusteringProfile", propOrder = {
    "clusteringStrategies"
})
public class ClusteringProfile
    extends Profile
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClusteringStrategies")
    protected List<ClusteringStrategy> clusteringStrategies;

    /**
     * Gets the value of the clusteringStrategies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusteringStrategies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusteringStrategies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusteringStrategy }
     * 
     * 
     */
    public List<ClusteringStrategy> getClusteringStrategies() {
        if (clusteringStrategies == null) {
            clusteringStrategies = new ArrayList<ClusteringStrategy>();
        }
        return this.clusteringStrategies;
    }

}

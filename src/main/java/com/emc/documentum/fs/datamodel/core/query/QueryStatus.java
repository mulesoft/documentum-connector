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


/**
 * <p>Java class for QueryStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RepositoryStatusInfos" type="{http://query.core.datamodel.fs.documentum.emc.com/}RepositoryStatusInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hasMoreResults" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isCompleted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryStatus", propOrder = {
    "repositoryStatusInfos"
})
public class QueryStatus
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RepositoryStatusInfos")
    protected List<RepositoryStatusInfo> repositoryStatusInfos;
    @XmlAttribute(name = "hasMoreResults", required = true)
    protected boolean hasMoreResults;
    @XmlAttribute(name = "isCompleted", required = true)
    protected boolean isCompleted;

    /**
     * Gets the value of the repositoryStatusInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repositoryStatusInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepositoryStatusInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepositoryStatusInfo }
     * 
     * 
     */
    public List<RepositoryStatusInfo> getRepositoryStatusInfos() {
        if (repositoryStatusInfos == null) {
            repositoryStatusInfos = new ArrayList<RepositoryStatusInfo>();
        }
        return this.repositoryStatusInfos;
    }

    /**
     * Gets the value of the hasMoreResults property.
     * 
     */
    public boolean isHasMoreResults() {
        return hasMoreResults;
    }

    /**
     * Sets the value of the hasMoreResults property.
     * 
     */
    public void setHasMoreResults(boolean value) {
        this.hasMoreResults = value;
    }

    /**
     * Gets the value of the isCompleted property.
     * 
     */
    public boolean isIsCompleted() {
        return isCompleted;
    }

    /**
     * Sets the value of the isCompleted property.
     * 
     */
    public void setIsCompleted(boolean value) {
        this.isCompleted = value;
    }

}

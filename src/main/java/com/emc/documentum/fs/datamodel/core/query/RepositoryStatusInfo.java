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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepositoryStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepositoryStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://query.core.datamodel.fs.documentum.emc.com/}Status" />
 *       &lt;attribute name="detailedStatus" type="{http://query.core.datamodel.fs.documentum.emc.com/}RepositoryStatus" />
 *       &lt;attribute name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hitCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="resultsCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="hasMoreResults" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isFacetRetrieved" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isFacetResultsTruncated" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryStatusInfo", propOrder = {
    "errorTrace"
})
public class RepositoryStatusInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String errorTrace;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "status")
    protected Status status;
    @XmlAttribute(name = "detailedStatus")
    protected RepositoryStatus detailedStatus;
    @XmlAttribute(name = "errorMessage")
    protected String errorMessage;
    @XmlAttribute(name = "hitCount", required = true)
    protected int hitCount;
    @XmlAttribute(name = "resultsCount", required = true)
    protected int resultsCount;
    @XmlAttribute(name = "hasMoreResults", required = true)
    protected boolean hasMoreResults;
    @XmlAttribute(name = "isFacetRetrieved", required = true)
    protected boolean isFacetRetrieved;
    @XmlAttribute(name = "isFacetResultsTruncated", required = true)
    protected boolean isFacetResultsTruncated;

    /**
     * Gets the value of the errorTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorTrace() {
        return errorTrace;
    }

    /**
     * Sets the value of the errorTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorTrace(String value) {
        this.errorTrace = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the detailedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryStatus }
     *     
     */
    public RepositoryStatus getDetailedStatus() {
        return detailedStatus;
    }

    /**
     * Sets the value of the detailedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryStatus }
     *     
     */
    public void setDetailedStatus(RepositoryStatus value) {
        this.detailedStatus = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the hitCount property.
     * 
     */
    public int getHitCount() {
        return hitCount;
    }

    /**
     * Sets the value of the hitCount property.
     * 
     */
    public void setHitCount(int value) {
        this.hitCount = value;
    }

    /**
     * Gets the value of the resultsCount property.
     * 
     */
    public int getResultsCount() {
        return resultsCount;
    }

    /**
     * Sets the value of the resultsCount property.
     * 
     */
    public void setResultsCount(int value) {
        this.resultsCount = value;
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
     * Gets the value of the isFacetRetrieved property.
     * 
     */
    public boolean isIsFacetRetrieved() {
        return isFacetRetrieved;
    }

    /**
     * Sets the value of the isFacetRetrieved property.
     * 
     */
    public void setIsFacetRetrieved(boolean value) {
        this.isFacetRetrieved = value;
    }

    /**
     * Gets the value of the isFacetResultsTruncated property.
     * 
     */
    public boolean isIsFacetResultsTruncated() {
        return isFacetResultsTruncated;
    }

    /**
     * Sets the value of the isFacetResultsTruncated property.
     * 
     */
    public void setIsFacetResultsTruncated(boolean value) {
        this.isFacetResultsTruncated = value;
    }

}

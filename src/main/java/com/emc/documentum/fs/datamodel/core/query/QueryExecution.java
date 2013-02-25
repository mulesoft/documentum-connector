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
import com.emc.documentum.fs.datamodel.core.CacheStrategyType;


/**
 * <p>Java class for QueryExecution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryExecution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="queryId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startingIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="maxResultCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxResultPerSource" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cacheStrategyType" type="{http://core.datamodel.fs.documentum.emc.com/}CacheStrategyType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryExecution")
public class QueryExecution
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "queryId")
    protected String queryId;
    @XmlAttribute(name = "startingIndex", required = true)
    protected long startingIndex;
    @XmlAttribute(name = "maxResultCount", required = true)
    protected int maxResultCount;
    @XmlAttribute(name = "maxResultPerSource", required = true)
    protected int maxResultPerSource;
    @XmlAttribute(name = "cacheStrategyType")
    protected CacheStrategyType cacheStrategyType;

    /**
     * Gets the value of the queryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * Sets the value of the queryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryId(String value) {
        this.queryId = value;
    }

    /**
     * Gets the value of the startingIndex property.
     * 
     */
    public long getStartingIndex() {
        return startingIndex;
    }

    /**
     * Sets the value of the startingIndex property.
     * 
     */
    public void setStartingIndex(long value) {
        this.startingIndex = value;
    }

    /**
     * Gets the value of the maxResultCount property.
     * 
     */
    public int getMaxResultCount() {
        return maxResultCount;
    }

    /**
     * Sets the value of the maxResultCount property.
     * 
     */
    public void setMaxResultCount(int value) {
        this.maxResultCount = value;
    }

    /**
     * Gets the value of the maxResultPerSource property.
     * 
     */
    public int getMaxResultPerSource() {
        return maxResultPerSource;
    }

    /**
     * Sets the value of the maxResultPerSource property.
     * 
     */
    public void setMaxResultPerSource(int value) {
        this.maxResultPerSource = value;
    }

    /**
     * Gets the value of the cacheStrategyType property.
     * 
     * @return
     *     possible object is
     *     {@link CacheStrategyType }
     *     
     */
    public CacheStrategyType getCacheStrategyType() {
        return cacheStrategyType;
    }

    /**
     * Sets the value of the cacheStrategyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CacheStrategyType }
     *     
     */
    public void setCacheStrategyType(CacheStrategyType value) {
        this.cacheStrategyType = value;
    }

}

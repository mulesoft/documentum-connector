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
 * <p>Java class for RepositoryScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepositoryScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="repositoryName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locationPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isDescend" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isExcluded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryScope")
public class RepositoryScope
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "repositoryName")
    protected String repositoryName;
    @XmlAttribute(name = "locationPath")
    protected String locationPath;
    @XmlAttribute(name = "isDescend", required = true)
    protected boolean isDescend;
    @XmlAttribute(name = "isExcluded", required = true)
    protected boolean isExcluded;

    /**
     * Gets the value of the repositoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * Sets the value of the repositoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryName(String value) {
        this.repositoryName = value;
    }

    /**
     * Gets the value of the locationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationPath() {
        return locationPath;
    }

    /**
     * Sets the value of the locationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationPath(String value) {
        this.locationPath = value;
    }

    /**
     * Gets the value of the isDescend property.
     * 
     */
    public boolean isIsDescend() {
        return isDescend;
    }

    /**
     * Sets the value of the isDescend property.
     * 
     */
    public void setIsDescend(boolean value) {
        this.isDescend = value;
    }

    /**
     * Gets the value of the isExcluded property.
     * 
     */
    public boolean isIsExcluded() {
        return isExcluded;
    }

    /**
     * Sets the value of the isExcluded property.
     * 
     */
    public void setIsExcluded(boolean value) {
        this.isExcluded = value;
    }

}

/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identity" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectIdentity"/>
 *         &lt;element name="SymbolicLabels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isCurrent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NextMajorVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NextMinorVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NextBranchVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionInfo", propOrder = {
    "identity",
    "symbolicLabels"
})
public class VersionInfo {

    @XmlElement(name = "Identity", required = true)
    protected ObjectIdentity identity;
    @XmlElement(name = "SymbolicLabels")
    protected List<String> symbolicLabels;
    @XmlAttribute(name = "isCurrent", required = true)
    protected boolean isCurrent;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "NextMajorVersion")
    protected String nextMajorVersion;
    @XmlAttribute(name = "NextMinorVersion")
    protected String nextMinorVersion;
    @XmlAttribute(name = "NextBranchVersion")
    protected String nextBranchVersion;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentity }
     *     
     */
    public ObjectIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentity }
     *     
     */
    public void setIdentity(ObjectIdentity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the symbolicLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symbolicLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymbolicLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSymbolicLabels() {
        if (symbolicLabels == null) {
            symbolicLabels = new ArrayList<String>();
        }
        return this.symbolicLabels;
    }

    /**
     * Gets the value of the isCurrent property.
     * 
     */
    public boolean isIsCurrent() {
        return isCurrent;
    }

    /**
     * Sets the value of the isCurrent property.
     * 
     */
    public void setIsCurrent(boolean value) {
        this.isCurrent = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the nextMajorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextMajorVersion() {
        return nextMajorVersion;
    }

    /**
     * Sets the value of the nextMajorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextMajorVersion(String value) {
        this.nextMajorVersion = value;
    }

    /**
     * Gets the value of the nextMinorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextMinorVersion() {
        return nextMinorVersion;
    }

    /**
     * Sets the value of the nextMinorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextMinorVersion(String value) {
        this.nextMinorVersion = value;
    }

    /**
     * Gets the value of the nextBranchVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextBranchVersion() {
        return nextBranchVersion;
    }

    /**
     * Sets the value of the nextBranchVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextBranchVersion(String value) {
        this.nextBranchVersion = value;
    }

}

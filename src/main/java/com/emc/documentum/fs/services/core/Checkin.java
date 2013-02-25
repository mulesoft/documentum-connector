/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.services.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.DataPackage;
import com.emc.documentum.fs.datamodel.core.OperationOptions;
import com.emc.documentum.fs.datamodel.core.VersionStrategy;


/**
 * <p>Java class for checkin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataPackage" type="{http://core.datamodel.fs.documentum.emc.com/}DataPackage" minOccurs="0"/>
 *         &lt;element name="versionStrategy" type="{http://core.datamodel.fs.documentum.emc.com/}VersionStrategy" minOccurs="0"/>
 *         &lt;element name="isRetainLock" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="symbolicLabels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="options" type="{http://core.datamodel.fs.documentum.emc.com/}OperationOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkin", propOrder = {
    "dataPackage",
    "versionStrategy",
    "isRetainLock",
    "symbolicLabels",
    "options"
})
public class Checkin {

    protected DataPackage dataPackage;
    protected VersionStrategy versionStrategy;
    protected boolean isRetainLock;
    protected List<String> symbolicLabels;
    protected OperationOptions options;

    /**
     * Gets the value of the dataPackage property.
     * 
     * @return
     *     possible object is
     *     {@link DataPackage }
     *     
     */
    public DataPackage getDataPackage() {
        return dataPackage;
    }

    /**
     * Sets the value of the dataPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPackage }
     *     
     */
    public void setDataPackage(DataPackage value) {
        this.dataPackage = value;
    }

    /**
     * Gets the value of the versionStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link VersionStrategy }
     *     
     */
    public VersionStrategy getVersionStrategy() {
        return versionStrategy;
    }

    /**
     * Sets the value of the versionStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionStrategy }
     *     
     */
    public void setVersionStrategy(VersionStrategy value) {
        this.versionStrategy = value;
    }

    /**
     * Gets the value of the isRetainLock property.
     * 
     */
    public boolean isIsRetainLock() {
        return isRetainLock;
    }

    /**
     * Sets the value of the isRetainLock property.
     * 
     */
    public void setIsRetainLock(boolean value) {
        this.isRetainLock = value;
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
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link OperationOptions }
     *     
     */
    public OperationOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationOptions }
     *     
     */
    public void setOptions(OperationOptions value) {
        this.options = value;
    }

}

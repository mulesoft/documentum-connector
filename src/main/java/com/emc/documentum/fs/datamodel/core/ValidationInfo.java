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
 * <p>Java class for ValidationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataObject" type="{http://core.datamodel.fs.documentum.emc.com/}DataObject" minOccurs="0"/>
 *         &lt;element name="ValidationIssues" type="{http://core.datamodel.fs.documentum.emc.com/}ValidationIssue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isValid" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationInfo", propOrder = {
    "dataObject",
    "validationIssues"
})
public class ValidationInfo {

    @XmlElement(name = "DataObject")
    protected DataObject dataObject;
    @XmlElement(name = "ValidationIssues")
    protected List<ValidationIssue> validationIssues;
    @XmlAttribute(name = "isValid", required = true)
    protected boolean isValid;

    /**
     * Gets the value of the dataObject property.
     * 
     * @return
     *     possible object is
     *     {@link DataObject }
     *     
     */
    public DataObject getDataObject() {
        return dataObject;
    }

    /**
     * Sets the value of the dataObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObject }
     *     
     */
    public void setDataObject(DataObject value) {
        this.dataObject = value;
    }

    /**
     * Gets the value of the validationIssues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationIssues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationIssues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationIssue }
     * 
     * 
     */
    public List<ValidationIssue> getValidationIssues() {
        if (validationIssues == null) {
            validationIssues = new ArrayList<ValidationIssue>();
        }
        return this.validationIssues;
    }

    /**
     * Gets the value of the isValid property.
     * 
     */
    public boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     */
    public void setIsValid(boolean value) {
        this.isValid = value;
    }

}

/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.rt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exceptionBean" type="{http://rt.fs.documentum.emc.com/}DfsExceptionHolder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageArgs" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stackTraceAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceException", propOrder = {
    "exceptionBean",
    "message",
    "messageArgs",
    "messageId",
    "stackTraceAsString"
})
public class ServiceException {

    @XmlElement(nillable = true)
    protected List<DfsExceptionHolder> exceptionBean;
    protected String message;
    @XmlElement(nillable = true)
    protected List<Object> messageArgs;
    protected String messageId;
    protected String stackTraceAsString;

    /**
     * Gets the value of the exceptionBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DfsExceptionHolder }
     * 
     * 
     */
    public List<DfsExceptionHolder> getExceptionBean() {
        if (exceptionBean == null) {
            exceptionBean = new ArrayList<DfsExceptionHolder>();
        }
        return this.exceptionBean;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageArgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageArgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageArgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getMessageArgs() {
        if (messageArgs == null) {
            messageArgs = new ArrayList<Object>();
        }
        return this.messageArgs;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the stackTraceAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTraceAsString() {
        return stackTraceAsString;
    }

    /**
     * Sets the value of the stackTraceAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTraceAsString(String value) {
        this.stackTraceAsString = value;
    }

}

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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RichTextProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RichTextProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *         &lt;element name="ImageUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnchorUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="transferContent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RichTextProfile", propOrder = {
    "imageUrlTemplate",
    "anchorUrlTemplate"
})
public class RichTextProfile
    extends Profile
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ImageUrlTemplate")
    protected String imageUrlTemplate;
    @XmlElement(name = "AnchorUrlTemplate")
    protected String anchorUrlTemplate;
    @XmlAttribute(name = "transferContent", required = true)
    protected boolean transferContent;

    /**
     * Gets the value of the imageUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrlTemplate() {
        return imageUrlTemplate;
    }

    /**
     * Sets the value of the imageUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrlTemplate(String value) {
        this.imageUrlTemplate = value;
    }

    /**
     * Gets the value of the anchorUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchorUrlTemplate() {
        return anchorUrlTemplate;
    }

    /**
     * Sets the value of the anchorUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchorUrlTemplate(String value) {
        this.anchorUrlTemplate = value;
    }

    /**
     * Gets the value of the transferContent property.
     * 
     */
    public boolean isTransferContent() {
        return transferContent;
    }

    /**
     * Sets the value of the transferContent property.
     * 
     */
    public void setTransferContent(boolean value) {
        this.transferContent = value;
    }

}

/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="renditionType" type="{http://content.core.datamodel.fs.documentum.emc.com/}RenditionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="format" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pageModifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contentTransferMode" type="{http://content.core.datamodel.fs.documentum.emc.com/}ContentTransferMode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content", propOrder = {
    "renditionType"
})
@XmlSeeAlso({
    DataHandlerContent.class,
    BinaryContent.class,
    UcfContent.class,
    UrlContent.class
})
public abstract class Content {

    @XmlElement(nillable = true)
    protected RenditionType renditionType;
    @XmlAttribute(name = "format", required = true)
    protected String format;
    @XmlAttribute(name = "pageNumber", required = true)
    protected int pageNumber;
    @XmlAttribute(name = "pageModifier")
    protected String pageModifier;
    @XmlAttribute(name = "contentTransferMode")
    protected ContentTransferMode contentTransferMode;

    /**
     * Gets the value of the renditionType property.
     * 
     * @return
     *     possible object is
     *     {@link RenditionType }
     *     
     */
    public RenditionType getRenditionType() {
        return renditionType;
    }

    /**
     * Sets the value of the renditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenditionType }
     *     
     */
    public void setRenditionType(RenditionType value) {
        this.renditionType = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageModifier() {
        return pageModifier;
    }

    /**
     * Sets the value of the pageModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageModifier(String value) {
        this.pageModifier = value;
    }

    /**
     * Gets the value of the contentTransferMode property.
     * 
     * @return
     *     possible object is
     *     {@link ContentTransferMode }
     *     
     */
    public ContentTransferMode getContentTransferMode() {
        return contentTransferMode;
    }

    /**
     * Sets the value of the contentTransferMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTransferMode }
     *     
     */
    public void setContentTransferMode(ContentTransferMode value) {
        this.contentTransferMode = value;
    }

}

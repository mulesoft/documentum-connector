/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.content;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UcfContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UcfContent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://content.core.datamodel.fs.documentum.emc.com/}Content">
 *       &lt;sequence>
 *         &lt;element name="LocalFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActivityInfo" type="{http://content.core.datamodel.fs.documentum.emc.com/}ActivityInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UcfContent", propOrder = {
    "localFilePath",
    "activityInfo"
})
public class UcfContent
    extends Content
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LocalFilePath", required = true)
    protected String localFilePath;
    @XmlElement(name = "ActivityInfo")
    protected ActivityInfo activityInfo;

    /**
     * Gets the value of the localFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFilePath() {
        return localFilePath;
    }

    /**
     * Sets the value of the localFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFilePath(String value) {
        this.localFilePath = value;
    }

    /**
     * Gets the value of the activityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInfo }
     *     
     */
    public ActivityInfo getActivityInfo() {
        return activityInfo;
    }

    /**
     * Sets the value of the activityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInfo }
     *     
     */
    public void setActivityInfo(ActivityInfo value) {
        this.activityInfo = value;
    }

}

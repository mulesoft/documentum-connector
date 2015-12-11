
package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.content.ActivityInfo;
import com.emc.documentum.fs.datamodel.core.content.ContentTransferMode;


/**
 * <p>Java class for ContentTransferProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentTransferProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *         &lt;element name="ActivityInfo" type="{http://content.core.datamodel.fs.documentum.emc.com/}ActivityInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="transferMode" type="{http://content.core.datamodel.fs.documentum.emc.com/}ContentTransferMode" />
 *       &lt;attribute name="geolocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allowCachedContentTransfer" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="allowAsyncContentTransfer" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isProcessOLELinks" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="xmlApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentTransferProfile", propOrder = {
    "activityInfo"
})
public class ContentTransferProfile
    extends Profile
{

    @XmlElement(name = "ActivityInfo")
    protected ActivityInfo activityInfo;
    @XmlAttribute(name = "transferMode")
    protected ContentTransferMode transferMode;
    @XmlAttribute(name = "geolocation")
    protected String geolocation;
    @XmlAttribute(name = "allowCachedContentTransfer", required = true)
    protected boolean allowCachedContentTransfer;
    @XmlAttribute(name = "allowAsyncContentTransfer", required = true)
    protected boolean allowAsyncContentTransfer;
    @XmlAttribute(name = "isProcessOLELinks", required = true)
    protected boolean isProcessOLELinks;
    @XmlAttribute(name = "xmlApplicationName")
    protected String xmlApplicationName;

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

    /**
     * Gets the value of the transferMode property.
     * 
     * @return
     *     possible object is
     *     {@link ContentTransferMode }
     *     
     */
    public ContentTransferMode getTransferMode() {
        return transferMode;
    }

    /**
     * Sets the value of the transferMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTransferMode }
     *     
     */
    public void setTransferMode(ContentTransferMode value) {
        this.transferMode = value;
    }

    /**
     * Gets the value of the geolocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeolocation() {
        return geolocation;
    }

    /**
     * Sets the value of the geolocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeolocation(String value) {
        this.geolocation = value;
    }

    /**
     * Gets the value of the allowCachedContentTransfer property.
     * 
     */
    public boolean isAllowCachedContentTransfer() {
        return allowCachedContentTransfer;
    }

    /**
     * Sets the value of the allowCachedContentTransfer property.
     * 
     */
    public void setAllowCachedContentTransfer(boolean value) {
        this.allowCachedContentTransfer = value;
    }

    /**
     * Gets the value of the allowAsyncContentTransfer property.
     * 
     */
    public boolean isAllowAsyncContentTransfer() {
        return allowAsyncContentTransfer;
    }

    /**
     * Sets the value of the allowAsyncContentTransfer property.
     * 
     */
    public void setAllowAsyncContentTransfer(boolean value) {
        this.allowAsyncContentTransfer = value;
    }

    /**
     * Gets the value of the isProcessOLELinks property.
     * 
     */
    public boolean isIsProcessOLELinks() {
        return isProcessOLELinks;
    }

    /**
     * Sets the value of the isProcessOLELinks property.
     * 
     */
    public void setIsProcessOLELinks(boolean value) {
        this.isProcessOLELinks = value;
    }

    /**
     * Gets the value of the xmlApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlApplicationName() {
        return xmlApplicationName;
    }

    /**
     * Sets the value of the xmlApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlApplicationName(String value) {
        this.xmlApplicationName = value;
    }

}

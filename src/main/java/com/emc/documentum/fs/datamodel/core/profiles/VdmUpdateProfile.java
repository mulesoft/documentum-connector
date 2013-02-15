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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.VersionStrategy;


/**
 * <p>Java class for VdmUpdateProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VdmUpdateProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *         &lt;element name="Labels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versionStrategy" type="{http://core.datamodel.fs.documentum.emc.com/}VersionStrategy" />
 *       &lt;attribute name="retainLock" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="updateMethod" type="{http://profiles.core.datamodel.fs.documentum.emc.com/}ListUpdateMethod" />
 *       &lt;attribute name="convertToSimple" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VdmUpdateProfile", propOrder = {
    "labels"
})
public class VdmUpdateProfile
    extends Profile
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Labels")
    protected List<String> labels;
    @XmlAttribute(name = "versionStrategy")
    protected VersionStrategy versionStrategy;
    @XmlAttribute(name = "retainLock", required = true)
    protected boolean retainLock;
    @XmlAttribute(name = "updateMethod")
    protected ListUpdateMethod updateMethod;
    @XmlAttribute(name = "convertToSimple", required = true)
    protected boolean convertToSimple;

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLabels() {
        if (labels == null) {
            labels = new ArrayList<String>();
        }
        return this.labels;
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
     * Gets the value of the retainLock property.
     * 
     */
    public boolean isRetainLock() {
        return retainLock;
    }

    /**
     * Sets the value of the retainLock property.
     * 
     */
    public void setRetainLock(boolean value) {
        this.retainLock = value;
    }

    /**
     * Gets the value of the updateMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ListUpdateMethod }
     *     
     */
    public ListUpdateMethod getUpdateMethod() {
        return updateMethod;
    }

    /**
     * Sets the value of the updateMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListUpdateMethod }
     *     
     */
    public void setUpdateMethod(ListUpdateMethod value) {
        this.updateMethod = value;
    }

    /**
     * Gets the value of the convertToSimple property.
     * 
     */
    public boolean isConvertToSimple() {
        return convertToSimple;
    }

    /**
     * Sets the value of the convertToSimple property.
     * 
     */
    public void setConvertToSimple(boolean value) {
        this.convertToSimple = value;
    }

}

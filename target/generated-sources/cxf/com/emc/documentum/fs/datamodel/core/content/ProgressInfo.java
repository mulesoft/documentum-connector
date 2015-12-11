
package com.emc.documentum.fs.datamodel.core.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="providerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maximum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minimum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="progress" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="stepName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stepNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="indeterminate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressInfo")
public class ProgressInfo {

    @XmlAttribute(name = "providerName")
    protected String providerName;
    @XmlAttribute(name = "maximum", required = true)
    protected int maximum;
    @XmlAttribute(name = "minimum", required = true)
    protected int minimum;
    @XmlAttribute(name = "progress", required = true)
    protected int progress;
    @XmlAttribute(name = "stepName")
    protected String stepName;
    @XmlAttribute(name = "stepNumber", required = true)
    protected int stepNumber;
    @XmlAttribute(name = "indeterminate", required = true)
    protected boolean indeterminate;
    @XmlAttribute(name = "fileName")
    protected String fileName;

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     */
    public void setMaximum(int value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     */
    public void setMinimum(int value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the progress property.
     * 
     */
    public int getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     */
    public void setProgress(int value) {
        this.progress = value;
    }

    /**
     * Gets the value of the stepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * Sets the value of the stepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepName(String value) {
        this.stepName = value;
    }

    /**
     * Gets the value of the stepNumber property.
     * 
     */
    public int getStepNumber() {
        return stepNumber;
    }

    /**
     * Sets the value of the stepNumber property.
     * 
     */
    public void setStepNumber(int value) {
        this.stepNumber = value;
    }

    /**
     * Gets the value of the indeterminate property.
     * 
     */
    public boolean isIndeterminate() {
        return indeterminate;
    }

    /**
     * Sets the value of the indeterminate property.
     * 
     */
    public void setIndeterminate(boolean value) {
        this.indeterminate = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}

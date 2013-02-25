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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="sessionId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initiatorSessionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="activityId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="autoCloseConnection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="closed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="targetDeploymentId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initiatorDeploymentId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityInfo")
public class ActivityInfo {

    @XmlAttribute(name = "sessionId", required = true)
    protected String sessionId;
    @XmlAttribute(name = "initiatorSessionId")
    protected String initiatorSessionId;
    @XmlAttribute(name = "activityId", required = true)
    protected String activityId;
    @XmlAttribute(name = "autoCloseConnection", required = true)
    protected boolean autoCloseConnection;
    @XmlAttribute(name = "closed", required = true)
    protected boolean closed;
    @XmlAttribute(name = "targetDeploymentId")
    protected String targetDeploymentId;
    @XmlAttribute(name = "initiatorDeploymentId")
    protected String initiatorDeploymentId;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the initiatorSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorSessionId() {
        return initiatorSessionId;
    }

    /**
     * Sets the value of the initiatorSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorSessionId(String value) {
        this.initiatorSessionId = value;
    }

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityId(String value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the autoCloseConnection property.
     * 
     */
    public boolean isAutoCloseConnection() {
        return autoCloseConnection;
    }

    /**
     * Sets the value of the autoCloseConnection property.
     * 
     */
    public void setAutoCloseConnection(boolean value) {
        this.autoCloseConnection = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     */
    public void setClosed(boolean value) {
        this.closed = value;
    }

    /**
     * Gets the value of the targetDeploymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDeploymentId() {
        return targetDeploymentId;
    }

    /**
     * Sets the value of the targetDeploymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDeploymentId(String value) {
        this.targetDeploymentId = value;
    }

    /**
     * Gets the value of the initiatorDeploymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorDeploymentId() {
        return initiatorDeploymentId;
    }

    /**
     * Sets the value of the initiatorDeploymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorDeploymentId(String value) {
        this.initiatorDeploymentId = value;
    }

}

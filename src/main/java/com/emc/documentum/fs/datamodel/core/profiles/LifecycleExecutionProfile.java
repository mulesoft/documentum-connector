/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LifecycleExecutionProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifecycleExecutionProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="testOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="bypassEntryCriteria" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="resetToBase" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifecycleExecutionProfile")
public class LifecycleExecutionProfile
    extends Profile
{

    @XmlAttribute(name = "testOnly", required = true)
    protected boolean testOnly;
    @XmlAttribute(name = "bypassEntryCriteria", required = true)
    protected boolean bypassEntryCriteria;
    @XmlAttribute(name = "resetToBase", required = true)
    protected boolean resetToBase;

    /**
     * Gets the value of the testOnly property.
     * 
     */
    public boolean isTestOnly() {
        return testOnly;
    }

    /**
     * Sets the value of the testOnly property.
     * 
     */
    public void setTestOnly(boolean value) {
        this.testOnly = value;
    }

    /**
     * Gets the value of the bypassEntryCriteria property.
     * 
     */
    public boolean isBypassEntryCriteria() {
        return bypassEntryCriteria;
    }

    /**
     * Sets the value of the bypassEntryCriteria property.
     * 
     */
    public void setBypassEntryCriteria(boolean value) {
        this.bypassEntryCriteria = value;
    }

    /**
     * Gets the value of the resetToBase property.
     * 
     */
    public boolean isResetToBase() {
        return resetToBase;
    }

    /**
     * Sets the value of the resetToBase property.
     * 
     */
    public void setResetToBase(boolean value) {
        this.resetToBase = value;
    }

}

/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.profiles.Profile;
import com.emc.documentum.fs.datamodel.core.properties.PropertySet;


/**
 * <p>Java class for ServiceContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identities" type="{http://context.core.datamodel.fs.documentum.emc.com/}Identity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://profiles.core.datamodel.fs.documentum.emc.com/}Profile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RuntimeProperties" type="{http://properties.core.datamodel.fs.documentum.emc.com/}PropertySet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="token" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceContext", propOrder = {
    "identities",
    "profiles",
    "runtimeProperties"
})
@XmlRootElement(name = "ServiceContext")
public class ServiceContext
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Identities")
    protected List<Identity> identities;
    @XmlElement(name = "Profiles")
    protected List<Profile> profiles;
    @XmlElement(name = "RuntimeProperties")
    protected PropertySet runtimeProperties;
    @XmlAttribute(name = "token")
    protected String token;
    @XmlAttribute(name = "locale")
    protected String locale;

    /**
     * Gets the value of the identities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identity }
     * 
     * 
     */
    public List<Identity> getIdentities() {
        if (identities == null) {
            identities = new ArrayList<Identity>();
        }
        return this.identities;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Profile }
     * 
     * 
     */
    public List<Profile> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<Profile>();
        }
        return this.profiles;
    }

    /**
     * Gets the value of the runtimeProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySet }
     *     
     */
    public PropertySet getRuntimeProperties() {
        return runtimeProperties;
    }

    /**
     * Sets the value of the runtimeProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySet }
     *     
     */
    public void setRuntimeProperties(PropertySet value) {
        this.runtimeProperties = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

}

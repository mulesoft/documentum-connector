/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.properties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberArrayProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberArrayProperty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://properties.core.datamodel.fs.documentum.emc.com/}ArrayProperty">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Short" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *           &lt;element name="Integer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="Long" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="Double" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberArrayProperty", propOrder = {
    "shortsAndIntegersAndLongs"
})
public class NumberArrayProperty
    extends ArrayProperty
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "Long", type = Long.class, nillable = true),
        @XmlElement(name = "Double", type = Double.class, nillable = true),
        @XmlElement(name = "Short", type = Short.class, nillable = true),
        @XmlElement(name = "Integer", type = Integer.class, nillable = true)
    })
    protected List<Comparable> shortsAndIntegersAndLongs;

    /**
     * Gets the value of the shortsAndIntegersAndLongs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortsAndIntegersAndLongs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortsAndIntegersAndLongs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * {@link Double }
     * {@link Short }
     * {@link Integer }
     * 
     * 
     */
    public List<Comparable> getShortsAndIntegersAndLongs() {
        if (shortsAndIntegersAndLongs == null) {
            shortsAndIntegersAndLongs = new ArrayList<Comparable>();
        }
        return this.shortsAndIntegersAndLongs;
    }

}

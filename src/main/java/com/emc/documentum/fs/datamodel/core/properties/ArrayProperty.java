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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayProperty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://properties.core.datamodel.fs.documentum.emc.com/}Property">
 *       &lt;sequence>
 *         &lt;element name="ValueActions" type="{http://properties.core.datamodel.fs.documentum.emc.com/}ValueAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayProperty", propOrder = {
    "valueActions"
})
@XmlSeeAlso({
    ObjectIdArrayProperty.class,
    BooleanArrayProperty.class,
    StringArrayProperty.class,
    DateArrayProperty.class,
    NumberArrayProperty.class
})
public abstract class ArrayProperty
    extends Property
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValueActions")
    protected List<ValueAction> valueActions;

    /**
     * Gets the value of the valueActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueAction }
     * 
     * 
     */
    public List<ValueAction> getValueActions() {
        if (valueActions == null) {
            valueActions = new ArrayList<ValueAction>();
        }
        return this.valueActions;
    }

}

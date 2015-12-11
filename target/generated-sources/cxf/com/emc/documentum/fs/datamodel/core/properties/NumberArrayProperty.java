
package com.emc.documentum.fs.datamodel.core.properties;

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
    "shortOrIntegerOrLong"
})
public class NumberArrayProperty
    extends ArrayProperty
{

    @XmlElements({
        @XmlElement(name = "Short", type = Short.class, nillable = true),
        @XmlElement(name = "Integer", type = Integer.class, nillable = true),
        @XmlElement(name = "Long", type = Long.class, nillable = true),
        @XmlElement(name = "Double", type = Double.class, nillable = true)
    })
    protected List<Comparable> shortOrIntegerOrLong;

    /**
     * Gets the value of the shortOrIntegerOrLong property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortOrIntegerOrLong property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortOrIntegerOrLong().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Short }
     * {@link Integer }
     * {@link Long }
     * {@link Double }
     * 
     * 
     */
    public List<Comparable> getShortOrIntegerOrLong() {
        if (shortOrIntegerOrLong == null) {
            shortOrIntegerOrLong = new ArrayList<Comparable>();
        }
        return this.shortOrIntegerOrLong;
    }

}

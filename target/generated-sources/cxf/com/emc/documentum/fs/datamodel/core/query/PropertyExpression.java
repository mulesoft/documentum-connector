
package com.emc.documentum.fs.datamodel.core.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.schema.DataType;


/**
 * <p>Java class for PropertyExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://query.core.datamodel.fs.documentum.emc.com/}Expression">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://query.core.datamodel.fs.documentum.emc.com/}ExpressionValue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="condition" type="{http://query.core.datamodel.fs.documentum.emc.com/}Condition" />
 *       &lt;attribute name="dataType" type="{http://schema.core.datamodel.fs.documentum.emc.com/}DataType" />
 *       &lt;attribute name="isRepeated" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isCaseSensitive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyExpression", propOrder = {
    "value"
})
public class PropertyExpression
    extends Expression
{

    protected ExpressionValue value;
    @XmlAttribute(name = "property")
    protected String property;
    @XmlAttribute(name = "condition")
    protected Condition condition;
    @XmlAttribute(name = "dataType")
    protected DataType dataType;
    @XmlAttribute(name = "isRepeated")
    protected String isRepeated;
    @XmlAttribute(name = "isCaseSensitive", required = true)
    protected boolean isCaseSensitive;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionValue }
     *     
     */
    public ExpressionValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionValue }
     *     
     */
    public void setValue(ExpressionValue value) {
        this.value = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setCondition(Condition value) {
        this.condition = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the isRepeated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRepeated() {
        return isRepeated;
    }

    /**
     * Sets the value of the isRepeated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRepeated(String value) {
        this.isRepeated = value;
    }

    /**
     * Gets the value of the isCaseSensitive property.
     * 
     */
    public boolean isIsCaseSensitive() {
        return isCaseSensitive;
    }

    /**
     * Sets the value of the isCaseSensitive property.
     * 
     */
    public void setIsCaseSensitive(boolean value) {
        this.isCaseSensitive = value;
    }

}

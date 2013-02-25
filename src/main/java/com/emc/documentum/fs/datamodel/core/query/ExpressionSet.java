/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://query.core.datamodel.fs.documentum.emc.com/}Expression">
 *       &lt;sequence>
 *         &lt;element name="expressions" type="{http://query.core.datamodel.fs.documentum.emc.com/}Expression" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{http://query.core.datamodel.fs.documentum.emc.com/}ExpressionSetOperator" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionSet", propOrder = {
    "expressions"
})
public class ExpressionSet
    extends Expression
{

    protected List<Expression> expressions;
    @XmlAttribute(name = "operator")
    protected ExpressionSetOperator operator;

    /**
     * Gets the value of the expressions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expressions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpressions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expression }
     * 
     * 
     */
    public List<Expression> getExpressions() {
        if (expressions == null) {
            expressions = new ArrayList<Expression>();
        }
        return this.expressions;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionSetOperator }
     *     
     */
    public ExpressionSetOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionSetOperator }
     *     
     */
    public void setOperator(ExpressionSetOperator value) {
        this.operator = value;
    }

}

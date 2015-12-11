
package com.emc.documentum.fs.datamodel.core.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://query.core.datamodel.fs.documentum.emc.com/}Query">
 *       &lt;sequence>
 *         &lt;element name="scopes" type="{http://query.core.datamodel.fs.documentum.emc.com/}RepositoryScope" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rootExpressionSet" type="{http://query.core.datamodel.fs.documentum.emc.com/}ExpressionSet" minOccurs="0"/>
 *         &lt;element name="orderByClauses" type="{http://query.core.datamodel.fs.documentum.emc.com/}OrderByClause" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="facetDefinitions" type="{http://query.core.datamodel.fs.documentum.emc.com/}FacetDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dateFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isDatabaseSearch" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isIncludeAllVersions" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isIncludeHidden" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxResultsForFacets" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredQuery", propOrder = {
    "scopes",
    "rootExpressionSet",
    "orderByClauses",
    "facetDefinitions"
})
public class StructuredQuery
    extends Query
{

    protected List<RepositoryScope> scopes;
    protected ExpressionSet rootExpressionSet;
    protected List<OrderByClause> orderByClauses;
    protected List<FacetDefinition> facetDefinitions;
    @XmlAttribute(name = "objectType")
    protected String objectType;
    @XmlAttribute(name = "dateFormat")
    protected String dateFormat;
    @XmlAttribute(name = "isDatabaseSearch", required = true)
    protected boolean isDatabaseSearch;
    @XmlAttribute(name = "isIncludeAllVersions", required = true)
    protected boolean isIncludeAllVersions;
    @XmlAttribute(name = "isIncludeHidden", required = true)
    protected boolean isIncludeHidden;
    @XmlAttribute(name = "maxResultsForFacets", required = true)
    protected int maxResultsForFacets;

    /**
     * Gets the value of the scopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepositoryScope }
     * 
     * 
     */
    public List<RepositoryScope> getScopes() {
        if (scopes == null) {
            scopes = new ArrayList<RepositoryScope>();
        }
        return this.scopes;
    }

    /**
     * Gets the value of the rootExpressionSet property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionSet }
     *     
     */
    public ExpressionSet getRootExpressionSet() {
        return rootExpressionSet;
    }

    /**
     * Sets the value of the rootExpressionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionSet }
     *     
     */
    public void setRootExpressionSet(ExpressionSet value) {
        this.rootExpressionSet = value;
    }

    /**
     * Gets the value of the orderByClauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderByClauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderByClauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderByClause }
     * 
     * 
     */
    public List<OrderByClause> getOrderByClauses() {
        if (orderByClauses == null) {
            orderByClauses = new ArrayList<OrderByClause>();
        }
        return this.orderByClauses;
    }

    /**
     * Gets the value of the facetDefinitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facetDefinitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacetDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacetDefinition }
     * 
     * 
     */
    public List<FacetDefinition> getFacetDefinitions() {
        if (facetDefinitions == null) {
            facetDefinitions = new ArrayList<FacetDefinition>();
        }
        return this.facetDefinitions;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the isDatabaseSearch property.
     * 
     */
    public boolean isIsDatabaseSearch() {
        return isDatabaseSearch;
    }

    /**
     * Sets the value of the isDatabaseSearch property.
     * 
     */
    public void setIsDatabaseSearch(boolean value) {
        this.isDatabaseSearch = value;
    }

    /**
     * Gets the value of the isIncludeAllVersions property.
     * 
     */
    public boolean isIsIncludeAllVersions() {
        return isIncludeAllVersions;
    }

    /**
     * Sets the value of the isIncludeAllVersions property.
     * 
     */
    public void setIsIncludeAllVersions(boolean value) {
        this.isIncludeAllVersions = value;
    }

    /**
     * Gets the value of the isIncludeHidden property.
     * 
     */
    public boolean isIsIncludeHidden() {
        return isIncludeHidden;
    }

    /**
     * Sets the value of the isIncludeHidden property.
     * 
     */
    public void setIsIncludeHidden(boolean value) {
        this.isIncludeHidden = value;
    }

    /**
     * Gets the value of the maxResultsForFacets property.
     * 
     */
    public int getMaxResultsForFacets() {
        return maxResultsForFacets;
    }

    /**
     * Sets the value of the maxResultsForFacets property.
     * 
     */
    public void setMaxResultsForFacets(int value) {
        this.maxResultsForFacets = value;
    }

}

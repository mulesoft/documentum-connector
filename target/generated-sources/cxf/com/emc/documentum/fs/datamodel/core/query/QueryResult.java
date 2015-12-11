
package com.emc.documentum.fs.datamodel.core.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.DataPackage;


/**
 * <p>Java class for QueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataPackage" type="{http://core.datamodel.fs.documentum.emc.com/}DataPackage" minOccurs="0"/>
 *         &lt;element name="queryStatus" type="{http://query.core.datamodel.fs.documentum.emc.com/}QueryStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="queryId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", propOrder = {
    "dataPackage",
    "queryStatus"
})
public class QueryResult {

    protected DataPackage dataPackage;
    protected QueryStatus queryStatus;
    @XmlAttribute(name = "queryId")
    protected String queryId;

    /**
     * Gets the value of the dataPackage property.
     * 
     * @return
     *     possible object is
     *     {@link DataPackage }
     *     
     */
    public DataPackage getDataPackage() {
        return dataPackage;
    }

    /**
     * Sets the value of the dataPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPackage }
     *     
     */
    public void setDataPackage(DataPackage value) {
        this.dataPackage = value;
    }

    /**
     * Gets the value of the queryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryStatus }
     *     
     */
    public QueryStatus getQueryStatus() {
        return queryStatus;
    }

    /**
     * Sets the value of the queryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryStatus }
     *     
     */
    public void setQueryStatus(QueryStatus value) {
        this.queryStatus = value;
    }

    /**
     * Gets the value of the queryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * Sets the value of the queryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryId(String value) {
        this.queryId = value;
    }

}

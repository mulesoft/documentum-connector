
package com.emc.documentum.fs.datamodel.core.holders;

import com.emc.documentum.fs.datamodel.core.QualificationValueType;
import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class QualificationExpressionHolder {

    protected Object string;
    protected String _stringType;
    protected Object qualificationValueType;
    protected QualificationValueType _qualificationValueTypeType;
    protected Object objectType;
    protected String _objectTypeType;

    /**
     * Sets string
     * 
     * @param value Value to set
     */
    public void setString(Object value) {
        this.string = value;
    }

    /**
     * Retrieves string
     * 
     */
    public Object getString() {
        return this.string;
    }

    /**
     * Sets qualificationValueType
     * 
     * @param value Value to set
     */
    public void setQualificationValueType(Object value) {
        this.qualificationValueType = value;
    }

    /**
     * Retrieves qualificationValueType
     * 
     */
    public Object getQualificationValueType() {
        return this.qualificationValueType;
    }

    /**
     * Sets objectType
     * 
     * @param value Value to set
     */
    public void setObjectType(Object value) {
        this.objectType = value;
    }

    /**
     * Retrieves objectType
     * 
     */
    public Object getObjectType() {
        return this.objectType;
    }

}

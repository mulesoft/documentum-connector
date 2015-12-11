
package com.emc.documentum.fs.datamodel.core.acl.holders;

import com.emc.documentum.fs.datamodel.core.acl.AccessType;
import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class AclEntryExpressionHolder {

    protected Object accessor;
    protected String _accessorType;
    protected Object accessType;
    protected AccessType _accessTypeType;

    /**
     * Sets accessor
     * 
     * @param value Value to set
     */
    public void setAccessor(Object value) {
        this.accessor = value;
    }

    /**
     * Retrieves accessor
     * 
     */
    public Object getAccessor() {
        return this.accessor;
    }

    /**
     * Sets accessType
     * 
     * @param value Value to set
     */
    public void setAccessType(Object value) {
        this.accessType = value;
    }

    /**
     * Retrieves accessType
     * 
     */
    public Object getAccessType() {
        return this.accessType;
    }

}

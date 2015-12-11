
package com.emc.documentum.fs.datamodel.core.acl.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class AclIdentityExpressionHolder {

    protected Object domain;
    protected String _domainType;
    protected Object name;
    protected String _nameType;
    protected Object repositoryName;
    protected String _repositoryNameType;

    /**
     * Sets domain
     * 
     * @param value Value to set
     */
    public void setDomain(Object value) {
        this.domain = value;
    }

    /**
     * Retrieves domain
     * 
     */
    public Object getDomain() {
        return this.domain;
    }

    /**
     * Sets name
     * 
     * @param value Value to set
     */
    public void setName(Object value) {
        this.name = value;
    }

    /**
     * Retrieves name
     * 
     */
    public Object getName() {
        return this.name;
    }

    /**
     * Sets repositoryName
     * 
     * @param value Value to set
     */
    public void setRepositoryName(Object value) {
        this.repositoryName = value;
    }

    /**
     * Retrieves repositoryName
     * 
     */
    public Object getRepositoryName() {
        return this.repositoryName;
    }

}


package org.mule.modules.documentum.connectivity;

import javax.annotation.Generated;
import org.mule.devkit.internal.connection.management.ConnectionManagementConnectionKey;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class ConnectionManagementConfigDocumentumConnectorConnectionKey implements ConnectionManagementConnectionKey
{

    /**
     * 
     */
    private String username;
    /**
     * 
     */
    private String password;
    /**
     * 
     */
    private String repository;
    /**
     * 
     */
    private String server;

    public ConnectionManagementConfigDocumentumConnectorConnectionKey(String username, String password, String repository, String server) {
        this.username = username;
        this.password = password;
        this.repository = repository;
        this.server = server;
    }

    /**
     * Sets username
     * 
     * @param value Value to set
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Retrieves username
     * 
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Sets repository
     * 
     * @param value Value to set
     */
    public void setRepository(String value) {
        this.repository = value;
    }

    /**
     * Retrieves repository
     * 
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * Sets server
     * 
     * @param value Value to set
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Retrieves server
     * 
     */
    public String getServer() {
        return this.server;
    }

    /**
     * Sets password
     * 
     * @param value Value to set
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Retrieves password
     * 
     */
    public String getPassword() {
        return this.password;
    }

    @Override
    public int hashCode() {
        int result = ((this.username!= null)?this.username.hashCode(): 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionManagementConfigDocumentumConnectorConnectionKey)) {
            return false;
        }
        ConnectionManagementConfigDocumentumConnectorConnectionKey that = ((ConnectionManagementConfigDocumentumConnectorConnectionKey) o);
        if (((this.username!= null)?(!this.username.equals(that.username)):(that.username!= null))) {
            return false;
        }
        return true;
    }

}

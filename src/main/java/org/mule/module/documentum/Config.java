/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
package org.mule.module.documentum;

import org.mule.api.ConnectionException;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.TestConnectivity;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.components.ConnectionManagement;
import org.mule.api.annotations.display.Password;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.module.documentum.coreservices.AccessControlClient;
import org.mule.module.documentum.coreservices.AccessControlClientImpl;
import org.mule.module.documentum.coreservices.ObjectClient;
import org.mule.module.documentum.coreservices.ObjectClientImpl;
import org.mule.module.documentum.coreservices.QueryClient;
import org.mule.module.documentum.coreservices.QueryClientImpl;
import org.mule.module.documentum.coreservices.VersionControlClient;
import org.mule.module.documentum.coreservices.VersionControlClientImpl;

import com.emc.documentum.fs.datamodel.core.context.RepositoryIdentity;
import com.emc.documentum.fs.datamodel.core.context.ServiceContext;

@ConnectionManagement(friendlyName = "Configuration", configElementName = "config")
public class Config {

    /**
     * The relative URL where all API calls are made.
     */
    private static final String APIURL = "/services/";

    /**
     * URL of the DFS server API
     */
    private String server;

    /**
     * Repository Identity
     */
    private RepositoryIdentity identity;

    /**
     * Service Context
     */
    private ServiceContext context;

    /**
     * Access Control Client
     */
    private AccessControlClient accessControlClient;

    /**
     * Object Client
     */
    private ObjectClient objectClient;

    /**
     * Query Client
     */
    private QueryClient queryClient;

    /**
     * Version Control Client
     */
    private VersionControlClient versionControlClient;

    /**
     * Connect
     *
     * @param username
     *            A username
     * @param password
     *            A password
     * @param repository
     *            A repository
     * @param server
     *            A server
     * @throws ConnectionException
     */
    @TestConnectivity
    @Connect
    public void connect(@ConnectionKey String username, @Password String password, String repository, String server) throws ConnectionException {
        identity = new RepositoryIdentity();
        context = new ServiceContext();
        identity.setUserName(username);
        identity.setPassword(password);
        identity.setRepositoryName(repository);
        context.getIdentities().add(identity);
        this.setServer(server);
    }

    /**
     * Disconnect
     */
    @Disconnect
    public void disconnect() {
        accessControlClient = null;
        objectClient = null;
        queryClient = null;
        versionControlClient = null;
    }

    /**
     * Are we connected
     */
    @ValidateConnection
    public boolean isConnected() {
        return (accessControlClient != null || objectClient != null || queryClient != null || versionControlClient != null);
    }

    /**
     * Connection Identifier
     */
    @ConnectionIdentifier
    public String connectionId() {
        return identity.getUserName();
    }

    public String getApiUrl() {
        return APIURL;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        if (!server.startsWith("http://")) {
            server = "http://" + server;
        }

        if (server.endsWith("/")) {
            server = server.substring(0, server.length() - 1);
        }

        this.server = server;
    }

    public RepositoryIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(RepositoryIdentity identity) {
        this.identity = identity;
    }

    public ServiceContext getContext() {
        return context;
    }

    public void setContext(ServiceContext context) {
        this.context = context;
    }

    public String getTarget() {
        return getServer() + getApiUrl();
    }

    public AccessControlClient getAccessControlClient() {
        if (accessControlClient != null) {
            return accessControlClient;
        }
        accessControlClient = new AccessControlClientImpl(getTarget(), context);
        return accessControlClient;
    }

    public ObjectClient getObjectClient() {
        if (objectClient != null) {
            return objectClient;
        }
        objectClient = new ObjectClientImpl(getTarget(), context);
        return objectClient;
    }

    public QueryClient getQueryClient() {
        if (queryClient != null) {
            return queryClient;
        }
        queryClient = new QueryClientImpl(getTarget(), context);
        return queryClient;
    }

    public VersionControlClient getVersionControlClient() {
        if (versionControlClient != null) {
            return versionControlClient;
        }
        versionControlClient = new VersionControlClientImpl(getTarget(), context);
        return versionControlClient;
    }

}


package org.mule.modules.documentum.connectivity;

import javax.annotation.Generated;
import org.mule.api.ConnectionException;
import org.mule.devkit.internal.connection.management.ConnectionManagementConnectionAdapter;
import org.mule.devkit.internal.connection.management.TestableConnection;
import org.mule.modules.documentum.Config;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class ConfigDocumentumConnectorAdapter
    extends Config
    implements ConnectionManagementConnectionAdapter<Config, ConnectionManagementConfigDocumentumConnectorConnectionKey> , TestableConnection<ConnectionManagementConfigDocumentumConnectorConnectionKey>
{


    @Override
    public void connect(ConnectionManagementConfigDocumentumConnectorConnectionKey connectionKey)
        throws ConnectionException
    {
        super.connect(connectionKey.getUsername(), connectionKey.getPassword(), connectionKey.getRepository(), connectionKey.getServer());
    }

    @Override
    public void test(ConnectionManagementConfigDocumentumConnectorConnectionKey connectionKey)
        throws ConnectionException
    {
        super.connect(connectionKey.getUsername(), connectionKey.getPassword(), connectionKey.getRepository(), connectionKey.getServer());
    }

    @Override
    public void disconnect() {
        super.disconnect();
    }

    @Override
    public String connectionId() {
        return super.connectionId();
    }

    @Override
    public boolean isConnected() {
        return super.isConnected();
    }

    @Override
    public Config getStrategy() {
        return this;
    }

}

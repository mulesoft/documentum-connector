
package org.mule.modules.documentum.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.modules.documentum.DocumentumConnector;


/**
 * A <code>DocumentumConnectorMetadataAdapter</code> is a wrapper around {@link DocumentumConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class DocumentumConnectorMetadataAdapter
    extends DocumentumConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Documentum";
    private final static String MODULE_VERSION = "2.0.0";
    private final static String DEVKIT_VERSION = "3.7.2";
    private final static String DEVKIT_BUILD = "3.7.x.2633.51164b9";
    private final static String MIN_MULE_VERSION = "3.6";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}

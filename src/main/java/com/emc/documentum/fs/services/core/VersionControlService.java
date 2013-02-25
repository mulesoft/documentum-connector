/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package com.emc.documentum.fs.services.core;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-02-25T17:08:32.447-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "VersionControlService", 
                  wsdlLocation = "classpath:wsdl/VersionControlService.wsdl",
                  targetNamespace = "http://core.services.fs.documentum.emc.com/") 
public class VersionControlService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://core.services.fs.documentum.emc.com/", "VersionControlService");
    public final static QName VersionControlServicePort = new QName("http://core.services.fs.documentum.emc.com/", "VersionControlServicePort");
    static {
        URL url = VersionControlService.class.getClassLoader().getResource("wsdl/VersionControlService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(VersionControlService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/VersionControlService.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public VersionControlService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VersionControlService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VersionControlService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns VersionControlServicePort
     */
    @WebEndpoint(name = "VersionControlServicePort")
    public VersionControlServicePort getVersionControlServicePort() {
        return super.getPort(VersionControlServicePort, VersionControlServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VersionControlServicePort
     */
    @WebEndpoint(name = "VersionControlServicePort")
    public VersionControlServicePort getVersionControlServicePort(WebServiceFeature... features) {
        return super.getPort(VersionControlServicePort, VersionControlServicePort.class, features);
    }

}

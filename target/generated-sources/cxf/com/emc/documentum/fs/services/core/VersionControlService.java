package com.emc.documentum.fs.services.core;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * The version control service provides operations that enable access and changes to specific object versions.
 * 
 *  @see com.emc.documentum.fs.datamodel.core.OperationOptions
 * 
 *  @since 6.0
 *
 * This class was generated by Apache CXF 2.7.15
 * 2015-12-11T17:08:21.543-03:00
 * Generated source version: 2.7.15
 * 
 */
@WebServiceClient(name = "VersionControlService", 
                  wsdlLocation = "classpath:wsdl/6.6/VersionControlService.wsdl",
                  targetNamespace = "http://core.services.fs.documentum.emc.com/") 
public class VersionControlService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://core.services.fs.documentum.emc.com/", "VersionControlService");
    public final static QName VersionControlServicePort = new QName("http://core.services.fs.documentum.emc.com/", "VersionControlServicePort");
    static {
        URL url = VersionControlService.class.getClassLoader().getResource("wsdl/6.6/VersionControlService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(VersionControlService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/6.6/VersionControlService.wsdl");
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
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public VersionControlService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public VersionControlService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public VersionControlService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
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

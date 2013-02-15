/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.services.core;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emc.documentum.fs.services.core package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emc.documentum.fs.services.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVersionInfoResponse }
     * 
     */
    public GetVersionInfoResponse createGetVersionInfoResponse() {
        return new GetVersionInfoResponse();
    }

    /**
     * Create an instance of {@link GetVersionInfo }
     * 
     */
    public GetVersionInfo createGetVersionInfo() {
        return new GetVersionInfo();
    }

    /**
     * Create an instance of {@link GetCheckoutInfo }
     * 
     */
    public GetCheckoutInfo createGetCheckoutInfo() {
        return new GetCheckoutInfo();
    }

    /**
     * Create an instance of {@link CancelCheckoutResponse }
     * 
     */
    public CancelCheckoutResponse createCancelCheckoutResponse() {
        return new CancelCheckoutResponse();
    }

    /**
     * Create an instance of {@link DeleteAllVersionsResponse }
     * 
     */
    public DeleteAllVersionsResponse createDeleteAllVersionsResponse() {
        return new DeleteAllVersionsResponse();
    }

    /**
     * Create an instance of {@link GetCheckoutInfoResponse }
     * 
     */
    public GetCheckoutInfoResponse createGetCheckoutInfoResponse() {
        return new GetCheckoutInfoResponse();
    }

    /**
     * Create an instance of {@link GetCurrentResponse }
     * 
     */
    public GetCurrentResponse createGetCurrentResponse() {
        return new GetCurrentResponse();
    }

    /**
     * Create an instance of {@link DeleteVersionResponse }
     * 
     */
    public DeleteVersionResponse createDeleteVersionResponse() {
        return new DeleteVersionResponse();
    }

    /**
     * Create an instance of {@link Checkout }
     * 
     */
    public Checkout createCheckout() {
        return new Checkout();
    }

    /**
     * Create an instance of {@link CancelCheckout }
     * 
     */
    public CancelCheckout createCancelCheckout() {
        return new CancelCheckout();
    }

    /**
     * Create an instance of {@link CheckoutResponse }
     * 
     */
    public CheckoutResponse createCheckoutResponse() {
        return new CheckoutResponse();
    }

    /**
     * Create an instance of {@link DeleteAllVersions }
     * 
     */
    public DeleteAllVersions createDeleteAllVersions() {
        return new DeleteAllVersions();
    }

    /**
     * Create an instance of {@link GetCurrent }
     * 
     */
    public GetCurrent createGetCurrent() {
        return new GetCurrent();
    }

    /**
     * Create an instance of {@link CheckinResponse }
     * 
     */
    public CheckinResponse createCheckinResponse() {
        return new CheckinResponse();
    }

    /**
     * Create an instance of {@link DeleteVersion }
     * 
     */
    public DeleteVersion createDeleteVersion() {
        return new DeleteVersion();
    }

    /**
     * Create an instance of {@link Checkin }
     * 
     */
    public Checkin createCheckin() {
        return new Checkin();
    }

}

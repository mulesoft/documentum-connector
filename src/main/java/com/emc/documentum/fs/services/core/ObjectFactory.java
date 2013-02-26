/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.services.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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

    private final static QName _CheckinResponse_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "checkinResponse");
    private final static QName _DeleteVersion_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "deleteVersion");
    private final static QName _GetVersionInfo_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "getVersionInfo");
    private final static QName _GetCheckoutInfo_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "getCheckoutInfo");
    private final static QName _GetCheckoutInfoResponse_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "getCheckoutInfoResponse");
    private final static QName _GetCurrentResponse_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "getCurrentResponse");
    private final static QName _GetVersionInfoResponse_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "getVersionInfoResponse");
    private final static QName _DeleteVersionResponse_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "deleteVersionResponse");
    private final static QName _Checkin_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "checkin");
    private final static QName _DeleteAllVersions_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "deleteAllVersions");
    private final static QName _GetCurrent_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "getCurrent");
    private final static QName _CheckoutResponse_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "checkoutResponse");
    private final static QName _Checkout_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "checkout");
    private final static QName _DeleteAllVersionsResponse_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "deleteAllVersionsResponse");
    private final static QName _CancelCheckoutResponse_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "cancelCheckoutResponse");
    private final static QName _CancelCheckout_QNAME = new QName("http://core.services.fs.documentum.emc.com/", "cancelCheckout");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emc.documentum.fs.services.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteAllVersionsResponse }
     * 
     */
    public DeleteAllVersionsResponse createDeleteAllVersionsResponse() {
        return new DeleteAllVersionsResponse();
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
     * Create an instance of {@link GetVersionInfoResponse }
     * 
     */
    public GetVersionInfoResponse createGetVersionInfoResponse() {
        return new GetVersionInfoResponse();
    }

    /**
     * Create an instance of {@link GetCurrentResponse }
     * 
     */
    public GetCurrentResponse createGetCurrentResponse() {
        return new GetCurrentResponse();
    }

    /**
     * Create an instance of {@link GetVersionInfo }
     * 
     */
    public GetVersionInfo createGetVersionInfo() {
        return new GetVersionInfo();
    }

    /**
     * Create an instance of {@link GetCurrent }
     * 
     */
    public GetCurrent createGetCurrent() {
        return new GetCurrent();
    }

    /**
     * Create an instance of {@link GetCheckoutInfo }
     * 
     */
    public GetCheckoutInfo createGetCheckoutInfo() {
        return new GetCheckoutInfo();
    }

    /**
     * Create an instance of {@link DeleteVersionResponse }
     * 
     */
    public DeleteVersionResponse createDeleteVersionResponse() {
        return new DeleteVersionResponse();
    }

    /**
     * Create an instance of {@link CancelCheckout }
     * 
     */
    public CancelCheckout createCancelCheckout() {
        return new CancelCheckout();
    }

    /**
     * Create an instance of {@link Checkin }
     * 
     */
    public Checkin createCheckin() {
        return new Checkin();
    }

    /**
     * Create an instance of {@link GetCheckoutInfoResponse }
     * 
     */
    public GetCheckoutInfoResponse createGetCheckoutInfoResponse() {
        return new GetCheckoutInfoResponse();
    }

    /**
     * Create an instance of {@link CancelCheckoutResponse }
     * 
     */
    public CancelCheckoutResponse createCancelCheckoutResponse() {
        return new CancelCheckoutResponse();
    }

    /**
     * Create an instance of {@link CheckinResponse }
     * 
     */
    public CheckinResponse createCheckinResponse() {
        return new CheckinResponse();
    }

    /**
     * Create an instance of {@link Checkout }
     * 
     */
    public Checkout createCheckout() {
        return new Checkout();
    }

    /**
     * Create an instance of {@link DeleteVersion }
     * 
     */
    public DeleteVersion createDeleteVersion() {
        return new DeleteVersion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "checkinResponse")
    public JAXBElement<CheckinResponse> createCheckinResponse(CheckinResponse value) {
        return new JAXBElement<CheckinResponse>(_CheckinResponse_QNAME, CheckinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "deleteVersion")
    public JAXBElement<DeleteVersion> createDeleteVersion(DeleteVersion value) {
        return new JAXBElement<DeleteVersion>(_DeleteVersion_QNAME, DeleteVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "getVersionInfo")
    public JAXBElement<GetVersionInfo> createGetVersionInfo(GetVersionInfo value) {
        return new JAXBElement<GetVersionInfo>(_GetVersionInfo_QNAME, GetVersionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckoutInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "getCheckoutInfo")
    public JAXBElement<GetCheckoutInfo> createGetCheckoutInfo(GetCheckoutInfo value) {
        return new JAXBElement<GetCheckoutInfo>(_GetCheckoutInfo_QNAME, GetCheckoutInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckoutInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "getCheckoutInfoResponse")
    public JAXBElement<GetCheckoutInfoResponse> createGetCheckoutInfoResponse(GetCheckoutInfoResponse value) {
        return new JAXBElement<GetCheckoutInfoResponse>(_GetCheckoutInfoResponse_QNAME, GetCheckoutInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "getCurrentResponse")
    public JAXBElement<GetCurrentResponse> createGetCurrentResponse(GetCurrentResponse value) {
        return new JAXBElement<GetCurrentResponse>(_GetCurrentResponse_QNAME, GetCurrentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "getVersionInfoResponse")
    public JAXBElement<GetVersionInfoResponse> createGetVersionInfoResponse(GetVersionInfoResponse value) {
        return new JAXBElement<GetVersionInfoResponse>(_GetVersionInfoResponse_QNAME, GetVersionInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "deleteVersionResponse")
    public JAXBElement<DeleteVersionResponse> createDeleteVersionResponse(DeleteVersionResponse value) {
        return new JAXBElement<DeleteVersionResponse>(_DeleteVersionResponse_QNAME, DeleteVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checkin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "checkin")
    public JAXBElement<Checkin> createCheckin(Checkin value) {
        return new JAXBElement<Checkin>(_Checkin_QNAME, Checkin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllVersions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "deleteAllVersions")
    public JAXBElement<DeleteAllVersions> createDeleteAllVersions(DeleteAllVersions value) {
        return new JAXBElement<DeleteAllVersions>(_DeleteAllVersions_QNAME, DeleteAllVersions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "getCurrent")
    public JAXBElement<GetCurrent> createGetCurrent(GetCurrent value) {
        return new JAXBElement<GetCurrent>(_GetCurrent_QNAME, GetCurrent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "checkoutResponse")
    public JAXBElement<CheckoutResponse> createCheckoutResponse(CheckoutResponse value) {
        return new JAXBElement<CheckoutResponse>(_CheckoutResponse_QNAME, CheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checkout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "checkout")
    public JAXBElement<Checkout> createCheckout(Checkout value) {
        return new JAXBElement<Checkout>(_Checkout_QNAME, Checkout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllVersionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "deleteAllVersionsResponse")
    public JAXBElement<DeleteAllVersionsResponse> createDeleteAllVersionsResponse(DeleteAllVersionsResponse value) {
        return new JAXBElement<DeleteAllVersionsResponse>(_DeleteAllVersionsResponse_QNAME, DeleteAllVersionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelCheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "cancelCheckoutResponse")
    public JAXBElement<CancelCheckoutResponse> createCancelCheckoutResponse(CancelCheckoutResponse value) {
        return new JAXBElement<CancelCheckoutResponse>(_CancelCheckoutResponse_QNAME, CancelCheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelCheckout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.services.fs.documentum.emc.com/", name = "cancelCheckout")
    public JAXBElement<CancelCheckout> createCancelCheckout(CancelCheckout value) {
        return new JAXBElement<CancelCheckout>(_CancelCheckout_QNAME, CancelCheckout.class, null, value);
    }

}

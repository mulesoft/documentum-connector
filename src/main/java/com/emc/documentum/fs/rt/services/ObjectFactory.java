/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.rt.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emc.documentum.fs.rt.services package. 
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

    private final static QName _UnregisterResponse_QNAME = new QName("http://services.rt.fs.documentum.emc.com/", "unregisterResponse");
    private final static QName _LookupResponse_QNAME = new QName("http://services.rt.fs.documentum.emc.com/", "lookupResponse");
    private final static QName _Register_QNAME = new QName("http://services.rt.fs.documentum.emc.com/", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://services.rt.fs.documentum.emc.com/", "registerResponse");
    private final static QName _Lookup_QNAME = new QName("http://services.rt.fs.documentum.emc.com/", "lookup");
    private final static QName _Unregister_QNAME = new QName("http://services.rt.fs.documentum.emc.com/", "unregister");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emc.documentum.fs.rt.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link Unregister }
     * 
     */
    public Unregister createUnregister() {
        return new Unregister();
    }

    /**
     * Create an instance of {@link LookupResponse }
     * 
     */
    public LookupResponse createLookupResponse() {
        return new LookupResponse();
    }

    /**
     * Create an instance of {@link UnregisterResponse }
     * 
     */
    public UnregisterResponse createUnregisterResponse() {
        return new UnregisterResponse();
    }

    /**
     * Create an instance of {@link Lookup }
     * 
     */
    public Lookup createLookup() {
        return new Lookup();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnregisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rt.fs.documentum.emc.com/", name = "unregisterResponse")
    public JAXBElement<UnregisterResponse> createUnregisterResponse(UnregisterResponse value) {
        return new JAXBElement<UnregisterResponse>(_UnregisterResponse_QNAME, UnregisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rt.fs.documentum.emc.com/", name = "lookupResponse")
    public JAXBElement<LookupResponse> createLookupResponse(LookupResponse value) {
        return new JAXBElement<LookupResponse>(_LookupResponse_QNAME, LookupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rt.fs.documentum.emc.com/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rt.fs.documentum.emc.com/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lookup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rt.fs.documentum.emc.com/", name = "lookup")
    public JAXBElement<Lookup> createLookup(Lookup value) {
        return new JAXBElement<Lookup>(_Lookup_QNAME, Lookup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unregister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rt.fs.documentum.emc.com/", name = "unregister")
    public JAXBElement<Unregister> createUnregister(Unregister value) {
        return new JAXBElement<Unregister>(_Unregister_QNAME, Unregister.class, null, value);
    }

}

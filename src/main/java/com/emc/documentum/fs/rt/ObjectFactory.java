/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.rt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emc.documentum.fs.rt package. 
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

    private final static QName _SerializableException_QNAME = new QName("http://rt.fs.documentum.emc.com/", "SerializableException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emc.documentum.fs.rt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DfsAttributeHolder }
     * 
     */
    public DfsAttributeHolder createDfsAttributeHolder() {
        return new DfsAttributeHolder();
    }

    /**
     * Create an instance of {@link DfsExceptionHolder }
     * 
     */
    public DfsExceptionHolder createDfsExceptionHolder() {
        return new DfsExceptionHolder();
    }

    /**
     * Create an instance of {@link StackTraceHolder }
     * 
     */
    public StackTraceHolder createStackTraceHolder() {
        return new StackTraceHolder();
    }

    /**
     * Create an instance of {@link SerializableException }
     * 
     */
    public SerializableException createSerializableException() {
        return new SerializableException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerializableException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rt.fs.documentum.emc.com/", name = "SerializableException")
    public JAXBElement<SerializableException> createSerializableException(SerializableException value) {
        return new JAXBElement<SerializableException>(_SerializableException_QNAME, SerializableException.class, null, value);
    }

}

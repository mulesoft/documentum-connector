/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.services.core;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-02-26T11:38:14.775-03:00
 * Generated source version: 2.5.1
 */

@WebFault(name = "SerializableException", targetNamespace = "http://rt.fs.documentum.emc.com/")
public class SerializableException extends Exception {
    
    private com.emc.documentum.fs.rt.SerializableException serializableException;

    public SerializableException() {
        super();
    }
    
    public SerializableException(String message) {
        super(message);
    }
    
    public SerializableException(String message, Throwable cause) {
        super(message, cause);
    }

    public SerializableException(String message, com.emc.documentum.fs.rt.SerializableException serializableException) {
        super(message);
        this.serializableException = serializableException;
    }

    public SerializableException(String message, com.emc.documentum.fs.rt.SerializableException serializableException, Throwable cause) {
        super(message, cause);
        this.serializableException = serializableException;
    }

    public com.emc.documentum.fs.rt.SerializableException getFaultInfo() {
        return this.serializableException;
    }
}

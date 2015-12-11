
package com.emc.documentum.fs.datamodel.core.content;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emc.documentum.fs.datamodel.core.content package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emc.documentum.fs.datamodel.core.content
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataHandlerContent }
     * 
     */
    public DataHandlerContent createDataHandlerContent() {
        return new DataHandlerContent();
    }

    /**
     * Create an instance of {@link BinaryContent }
     * 
     */
    public BinaryContent createBinaryContent() {
        return new BinaryContent();
    }

    /**
     * Create an instance of {@link ActivityInfo }
     * 
     */
    public ActivityInfo createActivityInfo() {
        return new ActivityInfo();
    }

    /**
     * Create an instance of {@link UcfContent }
     * 
     */
    public UcfContent createUcfContent() {
        return new UcfContent();
    }

    /**
     * Create an instance of {@link UrlContent }
     * 
     */
    public UrlContent createUrlContent() {
        return new UrlContent();
    }

}

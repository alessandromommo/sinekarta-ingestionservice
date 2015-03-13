//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.13 alle 07:51:13 PM CET 
//


package org.sinekarta.ingestionservice.commons;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sinekarta.ingestionservice.commons package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sinekarta.ingestionservice.commons
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetadataGroup }
     * 
     */
    public MetadataGroup createMetadataGroup() {
        return new MetadataGroup();
    }

    /**
     * Create an instance of {@link MetadataGroupType }
     * 
     */
    public MetadataGroupType createMetadataGroupType() {
        return new MetadataGroupType();
    }

    /**
     * Create an instance of {@link MetadataType }
     * 
     */
    public MetadataType createMetadataType() {
        return new MetadataType();
    }

}

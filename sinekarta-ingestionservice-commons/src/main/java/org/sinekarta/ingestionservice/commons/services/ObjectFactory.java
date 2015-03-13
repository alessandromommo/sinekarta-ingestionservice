/**
 * Copyright 2015-2020 JENIA Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.sinekarta.ingestionservice.commons.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.sinekarta.ingestionservice.commons.services.wrapper.TransmitLinkToSip;
import org.sinekarta.ingestionservice.commons.services.wrapper.TransmitLinkToSipResponse;
import org.sinekarta.ingestionservice.commons.services.wrapper.TransmitSip;
import org.sinekarta.ingestionservice.commons.services.wrapper.TransmitSipResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jenia.service.ws package. 
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

    private final static QName _TransmitSip_QNAME = new QName("http://ws.service.sinekarta.org/", "transmitSip");
    private final static QName _TransmitLinkToSip_QNAME = new QName("http://ws.service.sinekarta.org/", "transmitLinkToSip");
    private final static QName _TransmitLinkToSipResponse_QNAME = new QName("http://ws.service.sinekarta.org/", "transmitLinkToSipResponse");
    private final static QName _TransmitSipResponse_QNAME = new QName("http://ws.service.sinekarta.org/", "transmitSipResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jenia.service.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransmitLinkToSip }
     * 
     */
    public TransmitLinkToSip createTransmitLinkToSip() {
        return new TransmitLinkToSip();
    }

    /**
     * Create an instance of {@link TransmitSip }
     * 
     */
    public TransmitSip createTransmitSip() {
        return new TransmitSip();
    }

    /**
     * Create an instance of {@link TransmitSipResponse }
     * 
     */
    public TransmitSipResponse createTransmitSipResponse() {
        return new TransmitSipResponse();
    }

    /**
     * Create an instance of {@link TransmitLinkToSipResponse }
     * 
     */
    public TransmitLinkToSipResponse createTransmitLinkToSipResponse() {
        return new TransmitLinkToSipResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmitSip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.sinekarta.org/", name = "transmitSip")
    public JAXBElement<TransmitSip> createTransmitSip(TransmitSip value) {
        return new JAXBElement<TransmitSip>(_TransmitSip_QNAME, TransmitSip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmitLinkToSip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.sinekarta.org/", name = "transmitLinkToSip")
    public JAXBElement<TransmitLinkToSip> createTransmitLinkToSip(TransmitLinkToSip value) {
        return new JAXBElement<TransmitLinkToSip>(_TransmitLinkToSip_QNAME, TransmitLinkToSip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmitLinkToSipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.sinekarta.org/", name = "transmitLinkToSipResponse")
    public JAXBElement<TransmitLinkToSipResponse> createTransmitLinkToSipResponse(TransmitLinkToSipResponse value) {
        return new JAXBElement<TransmitLinkToSipResponse>(_TransmitLinkToSipResponse_QNAME, TransmitLinkToSipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmitSipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.sinekarta.org/", name = "transmitSipResponse")
    public JAXBElement<TransmitSipResponse> createTransmitSipResponse(TransmitSipResponse value) {
        return new JAXBElement<TransmitSipResponse>(_TransmitSipResponse_QNAME, TransmitSipResponse.class, null, value);
    }

}

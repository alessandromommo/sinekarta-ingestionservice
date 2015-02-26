package org.sinekarta.ingestion.services;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.sinekarta.ingestion.beans.Mets;
import org.sinekarta.ingestion.services.response.TransmissionResponse;


@WebService(targetNamespace = "http://ws.service.jenia.org/", name = "ServiceIngestTransmit")
@XmlSeeAlso({ObjectFactory.class})
public interface ServiceIngestTransmit {
	
	@WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "transmitSip", targetNamespace = "http://ws.service.jenia.org/", className = "org.sinekarta.ingestion.service.request.TransmitSip")
    @WebMethod(action = "urn:TransmitSip")
    @ResponseWrapper(localName = "transmitSipResponse", targetNamespace = "http://ws.service.jenia.org/", className = "org.sinekarta.ingestion.services.response.TransmitSipResponse")
    public TransmissionResponse transmitSip(
    	@WebParam(name = "arg0", targetNamespace = "")
    	java.lang.String arg0,
    	@WebParam(name = "arg1", targetNamespace = "")
        Mets arg1
    );

	@WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "transmitLinkToSip", targetNamespace = "http://ws.service.jenia.org/", className = "org.sinekarta.ingestion.service.request.TransmitLinkToSip")
    @WebMethod(action = "urn:TransmitLinkToSip")
    @ResponseWrapper(localName = "transmitLinkToSipResponse", targetNamespace = "http://ws.service.jenia.org/", className = "org.sinekarta.ingestion.services.response.TransmitLinkToSipResponse")
    public TransmissionResponse transmitLinkToSip(
    	@WebParam(name = "arg0", targetNamespace = "")
    	java.lang.String arg0,
    	@WebParam(name = "arg1", targetNamespace = "")
    	java.lang.String arg1
    );
	
}

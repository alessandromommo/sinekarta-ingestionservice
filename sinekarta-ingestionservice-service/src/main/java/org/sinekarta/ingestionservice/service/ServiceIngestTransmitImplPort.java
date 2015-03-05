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
package org.sinekarta.ingestionservice.service;

import java.util.Date;

import org.apache.commons.validator.routines.UrlValidator;
import org.apache.log4j.Logger;
import org.sinekarta.ingestionservice.mets.Mets;
import org.sinekarta.ingestionservice.service.response.TransmissionError;
import org.sinekarta.ingestionservice.service.response.TransmissionResponse;


/**
 * 
 * @author Alessandro Mommo
 *
 */

@javax.jws.WebService(
                      serviceName = "ServiceIngestTransmitImplService",
                      portName = "ServiceIngestTransmitImplPort",
                      targetNamespace = "http://ws.service.sinekarta.org/",
                      endpointInterface = "org.sinekarta.ingestionservice.service.ServiceIngestTransmit")
                      
public class ServiceIngestTransmitImplPort implements ServiceIngestTransmit {

    private static final Logger LOG = Logger.getLogger(ServiceIngestTransmitImplPort.class.getName());
    
    private static long responseId = 0;

    
	@Override
	public TransmissionResponse transmitSip(String responsePortAddres, Mets mets) {
		LOG.info("Executing operation transmitSip");
		
		TransmissionResponse resp = checkParameters(responsePortAddres, mets);
		
		if(resp == null) {
			resp = createTransmissionResponse(TransmissionError.NO_ERROR);
		}
		
		return resp;
	}

	
	@Override
	public TransmissionResponse transmitLinkToSip(String responsePortAddres, String sipAddress) {
		LOG.info("Executing operation transmitLinkToSip");
		
		TransmissionResponse resp = checkParameters(responsePortAddres, sipAddress);
		
		if(resp == null) {
			resp = createTransmissionResponse(TransmissionError.NO_ERROR);
		}
		
		return resp;
	}

	private TransmissionResponse checkParameters(String responsePortAddres, Mets mets) {
		TransmissionResponse resp = null;
		
		if(!isValidAddress(responsePortAddres)) {
			resp = createTransmissionResponse(TransmissionError.MISSED_RESPONSE_PORT_ADDRESS);
		}
		
		if(mets == null) {
			if(resp == null)
				resp = createTransmissionResponse(TransmissionError.MISSED_SIP);
			else
				resp.addTransmissionError(TransmissionError.MISSED_SIP);
		}
		
		return resp;
	}
	
	private TransmissionResponse checkParameters(String responsePortAddres, String sipAddress) {
		TransmissionResponse resp = null;
		
		if(!isValidAddress(responsePortAddres)) {
			resp = createTransmissionResponse(TransmissionError.MISSED_RESPONSE_PORT_ADDRESS);
		}
		
		if(!isValidAddress(sipAddress)) {
			if(resp == null)
				resp = createTransmissionResponse(TransmissionError.MISSED_SIP_ADDRESS);
			else
				resp.addTransmissionError(TransmissionError.MISSED_SIP_ADDRESS);
		}
		
		return resp;
	}
	
	private boolean isValidAddress(String address) {
		UrlValidator defaultValidator = new UrlValidator();
		
		if((address == null) || (address.length() == 0) || !defaultValidator.isValid(address))
			return false;
		
		return true;
	}
	
	private long generateResponseId() {
		return ++responseId;
	}
	
	private TransmissionResponse createTransmissionResponse(TransmissionError error) {
		TransmissionResponse resp = new TransmissionResponse();
		resp.setTransmissionId(generateResponseId());
		resp.setTransmissionDate(new Date());
		resp.addTransmissionError(error);
		
		return resp;
	}
}

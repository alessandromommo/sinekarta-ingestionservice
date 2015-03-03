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
import java.util.logging.Logger;

import org.sinekarta.ingestion.beans.Mets;
import org.sinekarta.ingestionservice.service.response.TransmissionResponse;
import org.sinekarta.ingestionservice.service.response.TransmissionResponse.Response;


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

    
	@Override
	public TransmissionResponse transmitSip(String arg0, Mets arg1) {
		LOG.info("Executing operation transmitSip");
		TransmissionResponse resp = new TransmissionResponse();
		resp.setResponseId(1l);
		resp.setTransmissionDate(new Date());
		resp.setResponseStatus(Response.SUCCESS);
		resp.setResponseMessage("transmitSip OK");
		
		return resp;
	}

	
	@Override
	public TransmissionResponse transmitLinkToSip(String arg0, String arg1) {
		LOG.info("Executing operation transmitLinkToSip");
		TransmissionResponse resp = new TransmissionResponse();
		resp.setResponseId(1l);
		resp.setTransmissionDate(new Date());
		resp.setResponseStatus(Response.SUCCESS);
		resp.setResponseMessage("transmitLinkToSip OK");
		
		return resp;
	}

}

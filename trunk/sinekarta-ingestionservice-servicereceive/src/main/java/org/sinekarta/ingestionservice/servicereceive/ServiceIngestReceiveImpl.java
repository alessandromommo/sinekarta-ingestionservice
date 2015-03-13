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
package org.sinekarta.ingestionservice.servicereceive;


import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.sinekarta.ingestionservice.commons.service.request.DepositReceipt;


/**
 * 
 * @author Alessandro Mommo
 *
 */                      
@WebService(targetNamespace = "http://servicereceive.ingestionservice.sinekarta.org/", endpointInterface = "org.sinekarta.ingestionservice.servicereceive.ServiceIngestReceive", portName = "ServiceIngestReceiveImplPort", serviceName = "ServiceIngestReceiveImplService")
public class ServiceIngestReceiveImpl implements ServiceIngestReceive {

    private static final Logger LOG = Logger.getLogger(ServiceIngestReceiveImpl.class.getName());

    
	@Override
	public void receiveReport(DepositReceipt report) {
		LOG.info("Executing operation receiveReport");
	}
}

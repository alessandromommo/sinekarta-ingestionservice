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


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.sinekarta.ingestionservice.commons.service.request.DepositReceipt;

/**
 * @author Alessandro Mommo
 *
 */
@WebService(name = "ServiceIngestReceive", targetNamespace = "http://servicereceive.ingestionservice.sinekarta.org/")
public interface ServiceIngestReceive {
	
	
	@WebMethod(operationName = "receiveReport", action = "urn:ReceiveReport")
	public void receiveReport(@WebParam(name = "arg0") DepositReceipt report);

}
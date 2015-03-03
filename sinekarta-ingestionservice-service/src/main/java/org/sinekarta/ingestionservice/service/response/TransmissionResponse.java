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
package org.sinekarta.ingestionservice.service.response;

/**
 * 
 * @author Alessandro Mommo
 *
 */
public class TransmissionResponse {
	
	public enum Response {
	     
	    SUCCESS,
	    IO_ERROR,
	    GENERIC_ERROR
	    
	}
	
	private Response responseId;
	private String responseMessage;
	
	/**
	 * @return the responseId
	 */
	public Response getResponseId() {
		return responseId;
	}
	/**
	 * @param responseId the responseId to set
	 */
	public void setResponseId(Response responseId) {
		this.responseId = responseId;
	}
	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return responseMessage;
	}
	/**
	 * @param responseMessage the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String toString() {
		return "TransmissionResponse content:"
				+ "\nresponseId = " + this.responseId
				+ "\nresponseMessage = " + this.responseMessage;
	}
}

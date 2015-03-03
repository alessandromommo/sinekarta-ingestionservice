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

import java.util.Date;

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
	
	private long transmissionId;
	private Date transmissionDate;
	private Response transmissionStatus;
	private String transmissionMessage;
	
	/**
	 * @return the responseId
	 */
	public long getResponseId() {
		return transmissionId;
	}
	
	/**
	 * @param responseId the responseId to set
	 */
	public void setResponseId(long responseId) {
		this.transmissionId = responseId;
	}
	
	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return transmissionMessage;
	}
	
	/**
	 * @param responseMessage the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		this.transmissionMessage = responseMessage;
	}
	
	/**
	 * @return the transmissionDate
	 */
	public Date getTransmissionDate() {
		return transmissionDate;
	}
	
	/**
	 * @param transmissionDate the transmissionDate to set
	 */
	public void setTransmissionDate(Date transmissionDate) {
		this.transmissionDate = transmissionDate;
	}
	
	/**
	 * @return the responseStatus
	 */
	public Response getResponseStatus() {
		return transmissionStatus;
	}
	
	/**
	 * @param responseStatus the responseStatus to set
	 */
	public void setResponseStatus(Response responseStatus) {
		this.transmissionStatus = responseStatus;
	}
	
	/**
	 * Utility method to print the response.
	 * 
	 * @return A string representing the content of the received response.
	 */
	public String toString() {
		return "TransmissionResponse content:"
				+ "\ntransmissionId = " + this.transmissionId
				+ "\ntransmissionDate = " + this.transmissionDate
				+ "\ntransmissionStatus = " + this.transmissionStatus
				+ "\ntransmissionMessage = " + this.transmissionMessage;
	}
}

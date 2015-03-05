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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Alessandro Mommo
 *
 */
@XmlType
public class TransmissionResponse implements Serializable {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -9145658279299866192L;
	
	private long transmissionId;
	private Date transmissionDate;
	@XmlElement
	private List<Integer> transmissionErrors;
	@XmlElement
	private List<String> transmissionMessages;
	
	/**
	 * 
	 */
	public TransmissionResponse() {
		transmissionErrors = new ArrayList<>();
		transmissionMessages = new ArrayList<>();
	}
	
	/**
	 * @return the transmissionId
	 */
	public long getTransmissionId() {
		return transmissionId;
	}


	/**
	 * @param transmissionId the transmissionId to set
	 */
	public void setTransmissionId(long transmissionId) {
		this.transmissionId = transmissionId;
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
	 * @return the transmissionErrors
	 */
	public List<Integer> getTransmissionErrors() {
		return transmissionErrors;
	}


	/**
	 * @return the transmissionMessages
	 */
	public List<String> getTransmissionMessages() {
		return transmissionMessages;
	}


	/**
	 * 
	 * @param error
	 */
	public void addTransmissionError(TransmissionError error) {
		transmissionErrors.add(error.getValue());
		transmissionMessages.add(error.toString());
	}


	/**
	 * Utility method to print the response.
	 * 
	 * @return A string representing the content of the received response.
	 */
	public String toString() {
		String toString = "TransmissionResponse content:"
				+ "\ntransmissionId = " + this.transmissionId
				+ "\ntransmissionDate = " + this.transmissionDate;
		
		if(transmissionErrors.size() != 0) {
			toString += "\ntransmissionErrors = ";
			for(int i = 0; i < transmissionErrors.size(); i++) {
				toString += transmissionErrors.get(i);
				if((i + 1) < transmissionErrors.size())
					toString += ", ";
			}
			
			toString += "\ntransmissionMessages = ";
			for(int i = 0; i < transmissionMessages.size(); i++) {
				toString += transmissionMessages.get(i);
				if((i + 1) < transmissionMessages.size())
					toString += ", ";
			}
		} 
		
		return toString;
	}
}

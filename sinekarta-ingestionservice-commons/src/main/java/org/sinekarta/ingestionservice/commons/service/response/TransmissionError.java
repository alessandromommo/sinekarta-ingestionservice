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
package org.sinekarta.ingestionservice.commons.service.response;

/**
 * @author Alessandro Mommo
 *
 */
public enum TransmissionError {
	
	NO_ERROR(100) {
	    public String toString() {
	        return "Ingestion request successfully received";
	    }
	},
	 
	GENERIC_ERROR(200) {
	    public String toString() {
	        return "Unable to complete request due to an unexpected error";
	    }
	}, 
	
	MISSED_RESPONSE_PORT_ADDRESS(300) {
	    public String toString() {
	        return "Address of responses end point is missing";
	    }
	}, 
	
	MISSED_SIP(400) {
	    public String toString() {
	        return "Required input for METS document is missing";
	    }
	}, 
	
	MISSED_SIP_ADDRESS(500) {
	    public String toString() {
	        return "Required input for METS document address is missing";
	    }
	};
	
	private int value;
	
	TransmissionError(int value) {
        this.value = value;
    }
	
	public int getValue() {
        return this.value;
    }

}

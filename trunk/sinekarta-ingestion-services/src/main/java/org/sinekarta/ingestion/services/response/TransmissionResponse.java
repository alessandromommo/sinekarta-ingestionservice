package org.sinekarta.ingestion.services.response;

public class TransmissionResponse {
	
	private long responseId;
	private String responseMessage;
	
	/**
	 * @return the responseId
	 */
	public long getResponseId() {
		return responseId;
	}
	/**
	 * @param responseId the responseId to set
	 */
	public void setResponseId(long responseId) {
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

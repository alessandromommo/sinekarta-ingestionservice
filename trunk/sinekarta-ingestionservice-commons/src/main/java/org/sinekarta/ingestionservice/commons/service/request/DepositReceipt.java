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
package org.sinekarta.ingestionservice.commons.service.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;


/**
 * @author Alessandro Mommo
 *
 */
public class DepositReceipt {
	
	private Date receipDate;
	private Date depositDate;
	
	private String receiptId;
	private String depositId;
	
	@XmlElement
	private List<FileDetails> fileDetails;

	/**
	 * 
	 */
	public DepositReceipt() {
		receipDate = new Date();
		fileDetails = new ArrayList<FileDetails>();
	}
	
	/**
	 * @return the fileDetails
	 */
	public List<FileDetails> getFileDetails() {
		return fileDetails;
	}

	/**
	 * @return the receipDate
	 */
	public Date getReceipDate() {
		return receipDate;
	}

	/**
	 * @param receipDate the receipDate to set
	 */
	public void setReceipDate(Date receipDate) {
		this.receipDate = receipDate;
	}

	/**
	 * @return the depositDate
	 */
	public Date getDepositDate() {
		return depositDate;
	}

	/**
	 * @param depositDate the depositDate to set
	 */
	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}

	/**
	 * @return the receiptId
	 */
	public String getReceiptId() {
		return receiptId;
	}

	/**
	 * @param receiptId the receiptId to set
	 */
	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	/**
	 * @return the depositId
	 */
	public String getDepositId() {
		return depositId;
	}

	/**
	 * @param depositId the depositId to set
	 */
	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}
	
}

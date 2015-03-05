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
package org.sinekarta.ingestionservice.service.request;

import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.log4j.Logger;
import org.sinekarta.ingestionservice.mets.FileType;
import org.sinekarta.ingestionservice.mets.FileType.FLocat;
import org.sinekarta.ingestionservice.mets.Mets;
import org.sinekarta.ingestionservice.mets.MetsType.FileSec.FileGrp;


/**
 * @author Alessandro Mommo
 *
 */
public class MetsDocument extends Mets {
	
	private static final Logger LOG = Logger.getLogger(MetsDocument.class.getName());
	
	
	protected List<Metadata> metadataGrp;

	
	public String toXmlString() {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance("org.sinekarta.ingestionservice.mets");
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			 
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 
			StringWriter writer = new StringWriter();
			jaxbMarshaller.marshal(this, writer);
			
			String ret = writer.toString();
			
			return ret;
			
		} catch (JAXBException e) {
			LOG.error("Unable to obtain a string from MetsDocument: " + e.getMessage());
		}
		
		return null;
	}
	
	public void addFile() {
		
	}
	
	public void addLinkToFile() {
		
	}

	public FileGrp getFileGrp(String id) {
		return null;
	}
	
	public static void main(String args[]) throws java.lang.Exception {
		
		MetsDocument doc = new MetsDocument();
		
		doc.setID("2222222222222");
		doc.setTYPE("OBJ");
		
		FileSec fileSec = new FileSec();
		FileGrp fileGrp = new FileGrp();
		FileType fileType = new FileType();
		fileType.setID("001");
		
		FLocat fLocat = new FLocat();
		fLocat.setHref("www.loc.it");
		fileType.getFLocat().add(fLocat);
		
		fileGrp.getFile().add(fileType);
		fileSec.getFileGrp().add(fileGrp);
		doc.setFileSec(fileSec);
		
		String out = doc.toXmlString();
		if(out != null)
			System.out.println(out);
		else
			LOG.error("Unable to print METS document");
	}
}

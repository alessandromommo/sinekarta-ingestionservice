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
package org.sinekarta.ingestionservice.commons;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.sinekarta.ingestionservice.commons.mods.ModsDefinition;



/**
 * @author Alessandro Mommo
 *
 */
public class ModsUtils {
	
	private static final Logger LOG = Logger.getLogger(ModsUtils.class.getName());

	private static String JAXB_CONTEXT = "org.sinekarta.ingestionservice.commons.metadata:" 
			+ "org.sinekarta.ingestionservice.commons.mets:"
			+ "org.sinekarta.ingestionservice.commons.mods";
	
	public static ModsDefinition fromXmlFile(File file) {
		ModsDefinition mods = null;
		
		try {
			
			JAXBContext jaxbContext = JAXBContext.newInstance(JAXB_CONTEXT);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			mods = (ModsDefinition) jaxbUnmarshaller.unmarshal(file);
			
		} catch (JAXBException e) {
			LOG.error("Unable to obtain a ModsDefinition object from file " + file.getName() + ": " + e.getMessage());
		}
		 
		return mods;
	}
	
	public static String toXmlString(ModsDefinition mods) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(JAXB_CONTEXT);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			 
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 
			StringWriter writer = new StringWriter();
			jaxbMarshaller.marshal(mods, writer);
			
			String ret = writer.toString();
			
			return ret;
			
		} catch (JAXBException e) {
			LOG.error("Unable to obtain a XML string from ModsDefinition object: " + e.getMessage());
		}
		
		return null;
	}
	
}

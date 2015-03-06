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
import org.sinekarta.ingestionservice.commons.mets.Mets;



/**
 * @author Alessandro Mommo
 *
 */
public class MetsUtils {
	
	private static final Logger LOG = Logger.getLogger(MetsUtils.class.getName());

	private static String JAXB_CONTEXT = "org.sinekarta.ingestionservice.commons.metadata:" 
			+ "org.sinekarta.ingestionservice.commons.mets:"
			+ "org.sinekarta.ingestionservice.commons.mods";
	
	public static Mets fromXmlFile(File file) {
		Mets mets = null;
		
		try {
			
			JAXBContext jaxbContext = JAXBContext.newInstance(JAXB_CONTEXT);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			mets = (Mets) jaxbUnmarshaller.unmarshal(file);
			
		} catch (JAXBException e) {
			LOG.error("Unable to obtain a Mets object from file " + file.getName() + ": " + e.getMessage());
		}
		 
		return mets;
	}
	
	public static String toXmlString(Mets mets) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(JAXB_CONTEXT);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			 
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 
			StringWriter writer = new StringWriter();
			jaxbMarshaller.marshal(mets, writer);
			
			String ret = writer.toString();
			
			return ret;
			
		} catch (JAXBException e) {
			LOG.error("Unable to obtain a XML string from Mets object: " + e.getMessage());
		}
		
		return null;
	}
	
		
	//public static void main(String args[]) throws java.lang.Exception {
		
//		Mets doc = new Mets();
//		
//		doc.setID("2222222222222");
//		doc.setTYPE("OBJ");
//
//		FileSec fileSec = new FileSec();
//		FileGrp fileGrp = new FileGrp();
//		FileType fileType = new FileType();
//		fileType.setID("001");
//		
//		FLocat fLocat = new FLocat();
//		fLocat.setHref("www.loc.it");
//		fileType.getFLocat().add(fLocat);
//		
//		fileGrp.getFile().add(fileType);
//		fileSec.getFileGrp().add(fileGrp);
//		doc.setFileSec(fileSec);
//		
		
		
		
//		File file = new File("src/test/resources/mets1Test.xml");
//		Mets mets = MetsUtils.fromXmlFile(file);
//		
//		String out = MetsUtils.toXmlString(mets);
//		if(out != null)
//			LOG.debug(out);
//		else
//			LOG.error("Unable to print METS document");
//		
//		List<Object> any = mets.getDmdSec().get(0).getMdWrap().getXmlData().getAny();
//		
//		for(int i = 0; i < any.size(); i++) {
//			Mods mods = (Mods)any.get(i);
//			out = ModsUtils.toXmlString(mods);
//			if(out != null)
//				LOG.debug(out);
//			else
//				LOG.error("Unable to print MODS document");
//		}
		
//		InputStream in = new FileInputStream(args[0]);
//
//        METSReader mr = new METSReader();
//        mr.mapToDOM(in);
//        
//        METSWrapper mw = new METSWrapper(mr.getMETSDocument());
//		mw.validate();
//		
//        mets = mw.getMETSObject();
//
//        System.out.println("Package Type of " + mets.getType() + ", using profile: " + mets.getProfile());
//
//		MetsHdr mh = mets.getMetsHdr();
//		if (mh != null)
//		{
//			System.out.println("Package create date: " + mh.getCreateDate());
//			System.out.println("Package last modified date: " + mh.getLastModDate());
//		
//			List<Agent> agents = mh.getAgents();
//	        for (Iterator<Agent> i = agents.iterator(); i.hasNext();)
//    	    {
//        		Agent a = i.next();
//   				System.out.println("Agent " + a.getName() + " has role " + a.getRole());
//	        }
//	    }
//		      
//        FileSec fileSec = mets.getFileSec();
//        if (fileSec != null)
//        {
//            List<FileGrp> fgs = fileSec.getFileGrps();
//            for (Iterator<FileGrp> i = fgs.iterator(); i.hasNext();)
//            {
//        	    FileGrp fg = i.next();
//   			    System.out.println("FileGrp of use " + fg.getUse());
//            }
//        }
//
//		List<StructMap> sms = mets.getStructMaps();
//		
//		System.out.println("Package has " + sms.size() + " structMap(s)");
//		
//		// let's look at the first StructMap
//		StructMap sm = sms.get(0);
//		
//		showDivInfo(sm.getDivs());
		
//    }
//    
//    
//    private static void showDivInfo(List<Div> divs) throws METSException
//    {
//        for (Iterator<Div> divi = divs.iterator(); divi.hasNext();)
//        {
//            Div div = divi.next();
//
//           	System.out.println("Div type of " + div.getType() + " with DMDID " + div.getDmdID() + " contains metadata of type " + mets.getDmdSec(div.getDmdID()).getMDType());
//       	       	
//           	showDivInfo(div.getDivs());
//        }
//    }
	
}

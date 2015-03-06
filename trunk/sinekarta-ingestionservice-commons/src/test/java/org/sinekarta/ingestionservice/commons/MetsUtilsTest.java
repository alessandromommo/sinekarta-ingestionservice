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

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sinekarta.ingestionservice.commons.mets.FileType;
import org.sinekarta.ingestionservice.commons.mets.Mets;
import org.sinekarta.ingestionservice.commons.mets.FileType.FLocat;
import org.sinekarta.ingestionservice.commons.mets.MetsType.FileSec;
import org.sinekarta.ingestionservice.commons.mets.MetsType.FileSec.FileGrp;

/**
 * @author Alessandro Mommo
 *
 */
public class MetsUtilsTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.sinekarta.ingestionservice.commons.metadata.MetsUtils#fromXmlFile(java.io.File)}.
	 */
	@Test
	public void testFromXmlFile() {
		File file = new File("src/test/resources/mets1Test.xml");
		Mets mets = MetsUtils.fromXmlFile(file);
		
		assertNotNull(mets);
		assertTrue(mets.getDmdSec().get(0).getID().compareTo("dmd1") == 0);
		assertTrue(mets.getDmdSec().get(0).getMdWrap().getXmlData().getAny().size() == 1);
	}

	/**
	 * Test method for {@link org.sinekarta.ingestionservice.commons.metadata.MetsUtils#toXmlString()}.
	 */
	@Test
	public void testToXmlString() {
		Mets doc = new Mets();
		
		doc.setID("METS-01");
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
		
		String out = MetsUtils.toXmlString(doc);
		
		assertNotNull(out);
		assertTrue(out.contains("ID=\"METS-01\""));
		assertTrue(out.contains("file ID=\"001\""));
		assertTrue(out.contains("href=\"www.loc.it\""));
	}

}

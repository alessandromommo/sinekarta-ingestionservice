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
package org.sinekarta.ingestionservice.client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sinekarta.ingestionservice.mets.Mets;
import org.sinekarta.ingestionservice.service.response.TransmissionResponse;


/**
 * @author Alessandro Mommo
 *
 */
public class ServiceIngestTransmitClientTest {

	private static final String SERVICE_PORT = "http://localhost:8080/sinekarta-ingestionservice-service/services/ServiceIngestTransmitImplPort";
	
	private static ServiceIngestTransmitClient client;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		client = new ServiceIngestTransmitClient(SERVICE_PORT);
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
	 * Test method for {@link org.sinekarta.ingestionservice.client.ServiceIngestTransmitClient#transmitSip(org.sinekarta.ingestionservice.mets.Mets, java.lang.String)}.
	 */
	@Test
	public void testTransmitSip() {
		// Test both parameters null
		TransmissionResponse response = client.transmitSip(null, null);
		assertNotNull("ResponseType should not be null", response);
		assertTrue("ResponseId should be != 0", response.getTransmissionId() != 0);
		assertNotNull("Response date should not be null", response.getTransmissionDate());
		assertTrue(response.getTransmissionErrors().toString().contains("[300, 400]"));
		assertTrue(response.getTransmissionMessages().toString().contains("[Address of responses end point is missing, Required input for METS document is missing]"));
		
		// Test second parameter null
		response = client.transmitSip("http://www.loc.gov", null);
		assertNotNull("ResponseType should not be null", response);
		assertTrue("ResponseId should be != 0", response.getTransmissionId() != 0);
		assertNotNull("Response date should not be null", response.getTransmissionDate());
		assertTrue(response.getTransmissionErrors().toString().contains("[400]"));
		assertTrue(response.getTransmissionMessages().toString().contains("[Required input for METS document is missing]"));
		
		// Test correct invocation
		Mets sip = new Mets();
		response = client.transmitSip("http://www.loc.gov", sip);
		assertNotNull("ResponseType should not be null", response);
		assertTrue("ResponseId should be != 0", response.getTransmissionId() != 0);
		assertNotNull("Response date should not be null", response.getTransmissionDate());
		assertTrue(response.getTransmissionErrors().toString().contains("[100]"));
		assertTrue(response.getTransmissionMessages().toString().contains("[Ingestion request successfully received]"));
		
		// Test bad URL invocation
		response = client.transmitSip("http://www.loc.go", sip);
		assertNotNull("ResponseType should not be null", response);
		assertTrue("ResponseId should be != 0", response.getTransmissionId() != 0);
		assertNotNull("Response date should not be null", response.getTransmissionDate());
		assertTrue(response.getTransmissionErrors().toString().contains("[300]"));
		assertTrue(response.getTransmissionMessages().toString().contains("[Address of responses end point is missing]"));
	}

	/**
	 * Test method for {@link org.sinekarta.ingestionservice.client.ServiceIngestTransmitClient#transmitLinkToSip(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testTransmitLinkToSip() {
		// Test both parameters null
		TransmissionResponse response = client.transmitLinkToSip(null, null);
		assertNotNull("ResponseType should not be null", response);
		assertTrue("ResponseId should be != 0", response.getTransmissionId() != 0);
		assertNotNull("Response date should not be null", response.getTransmissionDate());
		assertTrue(response.getTransmissionErrors().toString().contains("[300, 500]"));
		assertTrue(response.getTransmissionMessages().toString().contains("[Address of responses end point is missing, Required input for METS document address is missing]"));
		
		// Test second parameter null
		response = client.transmitLinkToSip("http://www.loc.gov", null);
		assertNotNull("ResponseType should not be null", response);
		assertTrue("ResponseId should be != 0", response.getTransmissionId() != 0);
		assertNotNull("Response date should not be null", response.getTransmissionDate());
		assertTrue(response.getTransmissionErrors().toString().contains("[500]"));
		assertTrue(response.getTransmissionMessages().toString().contains("[Required input for METS document address is missing]"));
		
		// Test correct invocation
		response = client.transmitLinkToSip("http://www.loc.gov", "http://www.loc.gov");
		assertNotNull("ResponseType should not be null", response);
		assertTrue("ResponseId should be != 0", response.getTransmissionId() != 0);
		assertNotNull("Response date should not be null", response.getTransmissionDate());
		assertTrue(response.getTransmissionErrors().toString().contains("[100]"));
		assertTrue(response.getTransmissionMessages().toString().contains("[Ingestion request successfully received]"));
		
		// Test bad URL invocation
		response = client.transmitLinkToSip("http://www.loc.gov", "http://www.loc.go");
		assertNotNull("ResponseType should not be null", response);
		assertTrue("ResponseId should be != 0", response.getTransmissionId() != 0);
		assertNotNull("Response date should not be null", response.getTransmissionDate());
		assertTrue(response.getTransmissionErrors().toString().contains("[500]"));
		assertTrue(response.getTransmissionMessages().toString().contains("[Required input for METS document address is missing]"));
	}

}

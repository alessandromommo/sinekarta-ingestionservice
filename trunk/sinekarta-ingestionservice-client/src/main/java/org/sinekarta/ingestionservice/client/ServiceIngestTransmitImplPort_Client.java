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

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.sinekarta.ingestionservice.mets.Mets;
import org.sinekarta.ingestionservice.service.ServiceIngestTransmit;
import org.sinekarta.ingestionservice.service.response.TransmissionResponse;



public final class ServiceIngestTransmitImplPort_Client {

    //private static final QName SERVICE_NAME = new QName("http://ws.service.jenia.org/", "ServiceIngestTransmitImplService");

    private ServiceIngestTransmitImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        
    	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(ServiceIngestTransmit.class);
        factory.setAddress("http://localhost:8080/sinekarta-ingestionservice-service/services/ServiceIngestTransmitImplPort");
        ServiceIngestTransmit client = (ServiceIngestTransmit) factory.create();
        
        Mets mets = new Mets();
        TransmissionResponse reply = client.transmitSip("Testing it!", mets);
        System.out.println("Server said: " + reply);
        
        
    	/*
    	URL wsdlURL = ServiceIngestTransmitImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ServiceIngestTransmitImplService ss = new ServiceIngestTransmitImplService(wsdlURL, SERVICE_NAME);
        ServiceIngestTransmit port = ss.getServiceIngestTransmitImplPort();  
        
        {
        System.out.println("Invoking transmitLink...");
        java.lang.String _transmitLink_arg0 = "_transmitLink_arg0842990279";
        java.lang.String _transmitLink_arg1 = "_transmitLink_arg11290987725";
        java.lang.String _transmitLink__return = port.transmitLink(_transmitLink_arg0, _transmitLink_arg1);
        System.out.println("transmitLink.result=" + _transmitLink__return);


        }
        {
        System.out.println("Invoking transmitSip...");
        java.lang.String _transmitSip_arg0 = "_transmitSip_arg0-554243197";
        java.lang.String _transmitSip__return = port.transmitSip(_transmitSip_arg0);
        System.out.println("transmitSip.result=" + _transmitSip__return);


        }
		
		*/
    	
    	
        System.exit(0);
    }

}

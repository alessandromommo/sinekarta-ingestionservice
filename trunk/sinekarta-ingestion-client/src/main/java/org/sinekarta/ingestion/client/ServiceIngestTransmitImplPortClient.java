
package org.sinekarta.ingestion.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.sinekarta.ingestion.beans.Mets;
import org.sinekarta.ingestion.services.ServiceIngestTransmit;
import org.sinekarta.ingestion.services.response.TransmissionResponse;


public final class ServiceIngestTransmitImplPortClient {

    //private static final QName SERVICE_NAME = new QName("http://ws.service.jenia.org/", "ServiceIngestTransmitImplService");

    private ServiceIngestTransmitImplPortClient() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        
    	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(ServiceIngestTransmit.class);
        factory.setAddress("http://localhost:8080/sinekarta-ingestion-services/ServiceIngestTransmitImplPort");
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


/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.sinekarta.ingestion.services;

import java.util.logging.Logger;

import org.sinekarta.ingestion.beans.Mets;
import org.sinekarta.ingestion.services.response.TransmissionResponse;


@javax.jws.WebService(
                      serviceName = "ServiceIngestTransmitImplService",
                      portName = "ServiceIngestTransmitImplPort",
                      targetNamespace = "http://ws.service.jenia.org/",
                      endpointInterface = "org.sinekarta.ingestion.services.ServiceIngestTransmit")
                      
public class ServiceIngestTransmitImplPort implements ServiceIngestTransmit {

    private static final Logger LOG = Logger.getLogger(ServiceIngestTransmitImplPort.class.getName());

    /* (non-Javadoc)
     * @see org.jenia.service.ws.ServiceIngestTransmit#transmitSip(java.lang.String  arg0, org.sinekarta.ingestion.beans.Mets arg1 )*
     */
	@Override
	public TransmissionResponse transmitSip(String arg0, Mets arg1) {
		LOG.info("Executing operation transmitSip");
		TransmissionResponse resp = new TransmissionResponse();
		resp.setResponseId(1l);
		resp.setResponseMessage("transmitSip OK");
		
		return resp;
	}

	/* (non-Javadoc)
     * @see org.jenia.service.ws.ServiceIngestTransmit#transmitSip(java.lang.String  arg0, java.lang.String  arg1)*
     */
	@Override
	public TransmissionResponse transmitLinkToSip(String arg0, String arg1) {
		LOG.info("Executing operation transmitLinkToSip");
		TransmissionResponse resp = new TransmissionResponse();
		resp.setResponseId(1l);
		resp.setResponseMessage("transmitLinkToSip OK");
		
		return resp;
	}

}

package org.sinekarta.ingestion.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;


@WebServiceClient(name = "ServiceIngestTransmitImplService", 
                  targetNamespace = "http://ws.service.jenia.org/") 
public class ServiceIngestTransmitImplService extends Service {

	
    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.service.jenia.org/", "ServiceIngestTransmitImplService");
    public final static QName ServiceIngestTransmitImplPort = new QName("http://ws.service.jenia.org/", "ServiceIngestTransmitImplPort");
    public final static String WSDL_URL = "http://localhost:8080/sinekarta-service-ingest/ServiceIngestTransmitImplPort?wsdl";
    
    static {
        URL url = null;
        
        try {
            url = new URL(WSDL_URL);
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceIngestTransmitImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", WSDL_URL);
        }
        
        WSDL_LOCATION = url;
    }

    public ServiceIngestTransmitImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceIngestTransmitImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceIngestTransmitImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceIngestTransmitImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceIngestTransmitImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceIngestTransmitImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns ServiceIngestTransmit
     */
    @WebEndpoint(name = "ServiceIngestTransmitImplPort")
    public ServiceIngestTransmit getServiceIngestTransmitImplPort() {
        return super.getPort(ServiceIngestTransmitImplPort, ServiceIngestTransmit.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceIngestTransmit
     */
    @WebEndpoint(name = "ServiceIngestTransmitImplPort")
    public ServiceIngestTransmit getServiceIngestTransmitImplPort(WebServiceFeature... features) {
        return super.getPort(ServiceIngestTransmitImplPort, ServiceIngestTransmit.class, features);
    }

}

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
package org.sinekarta.ingestionservice.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * 
 * @author Alessandro Mommo
 *
 */

@WebServiceClient(name = "ServiceIngestTransmitImplService", 
                  targetNamespace = "http://ws.service.sinekarta.org/") 
public class ServiceIngestTransmitImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.service.sinekarta.org/", "ServiceIngestTransmitImplService");
    public final static QName ServiceIngestTransmitImplPort = new QName("http://ws.service.sinekarta.org/", "ServiceIngestTransmitImplPort");
    public final static String WSDL_URL = "http://localhost:8080/sinekarta-ingestionservice/services/ServiceIngestTransmitImplPort?wsdl";
    
    static {
        URL url = null;
        
        try {
            url = new URL(WSDL_URL);
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceIngestTransmitImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/sinekarta-ingestionservice/services/ServiceIngestTransmitImplPort?wsdl");
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

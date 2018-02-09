
package com.suqc.ws.cxffile;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FileWSService", targetNamespace = "http://impl.service.ws.suqc.com/file", wsdlLocation = "http://localhost:8080/ws/file?wsdl")
public class FileWSService
    extends Service
{

    private final static URL FILEWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException FILEWSSERVICE_EXCEPTION;
    private final static QName FILEWSSERVICE_QNAME = new QName("http://impl.service.ws.suqc.com/file", "FileWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/file?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FILEWSSERVICE_WSDL_LOCATION = url;
        FILEWSSERVICE_EXCEPTION = e;
    }

    public FileWSService() {
        super(__getWsdlLocation(), FILEWSSERVICE_QNAME);
    }

    public FileWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FILEWSSERVICE_QNAME, features);
    }

    public FileWSService(URL wsdlLocation) {
        super(wsdlLocation, FILEWSSERVICE_QNAME);
    }

    public FileWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FILEWSSERVICE_QNAME, features);
    }

    public FileWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FileWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FileWS
     */
    @WebEndpoint(name = "FileWSPort")
    public FileWS getFileWSPort() {
        return super.getPort(new QName("http://impl.service.ws.suqc.com/file", "FileWSPort"), FileWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FileWS
     */
    @WebEndpoint(name = "FileWSPort")
    public FileWS getFileWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.ws.suqc.com/file", "FileWSPort"), FileWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FILEWSSERVICE_EXCEPTION!= null) {
            throw FILEWSSERVICE_EXCEPTION;
        }
        return FILEWSSERVICE_WSDL_LOCATION;
    }

}
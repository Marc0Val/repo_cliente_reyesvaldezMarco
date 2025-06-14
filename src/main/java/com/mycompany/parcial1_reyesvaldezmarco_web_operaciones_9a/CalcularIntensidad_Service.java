
package com.mycompany.parcial1_reyesvaldezmarco_web_operaciones_9a;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "calcularIntensidad", targetNamespace = "http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", wsdlLocation = "http://localhost:8080/parcial1_reyesvaldezMarco_web_operaciones_9a/calcularIntensidad?wsdl")
public class CalcularIntensidad_Service
    extends Service
{

    private static final URL CALCULARINTENSIDAD_WSDL_LOCATION;
    private static final WebServiceException CALCULARINTENSIDAD_EXCEPTION;
    private static final QName CALCULARINTENSIDAD_QNAME = new QName("http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", "calcularIntensidad");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/parcial1_reyesvaldezMarco_web_operaciones_9a/calcularIntensidad?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULARINTENSIDAD_WSDL_LOCATION = url;
        CALCULARINTENSIDAD_EXCEPTION = e;
    }

    public CalcularIntensidad_Service() {
        super(__getWsdlLocation(), CALCULARINTENSIDAD_QNAME);
    }

    public CalcularIntensidad_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULARINTENSIDAD_QNAME, features);
    }

    public CalcularIntensidad_Service(URL wsdlLocation) {
        super(wsdlLocation, CALCULARINTENSIDAD_QNAME);
    }

    public CalcularIntensidad_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULARINTENSIDAD_QNAME, features);
    }

    public CalcularIntensidad_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalcularIntensidad_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalcularIntensidad
     */
    @WebEndpoint(name = "calcularIntensidadPort")
    public CalcularIntensidad getCalcularIntensidadPort() {
        return super.getPort(new QName("http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", "calcularIntensidadPort"), CalcularIntensidad.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalcularIntensidad
     */
    @WebEndpoint(name = "calcularIntensidadPort")
    public CalcularIntensidad getCalcularIntensidadPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", "calcularIntensidadPort"), CalcularIntensidad.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULARINTENSIDAD_EXCEPTION!= null) {
            throw CALCULARINTENSIDAD_EXCEPTION;
        }
        return CALCULARINTENSIDAD_WSDL_LOCATION;
    }

}

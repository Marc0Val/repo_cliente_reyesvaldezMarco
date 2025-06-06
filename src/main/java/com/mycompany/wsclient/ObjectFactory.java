
package com.mycompany.wsclient;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.wsclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _CalcularMasa_QNAME = new QName("http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", "calcularMasa");
    private static final QName _CalcularMasaResponse_QNAME = new QName("http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", "calcularMasaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularMasa }
     * 
     * @return
     *     the new instance of {@link CalcularMasa }
     */
    public CalcularMasa createCalcularMasa() {
        return new CalcularMasa();
    }

    /**
     * Create an instance of {@link CalcularMasaResponse }
     * 
     * @return
     *     the new instance of {@link CalcularMasaResponse }
     */
    public CalcularMasaResponse createCalcularMasaResponse() {
        return new CalcularMasaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularMasa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularMasa }{@code >}
     */
    @XmlElementDecl(namespace = "http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", name = "calcularMasa")
    public JAXBElement<CalcularMasa> createCalcularMasa(CalcularMasa value) {
        return new JAXBElement<>(_CalcularMasa_QNAME, CalcularMasa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularMasaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularMasaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", name = "calcularMasaResponse")
    public JAXBElement<CalcularMasaResponse> createCalcularMasaResponse(CalcularMasaResponse value) {
        return new JAXBElement<>(_CalcularMasaResponse_QNAME, CalcularMasaResponse.class, null, value);
    }

}

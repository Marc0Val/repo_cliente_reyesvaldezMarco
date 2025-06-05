
package com.mycompany.parcial1_reyesvaldezmarco_web_operaciones_9a;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.parcial1_reyesvaldezmarco_web_operaciones_9a package. 
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

    private static final QName _CalcularIntensidad_QNAME = new QName("http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", "calcularIntensidad");
    private static final QName _CalcularIntensidadResponse_QNAME = new QName("http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", "calcularIntensidadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.parcial1_reyesvaldezmarco_web_operaciones_9a
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularIntensidad_Type }
     * 
     * @return
     *     the new instance of {@link CalcularIntensidad_Type }
     */
    public CalcularIntensidad_Type createCalcularIntensidad_Type() {
        return new CalcularIntensidad_Type();
    }

    /**
     * Create an instance of {@link CalcularIntensidadResponse }
     * 
     * @return
     *     the new instance of {@link CalcularIntensidadResponse }
     */
    public CalcularIntensidadResponse createCalcularIntensidadResponse() {
        return new CalcularIntensidadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularIntensidad_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularIntensidad_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", name = "calcularIntensidad")
    public JAXBElement<CalcularIntensidad_Type> createCalcularIntensidad(CalcularIntensidad_Type value) {
        return new JAXBElement<>(_CalcularIntensidad_QNAME, CalcularIntensidad_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularIntensidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularIntensidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://parcial1_reyesvaldezmarco_web_operaciones_9a.mycompany.com/", name = "calcularIntensidadResponse")
    public JAXBElement<CalcularIntensidadResponse> createCalcularIntensidadResponse(CalcularIntensidadResponse value) {
        return new JAXBElement<>(_CalcularIntensidadResponse_QNAME, CalcularIntensidadResponse.class, null, value);
    }

}

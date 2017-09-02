
package BancoChibchaController;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the BancoChibchaController package. 
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

    private final static QName _ConsultaPrestamoResponse_QNAME = new QName("http://controller/", "consultaPrestamoResponse");
    private final static QName _ConsultaPrestamo_QNAME = new QName("http://controller/", "consultaPrestamo");
    private final static QName _ConsultaPrestamoResponseReturn_QNAME = new QName("http://controller/", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: BancoChibchaController
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link String2StringHashMap }
     * 
     */
    public String2StringHashMap createString2StringHashMap() {
        return new String2StringHashMap();
    }

    /**
     * Create an instance of {@link ConsultaPrestamo }
     * 
     */
    public ConsultaPrestamo createConsultaPrestamo() {
        return new ConsultaPrestamo();
    }

    /**
     * Create an instance of {@link ConsultaPrestamoResponse }
     * 
     */
    public ConsultaPrestamoResponse createConsultaPrestamoResponse() {
        return new ConsultaPrestamoResponse();
    }

    /**
     * Create an instance of {@link String2StringHashMap.Entry }
     * 
     */
    public String2StringHashMap.Entry createString2StringHashMapEntry() {
        return new String2StringHashMap.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPrestamoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "consultaPrestamoResponse")
    public JAXBElement<ConsultaPrestamoResponse> createConsultaPrestamoResponse(ConsultaPrestamoResponse value) {
        return new JAXBElement<ConsultaPrestamoResponse>(_ConsultaPrestamoResponse_QNAME, ConsultaPrestamoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPrestamo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "consultaPrestamo")
    public JAXBElement<ConsultaPrestamo> createConsultaPrestamo(ConsultaPrestamo value) {
        return new JAXBElement<ConsultaPrestamo>(_ConsultaPrestamo_QNAME, ConsultaPrestamo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String2StringHashMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "return", scope = ConsultaPrestamoResponse.class)
    public JAXBElement<String2StringHashMap> createConsultaPrestamoResponseReturn(String2StringHashMap value) {
        return new JAXBElement<String2StringHashMap>(_ConsultaPrestamoResponseReturn_QNAME, String2StringHashMap.class, ConsultaPrestamoResponse.class, value);
    }

}

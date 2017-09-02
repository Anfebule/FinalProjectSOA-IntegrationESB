package BancoChibchaController;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-09-01T19:04:21.596-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "IConsultaPrestamo", 
                  wsdlLocation = "http://localhost:8082/BancoChibcha?wsdl",
                  targetNamespace = "http://controller/") 
public class IConsultaPrestamo extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://controller/", "IConsultaPrestamo");
    public final static QName IConsultaPrestamoPort = new QName("http://controller/", "IConsultaPrestamoPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8082/BancoChibcha?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IConsultaPrestamo.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8082/BancoChibcha?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IConsultaPrestamo(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IConsultaPrestamo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IConsultaPrestamo() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IConsultaPrestamo(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IConsultaPrestamo(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IConsultaPrestamo(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IConsultaPrestamoPortType
     */
    @WebEndpoint(name = "IConsultaPrestamoPort")
    public IConsultaPrestamoPortType getIConsultaPrestamoPort() {
        return super.getPort(IConsultaPrestamoPort, IConsultaPrestamoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IConsultaPrestamoPortType
     */
    @WebEndpoint(name = "IConsultaPrestamoPort")
    public IConsultaPrestamoPortType getIConsultaPrestamoPort(WebServiceFeature... features) {
        return super.getPort(IConsultaPrestamoPort, IConsultaPrestamoPortType.class, features);
    }

}
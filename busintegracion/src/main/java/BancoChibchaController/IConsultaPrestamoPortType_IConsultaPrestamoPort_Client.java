
package BancoChibchaController;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-09-01T19:04:21.588-05:00
 * Generated source version: 2.7.18
 * 
 */
public final class IConsultaPrestamoPortType_IConsultaPrestamoPort_Client {

    private static final QName SERVICE_NAME = new QName("http://controller/", "IConsultaPrestamo");

    private IConsultaPrestamoPortType_IConsultaPrestamoPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = IConsultaPrestamo.WSDL_LOCATION;
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
      
        IConsultaPrestamo ss = new IConsultaPrestamo(wsdlURL, SERVICE_NAME);
        IConsultaPrestamoPortType port = ss.getIConsultaPrestamoPort();  
        
        {
        System.out.println("Invoking consultaPrestamo...");
        BancoChibchaController.String2StringHashMap _consultaPrestamo__return = port.consultaPrestamo();
        System.out.println("consultaPrestamo.result=" + _consultaPrestamo__return);


        }

        System.exit(0);
    }

}

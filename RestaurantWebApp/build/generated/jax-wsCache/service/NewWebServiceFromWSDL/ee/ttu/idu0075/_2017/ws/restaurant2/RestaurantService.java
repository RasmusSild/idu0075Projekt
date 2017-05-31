
package ee.ttu.idu0075._2017.ws.restaurant2;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RestaurantService", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", wsdlLocation = "file:/C:/Users/HP/Documents/NetBeansProjects/RestaurantWebApp/src/conf/xml-resources/web-services/NewWebServiceFromWSDL/wsdl/RestaurantService.wsdl")
public class RestaurantService
    extends Service
{

    private final static URL RESTAURANTSERVICE_WSDL_LOCATION;
    private final static WebServiceException RESTAURANTSERVICE_EXCEPTION;
    private final static QName RESTAURANTSERVICE_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/restaurant2", "RestaurantService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/HP/Documents/NetBeansProjects/RestaurantWebApp/src/conf/xml-resources/web-services/NewWebServiceFromWSDL/wsdl/RestaurantService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESTAURANTSERVICE_WSDL_LOCATION = url;
        RESTAURANTSERVICE_EXCEPTION = e;
    }

    public RestaurantService() {
        super(__getWsdlLocation(), RESTAURANTSERVICE_QNAME);
    }

    public RestaurantService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESTAURANTSERVICE_QNAME, features);
    }

    public RestaurantService(URL wsdlLocation) {
        super(wsdlLocation, RESTAURANTSERVICE_QNAME);
    }

    public RestaurantService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESTAURANTSERVICE_QNAME, features);
    }

    public RestaurantService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RestaurantService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OrderPortType
     */
    @WebEndpoint(name = "OrderPort")
    public OrderPortType getOrderPort() {
        return super.getPort(new QName("http://www.ttu.ee/idu0075/2017/ws/restaurant2", "OrderPort"), OrderPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderPortType
     */
    @WebEndpoint(name = "OrderPort")
    public OrderPortType getOrderPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ttu.ee/idu0075/2017/ws/restaurant2", "OrderPort"), OrderPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESTAURANTSERVICE_EXCEPTION!= null) {
            throw RESTAURANTSERVICE_EXCEPTION;
        }
        return RESTAURANTSERVICE_WSDL_LOCATION;
    }

}

package ee.ttu.idu0075._2017.ws.restaurant2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2017.ws.restaurant2 package. 
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

    private final static QName _GetDishResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/restaurant2", "getDishResponse");
    private final static QName _AddDishResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/restaurant2", "addDishResponse");
    private final static QName _GetOrderResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/restaurant2", "getOrderResponse");
    private final static QName _AddOrderResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/restaurant2", "addOrderResponse");
    private final static QName _GetOrderDishListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/restaurant2", "getOrderDishListResponse");
    private final static QName _AddOrderDishResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/restaurant2", "addOrderDishResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2017.ws.restaurant2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDishRequest }
     * 
     */
    public GetDishRequest createGetDishRequest() {
        return new GetDishRequest();
    }

    /**
     * Create an instance of {@link DishType }
     * 
     */
    public DishType createDishType() {
        return new DishType();
    }

    /**
     * Create an instance of {@link AddDishRequest }
     * 
     */
    public AddDishRequest createAddDishRequest() {
        return new AddDishRequest();
    }

    /**
     * Create an instance of {@link GetDishListRequest }
     * 
     */
    public GetDishListRequest createGetDishListRequest() {
        return new GetDishListRequest();
    }

    /**
     * Create an instance of {@link GetDishListResponse }
     * 
     */
    public GetDishListResponse createGetDishListResponse() {
        return new GetDishListResponse();
    }

    /**
     * Create an instance of {@link GetOrderRequest }
     * 
     */
    public GetOrderRequest createGetOrderRequest() {
        return new GetOrderRequest();
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link AddOrderRequest }
     * 
     */
    public AddOrderRequest createAddOrderRequest() {
        return new AddOrderRequest();
    }

    /**
     * Create an instance of {@link GetOrderListRequest }
     * 
     */
    public GetOrderListRequest createGetOrderListRequest() {
        return new GetOrderListRequest();
    }

    /**
     * Create an instance of {@link GetOrderListResponse }
     * 
     */
    public GetOrderListResponse createGetOrderListResponse() {
        return new GetOrderListResponse();
    }

    /**
     * Create an instance of {@link GetOrderDishListRequest }
     * 
     */
    public GetOrderDishListRequest createGetOrderDishListRequest() {
        return new GetOrderDishListRequest();
    }

    /**
     * Create an instance of {@link OrderDishListType }
     * 
     */
    public OrderDishListType createOrderDishListType() {
        return new OrderDishListType();
    }

    /**
     * Create an instance of {@link AddOrderDishRequest }
     * 
     */
    public AddOrderDishRequest createAddOrderDishRequest() {
        return new AddOrderDishRequest();
    }

    /**
     * Create an instance of {@link OrderDishType }
     * 
     */
    public OrderDishType createOrderDishType() {
        return new OrderDishType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DishType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", name = "getDishResponse")
    public JAXBElement<DishType> createGetDishResponse(DishType value) {
        return new JAXBElement<DishType>(_GetDishResponse_QNAME, DishType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DishType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", name = "addDishResponse")
    public JAXBElement<DishType> createAddDishResponse(DishType value) {
        return new JAXBElement<DishType>(_AddDishResponse_QNAME, DishType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", name = "getOrderResponse")
    public JAXBElement<OrderType> createGetOrderResponse(OrderType value) {
        return new JAXBElement<OrderType>(_GetOrderResponse_QNAME, OrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", name = "addOrderResponse")
    public JAXBElement<OrderType> createAddOrderResponse(OrderType value) {
        return new JAXBElement<OrderType>(_AddOrderResponse_QNAME, OrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDishListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", name = "getOrderDishListResponse")
    public JAXBElement<OrderDishListType> createGetOrderDishListResponse(OrderDishListType value) {
        return new JAXBElement<OrderDishListType>(_GetOrderDishListResponse_QNAME, OrderDishListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDishType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", name = "addOrderDishResponse")
    public JAXBElement<OrderDishType> createAddOrderDishResponse(OrderDishType value) {
        return new JAXBElement<OrderDishType>(_AddOrderDishResponse_QNAME, OrderDishType.class, null, value);
    }

}

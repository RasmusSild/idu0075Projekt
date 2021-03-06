
package ee.ttu.idu0075._2017.ws.restaurant2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrderPortType", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrderPortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2017.ws.restaurant2.DishType
     */
    @WebMethod
    @WebResult(name = "getDishResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
    public DishType getDish(
        @WebParam(name = "getDishRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
        GetDishRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2017.ws.restaurant2.DishType
     */
    @WebMethod
    @WebResult(name = "addDishResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
    public DishType addDish(
        @WebParam(name = "addDishRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
        AddDishRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2017.ws.restaurant2.GetDishListResponse
     */
    @WebMethod
    @WebResult(name = "getDishListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
    public GetDishListResponse getDishList(
        @WebParam(name = "getDishListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
        GetDishListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2017.ws.restaurant2.OrderType
     */
    @WebMethod
    @WebResult(name = "getOrderResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
    public OrderType getOrder(
        @WebParam(name = "getOrderRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
        GetOrderRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2017.ws.restaurant2.OrderType
     */
    @WebMethod
    @WebResult(name = "addOrderResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
    public OrderType addOrder(
        @WebParam(name = "addOrderRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
        AddOrderRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2017.ws.restaurant2.GetOrderListResponse
     */
    @WebMethod
    @WebResult(name = "getOrderListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
    public GetOrderListResponse getOrderList(
        @WebParam(name = "getOrderListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
        GetOrderListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2017.ws.restaurant2.OrderDishListType
     */
    @WebMethod
    @WebResult(name = "getOrderDishListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
    public OrderDishListType getOrderDishList(
        @WebParam(name = "getOrderDishListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
        GetOrderDishListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2017.ws.restaurant2.OrderDishType
     */
    @WebMethod
    @WebResult(name = "addOrderDishResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
    public OrderDishType addOrderDish(
        @WebParam(name = "addOrderDishRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", partName = "parameter")
        AddOrderDishRequest parameter);

}

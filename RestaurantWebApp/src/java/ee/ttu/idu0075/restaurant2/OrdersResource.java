/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.restaurant2;

import ee.ttu.idu0075._2017.ws.restaurant2.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

/**
 * REST Web Service
 *
 * @author HP
 */
@Path("orders")
public class OrdersResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of OrdersResource
     */
    public OrdersResource() {
    }
    
    @GET
    @Produces("application/json")
    public GetOrderListResponse getOrderList(@QueryParam("token") String token,
            @QueryParam("maxchecktotal") String maxCheckTotal,
            @QueryParam("start") String startDateString,
            @QueryParam("end") String endDateString) {
        NewWebServiceFromWSDL ws = new NewWebServiceFromWSDL();
        GetOrderListRequest request = new GetOrderListRequest();
        if (startDateString == null || endDateString == null) {
            throw new IllegalArgumentException("no start date or end date!");
        }
        if (maxCheckTotal != null) {
            if (Double.parseDouble(maxCheckTotal) < 5) {
                throw new IllegalArgumentException("max check total should be bigger than 5");
            }
            request.setMaxCheckTotal(Double.parseDouble(maxCheckTotal));
        }
        try {
            request.setToken(token);
          
            DateFormat formatter; 
            formatter = new SimpleDateFormat("dd-MM-yy");
            Date date = formatter.parse(startDateString);
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            request.setStartDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
            date = formatter.parse(endDateString);
            calendar = new GregorianCalendar();
            calendar.setTime(date);
            request.setEndDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
            return ws.getOrderList(request);
        } catch (ParseException | DatatypeConfigurationException ex) {
            return null;
        }
    }
    
    @GET
    @Path("{id : \\d+}") //support digit only
    @Produces("application/json")
    public OrderType getOrder(@PathParam("id") String id,
            @QueryParam("token") String token) {
        NewWebServiceFromWSDL ws = new NewWebServiceFromWSDL();
        GetOrderRequest request = new GetOrderRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        OrderType result = ws.getOrder(request);
        if (result == null) {
                throw new IllegalArgumentException("No order found!");
            }
        return result;
    }
    
    /**
     *
     * @param content
     * @param token
     * @return 
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public OrderType addOrder(OrderType content, 
                                @QueryParam("token") String token) {
        NewWebServiceFromWSDL ws = new NewWebServiceFromWSDL();
        AddOrderRequest request = new AddOrderRequest();
        request.setToken(token);
        request.setOrderNo(content.getOrderNo());
        request.setOrderDate(content.getOrderDate());     
        request.setCustomerName(content.getCustomerName());
        request.setOrderTime(content.getOrderTime());
        request.setPaidTime(content.getPaidTime()); 
        request.setCheckTotal(content.getCheckTotal());
        
        return ws.addOrder(request);    
    }
    
    @GET
    @Path("{id : \\d+}/orders") //support digit only
    @Produces("application/json")
    public OrderDishListType getOrderDishList(@PathParam("id") String id,
            @QueryParam("token") String token) {
        NewWebServiceFromWSDL ws = new NewWebServiceFromWSDL();
        GetOrderDishListRequest request = new GetOrderDishListRequest();
        request.setOrderId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getOrderDishList(request);
    }
    
    /**
     *
     * @param content
     * @param token
     * @param id
     * @return 
     */
    @POST
    @Path("{id : \\d+}/orders") //support digit only
    @Consumes("application/json")
    @Produces("application/json")
    public OrderDishType addOrderDish(AddOrderDishRequest content, 
                                @QueryParam("token") String token,
                                @PathParam("id") String id) {
        
        NewWebServiceFromWSDL ws = new NewWebServiceFromWSDL();
        AddOrderDishRequest request = new AddOrderDishRequest();
        request.setToken(token);
        request.setOrderId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setDishId(content.getDishId());
        request.setAmount(content.getAmount());
        request.setDishPrice(content.getDishPrice());
        return ws.addOrderDish(request);
    }
    
}

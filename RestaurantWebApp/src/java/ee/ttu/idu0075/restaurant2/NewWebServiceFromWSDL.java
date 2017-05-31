/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.restaurant2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.NotFoundException;
import ee.ttu.idu0075._2017.ws.restaurant2.*;
import javax.xml.datatype.DatatypeConstants;


/**
 *
 * @author HP
 */
@WebService(serviceName = "RestaurantService", portName = "OrderPort", endpointInterface = "ee.ttu.idu0075._2017.ws.restaurant2.OrderPortType", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/restaurant2", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/RestaurantService.wsdl")
public class NewWebServiceFromWSDL {

    static int nextOrderId = 1;
    static int nextDishId = 1;
    static List<OrderType> orderList = new ArrayList<OrderType>();
    static List<DishType> dishList = new ArrayList<DishType>();
    private final String API_TOKEN = "resto";

    public DishType getDish(GetDishRequest parameter) {
        
        if (parameter.getToken().equalsIgnoreCase(API_TOKEN)) {
            for (int i = 0; i < dishList.size(); i++) {
                if (dishList.get(i).getId().equals(parameter.getId())) {
                    return dishList.get(i);
                }
            }
            throw new NotFoundException("dish not found!");
        }
        throw new IllegalArgumentException("illegal api token!");
    }

    public DishType addDish(AddDishRequest parameter) {
        
        if (parameter.getToken().equalsIgnoreCase(API_TOKEN)) {
            DishType dish = new DishType();
            dish.setId(BigInteger.valueOf(nextDishId++));
            dish.setCode(parameter.getCode());
            dish.setName(parameter.getName());
            dishList.add(dish);
            return dish;
        }
        throw new IllegalArgumentException("illegal api token!");
    }

    public GetDishListResponse getDishList(GetDishListRequest parameter) {
        if (parameter.getToken().equalsIgnoreCase(API_TOKEN)) {
            GetDishListResponse dishes = new GetDishListResponse();
            dishList.forEach((dish) -> {
                dishes.getDish().add(dish);
            });
            return dishes;
        }
        throw new IllegalArgumentException("illegal api token!");
    }

    public OrderType getOrder(GetOrderRequest parameter) {
        if (parameter.getToken().equalsIgnoreCase(API_TOKEN)) {
            OrderType order;
            for (int i = 0; i < orderList.size(); i++) {
                if (orderList.get(i).getId().equals(parameter.getId())) {
                    order = orderList.get(i);
                    return order;
                }
            }
            throw new NotFoundException("order not found!");
        }
        throw new IllegalArgumentException("illegal api token!");
    }

    public OrderType addOrder(AddOrderRequest parameter) {
        if (parameter.getToken().equalsIgnoreCase(API_TOKEN)) {
            OrderType order = new OrderType();
            order.setId(BigInteger.valueOf(nextOrderId++));
            order.setOrderNo(parameter.getOrderNo());
            order.setOrderDate(parameter.getOrderDate());
            order.setOrderTime(parameter.getOrderTime());
            order.setPaidTime(parameter.getPaidTime());
            order.setCustomerName(parameter.getCustomerName());
            order.setCheckTotal(parameter.getCheckTotal());
            order.setOrderDishList(new OrderDishListType());
            orderList.add(order);
            return order;
        }
        throw new IllegalArgumentException("illegal api token!");
    }

    public GetOrderListResponse getOrderList(GetOrderListRequest parameter) {
        if (parameter.getToken().equalsIgnoreCase(API_TOKEN)) {
            GetOrderListResponse orders = new GetOrderListResponse();
            for (OrderType order : orderList) {
                if ((parameter.getMaxCheckTotal() != null) && (parameter.getMaxCheckTotal() >= 5)) {
                    if ((order.getCheckTotal() <= parameter.getMaxCheckTotal())) {
                        orders.getOrder().add(order);
                        continue;
                    } else {
                        continue;
                    }
                }
                if ((parameter.getStartDate() != null && parameter.getStartDate().compare(order.getOrderDate())== DatatypeConstants.LESSER)
                    && (parameter.getEndDate() != null && parameter.getEndDate().compare(order.getOrderDate())== DatatypeConstants.GREATER)) {
                    orders.getOrder().add(order);
                }
            };
            if (orders.getOrder().isEmpty()) {
                throw new NotFoundException("no orders match the search criteria!");
            }
            System.out.println(orders);
            return orders;
        }
        throw new IllegalArgumentException("illegal api token!");
    }

    public OrderDishListType getOrderDishList(GetOrderDishListRequest parameter) {
        if (parameter.getToken().equalsIgnoreCase(API_TOKEN)) {
            OrderDishListType dishesInOrder = new OrderDishListType();
            for (int i = 0; i < orderList.size(); i++) {
                if (orderList.get(i).getId().equals(parameter.getOrderId())) {
                    dishesInOrder = orderList.get(i).getOrderDishList();
                }
            }
            return dishesInOrder;
        }
        throw new IllegalArgumentException("illegal api token!");
    }

    public OrderDishType addOrderDish(AddOrderDishRequest parameter) {
        if (parameter.getToken().equalsIgnoreCase(API_TOKEN)) {
            OrderDishType orderDish = new OrderDishType();
            GetDishRequest dishRequest = new GetDishRequest();
            dishRequest.setId(parameter.getDishId());
            dishRequest.setToken(parameter.getToken());
            orderDish.setDish(getDish(dishRequest));
            orderDish.setAmount(parameter.getAmount());
            orderDish.setDishPrice(parameter.getDishPrice());
            
            for (int i = 0; i < orderList.size(); i++) {
                if (orderList.get(i).getId().equals(parameter.getOrderId())) {
                    orderList.get(i).getOrderDishList().getOrderDish().add(orderDish);
                    return orderDish;
                }

            } 
        }
        throw new IllegalArgumentException("illegal api token!");
    }
    
}

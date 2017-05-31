/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.restaurant2;

import ee.ttu.idu0075._2017.ws.restaurant2.*;
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

/**
 * REST Web Service
 *
 * @author HP
 */
@Path("dishes")
public class DishesResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DishesResource
     */
    public DishesResource() {
    }

    @GET
    @Produces("application/json")
    public GetDishListResponse getDishList(@QueryParam("token") String token) {
        NewWebServiceFromWSDL ws = new NewWebServiceFromWSDL();
        GetDishListRequest request = new GetDishListRequest();
        request.setToken(token);
        return ws.getDishList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public DishType getDish(@PathParam("id") String id,
            @QueryParam("token") String token) {
        NewWebServiceFromWSDL ws = new NewWebServiceFromWSDL();
        GetDishRequest request = new GetDishRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getDish(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public DishType addDish(DishType content, 
                                @QueryParam("token") String token) {
        NewWebServiceFromWSDL ws = new NewWebServiceFromWSDL();
        AddDishRequest request = new AddDishRequest();
        request.setCode(content.getCode());
        request.setName(content.getName());
        request.setToken(token);
        return ws.addDish(request);
    }
}

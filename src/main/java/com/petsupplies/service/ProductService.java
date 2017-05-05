package com.petsupplies.service;

import com.petsupplies.controller.ProductBean;
import com.petsupplies.domain.Product;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/product") //creates path
public class ProductService {
    @Inject
    ProductBean productBean;

    @GET //retrieves data from database
    @Produces(MediaType.APPLICATION_JSON) //makes json fil of data
    public List<Product> getAllProducts(){ //calls the method in the bean that makes query
        return productBean.readAllProducts();
    }
}

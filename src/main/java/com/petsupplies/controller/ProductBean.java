package com.petsupplies.controller;

import com.petsupplies.domain.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by fselanno on 5-5-2017.
 */
@Stateless(name = "productbean")
public class ProductBean {

    @PersistenceContext(unitName = "webshopPU") //makes
    EntityManager entityManager;

    public List<Product> readAllProducts() {
        return entityManager.createQuery("from Product", Product.class).getResultList();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import com.emart.controllers.ShoppingCart;
import com.opensymphony.xwork2.ActionSupport;
import com.pojos.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;

/**
 *
 * @author punker
 */
public class ViewCartAction extends ActionSupport {

    @Inject 
    private ShoppingCart sc;
    private Set<Product> cart_items;
    

    public Set<Product> getCart_items() {
        return cart_items;
    }

    public void setCart_items(Set<Product> cart_items) {
        this.cart_items = cart_items;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    private String test = "dupa";
    public ViewCartAction() {
    }

    public String execute() throws Exception {
        cart_items = sc.getItems();
        for(Product each_item : cart_items) {
            System.out.println(each_item.getProductName());
            
        }
        return SUCCESS;
    }

}

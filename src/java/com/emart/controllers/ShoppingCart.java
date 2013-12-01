/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.emart.controllers;

import com.pojos.Product;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;

/**
 *
 * @author punker
 */
@Named(value = "shoppingCart")
@SessionScoped
public class ShoppingCart implements Serializable {

    private Set<Product> cart_items;
    /**
     * Creates a new instance of ShoppingCart
     */
    public ShoppingCart() {
    }
    
    @PostConstruct
    private void initializeSet() {
        cart_items = new HashSet(0);
    }
    
    public void addItem(Product P) {
        cart_items.add(P);
    }
    
    public void removeItem(Product p) {
        cart_items.remove(p);
        
    }
    
    public Set getItems(){ 
        return cart_items;
    }
}

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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
    
    private Map<Integer, Product> items_map;
    private Map<Integer, Integer> item_qty_map;

    public Map<Integer, Product> getItems_map() {
        return items_map;
    }

    public void setItems_map(Map<Integer, Product> items_map) {
        this.items_map = items_map;
    }

    public Map<Integer, Integer> getItem_qty_map() {
        return item_qty_map;
    }

    public void setItem_qty_map(Map<Integer, Integer> item_qty_map) {
        this.item_qty_map = item_qty_map;
    }
    
    /**
     * Creates a new instance of ShoppingCart
     */
    public ShoppingCart() {
    }
    
    @PostConstruct
    private void initializeSet() {
        item_qty_map = new HashMap(0);
        items_map = new HashMap(0);
    }
    
    public void addItem(Product P, int qty) {
        if(items_map.containsKey(P.getProductId()))
        {
            int curr_quantity = item_qty_map.get(P.getProductId());
            curr_quantity = curr_quantity + qty;
            item_qty_map.put(P.getProductId(), curr_quantity);
        } else {
            items_map.put(P.getProductId(), P);
            item_qty_map.put(P.getProductId(), qty);
        }
    }
    
    public void removeItem(Product p) {
        cart_items.remove(p);
        
    }
    
    public Set getItems(){ 
        return cart_items;
    }
}

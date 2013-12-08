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
 * This CDI bean is responsible for keeping track of items in a shopping cart
 * It also has access to helper class CartHelper that contains some helper methods
 * shopping cart should normally have like getSubtotal, getItemPrice etc.
 * Shopping Cart keeps track of products that are in the cart using hashmap. 
 * Each entry in the hashmap contains a key which is item Id and Product object 
 * itself. There is another hashmap that has productId as a key and quantity as 
 * a value.  Together they give us product - quantity values. Storing it this way
 * gives us easier access to presist methods, and relieves database from requests 
 * every time customer looks at his cart (which is what would happen if we stored 
 * only product ids here). 
 * @author Maciej Warchalowski
 */
@Named(value = "shoppingCart")
@SessionScoped
public class ShoppingCart implements Serializable {

    // This is not used.  Possible future use. 
    private Set<Product> cart_items;
    
    
    private Map<Integer, Product> items_map;
    private Map<Integer, Integer> item_qty_map;
    
    private CartHelper ch;

    /**
     *
     * @return
     */
    public Map<Integer, Product> getItems_map() {
        return items_map;
    }

    /**
     *
     * @param items_map
     */
    public void setItems_map(Map<Integer, Product> items_map) {
        this.items_map = items_map;
    }

    /**
     *
     * @return
     */
    public Map<Integer, Integer> getItem_qty_map() {
        return item_qty_map;
    }

    /**
     *
     * @param item_qty_map
     */
    public void setItem_qty_map(Map<Integer, Integer> item_qty_map) {
        this.item_qty_map = item_qty_map;
    }
    
    /**
     * Creates a new instance of ShoppingCart
     */
    public ShoppingCart() {
    }
    
    /**
     *  We initialize sets and helper after constructing this bean. 
     */
    @PostConstruct
    public void initializeSet() {
        item_qty_map = new HashMap(0);
        items_map = new HashMap(0);
        ch = new CartHelper();
    }

    /**
     * 
     * @return
     */
    public CartHelper getCh() {
        return ch;
    }

    /**
     *
     * @param ch
     */
    public void setCh(CartHelper ch) {
        this.ch = ch;
    }
    
    /**
     * This method adds Product to the shopping cart. 
     * If the item is already in the cart, just add to the 
     * quantity we already have. Else add new product with 
     * requested quantity by adding new entries in the hashmaps.
     * 
     * @param P
     * @param qty
     */
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
    
    /**
     * updateItem method updates the item quantity in the shopping cart.
     * It looks for hashmap entry with id we want to update and updates it
     * if it finds it.  If id is not found false is returned.  If new quantity 
     * is 0 or less, we remove entries for this item id from both hashmaps. 
     * 
     * @param id
     * @param qty
     * @return
     */
    public boolean updateItem(int id, int qty) {
        
        if(items_map.containsKey(id)) 
        {
            item_qty_map.put(id, qty);
        } else {
            return false;
        }
        
        if(qty < 1) {
            items_map.remove(id);
            item_qty_map.remove(id);
        }
        
        return true;
    }
    
    /**
     * Not USED. Possible future use.
     * @param p
     */
    public void removeItem(Product p) {
        cart_items.remove(p);
        
    }
    
    /**
     *
     * @return
     */
    public Set getItems(){ 
        return cart_items;
    }
    
    /**
     * getSubtotal method call calls a method of CartHelper and returns subtotal
     * of products currently in the cart. 
     * @return
     */
    public float getSubtotal() {
        return ch.getSubtotal(items_map, item_qty_map);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart.controllers;

import com.pojos.Product;
import com.pojos.Productprices;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;

/**
 * This is the helper class for shopping cart.  Methods of this class assist 
 * shopping cart bean in certain tasks. 
 * @author Maciej Warchalowski
 */
public class CartHelper {

    /**
     *
     */
    public CartHelper() {

    }

    /**
     * This Method will take a Product as an argument and return price of the 
     * product. 
     * @param p
     * @return
     */
    public float getProductPrice(Product p) {
        
        // Get the set of Productprices, iterate through it ( there should always 
        // be only one item in the set.  Return Productprice instance and call 
        // method to get the actual price.
        
        float price = ((Productprices) p.getProductpriceses().iterator().next()).getProducPrice();

        return price;
    }

    /**
     * This method takes map of products and map of quantities as argument.  
     * It summarizes Quantity * product price of each item and returns them in form 
     * of float. Using BigDecimal to preserve precision on the ouput. 
     * @param items_map
     * @param qty_map
     * @return
     */
    public float getSubtotal(Map<Integer, Product> items_map, Map<Integer, Integer> qty_map) {
        BigDecimal subtotal = new BigDecimal(0);
        subtotal.setScale(1, BigDecimal.ROUND_HALF_UP);

        Iterator it = items_map.entrySet().iterator();
        
        // Go through each item in the items set.
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            int prod_id = (Integer) pair.getKey();
            
            // Get the product from each set entry 
            Product p = (Product) pair.getValue();
            
            // Get the quantity for each item. (The key of the quantity set is 
            // Product ID
            int qty = qty_map.get(prod_id);
            float price = getProductPrice(p);
            
            // Get price * quantity and add it to subtotal
            
            BigDecimal temp = new BigDecimal(price * qty);
            subtotal = subtotal.add(temp);

        }
        
        // Making sure precision is fixed at the output. 
        subtotal = subtotal.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(subtotal.toString());
        return subtotal.floatValue();
    }
}

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
 *
 * @author punker
 */
public class CartHelper {

    public CartHelper() {

    }

    public float getProductPrice(Product p) {
        System.out.println(p);
        float price = ((Productprices) p.getProductpriceses().iterator().next()).getProducPrice();

        return price;
    }

    public float getSubtotal(Map<Integer, Product> items_map, Map<Integer, Integer> qty_map) {
        BigDecimal subtotal = new BigDecimal(0);
        subtotal.setScale(1, BigDecimal.ROUND_HALF_UP);

        Iterator it = items_map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            int prod_id = (Integer) pair.getKey();
            Product p = (Product) pair.getValue();
            int qty = qty_map.get(prod_id);
            float price = getProductPrice(p);
            BigDecimal temp = new BigDecimal(price * qty);
            subtotal = subtotal.add(temp);

        }
        subtotal = subtotal.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(subtotal.toString());
        return subtotal.floatValue();
    }
}

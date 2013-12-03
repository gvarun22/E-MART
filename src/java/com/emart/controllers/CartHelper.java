/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.emart.controllers;

import com.pojos.Product;
import com.pojos.Productprices;


/**
 *
 * @author punker
 */

public class CartHelper {
    
    public CartHelper() {
        
    }
    
    public float getProductPrice(Product p) {
       System.out.println(p);
       float price = ((Productprices)p.getProductpriceses().iterator().next()).getProducPrice();
       
       return price;
    }
}
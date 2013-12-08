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

/**
 * This CDI bean is used to hold whatever item we are currently viewing. 
 * When add to cart is pressed, this item will be added to the shopping cart.
 * Updated every time we render view of some item. 
 * 
 * @author Maciej Warchalowski
 */
@Named(value = "currentItem")
@SessionScoped
public class CurrentItem implements Serializable {

    /**
     * We hold some product in here. It is being updated every time some 
     * item is being viewed. 
     */
    private Product prod; 

    /**
     * 
     * @return
     */
    public Product getProd() {
        return prod;
    }

    /**
     *
     * @param prod
     */
    public void setProd(Product prod) {
        this.prod = prod;
    }
    
    /**
     *
     */
    public CurrentItem() {
    }
    
}

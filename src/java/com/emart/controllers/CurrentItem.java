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
 *
 * @author punker
 */
@Named(value = "currentItem")
@SessionScoped
public class CurrentItem implements Serializable {

    /**
     * Creates a new instance of CurrentItem
     */
    private Product prod; 

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }
    
    public CurrentItem() {
    }
    
}

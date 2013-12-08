/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.emart;

import com.emart.controllers.ShoppingCart;
import com.opensymphony.xwork2.ActionSupport;
import javax.inject.Inject;

/**
 * UpdateCartAction is responsible for updating items in the ShoppingCart bean.
 * ShoppingCart CDI bean is injected into the class. 
 * 
 * @author punker
 */
public class UpdateCartAction extends ActionSupport {
    
    private int prod_id;
    private int qty;
    
    @Inject
    private ShoppingCart sc;
    
    /**
     *
     */
    public UpdateCartAction() {
    }
    
    /**
     * execute method of this class takes 2 input parameters that are fed into 
     * the class by Struts 2 framework based on the http request parameters. 
     * updateItem method is called on ShoppingCart bean to update quantity of 
     * items that hold the desired product id with new quantity qty.
     * @return
     * @throws Exception
     */
    public String execute() throws Exception {
        
        if(sc.updateItem(prod_id, qty)) {        
        return SUCCESS;
        } else {
            return ERROR;
        }
        
    }

    /**
     *
     * @return
     */
    public int getProd_id() {
        return prod_id;
    }

    /**
     *
     * @param prod_id
     */
    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    /**
     *
     * @return
     */
    public int getQty() {
        return qty;
    }

    /**
     *
     * @param qty
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    
}

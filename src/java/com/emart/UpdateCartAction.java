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
 *
 * @author punker
 */
public class UpdateCartAction extends ActionSupport {
    
    private int prod_id;
    private int qty;
    
    @Inject
    private ShoppingCart sc;
    
    public UpdateCartAction() {
    }
    
    public String execute() throws Exception {
        System.out.println("Qty: " + qty);
        System.out.println("Prod id:" + prod_id);
        
        if(sc.updateItem(prod_id, qty)) {        
        return SUCCESS;
        } else {
            return ERROR;
        }
        
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}

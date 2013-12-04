/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import com.emart.controllers.CurrentItem;
import com.emart.controllers.ShoppingCart;
import com.opensymphony.xwork2.*;
import javax.inject.Inject;

/**
 *
 * @author punker
 */
public class AddToCartAction extends ActionSupport {

    @Inject
    private ShoppingCart sc;
    @Inject
    private CurrentItem ci;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public AddToCartAction() {
    }

    public String execute() throws Exception {

            sc.addItem(ci.getProd(), quantity);
            return SUCCESS;
    }

}

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
 * AddToCartAction is triggered when user adds some item to the cart.
 * It injects CurrentItem and ShoppingCart.  The task of this action is 
 * simply taking the product that sits in CurrentItem bean and calling 
 * addItem method of ShoppingCart bean with this product and quantity as 
 * arguments.  We get the quantity argument from Struts 2 framework Value Stack. 
 * In other words it is being populated by Struts 2 framework from http request 
 * for this action transparently. 
 * @author punker
 */
public class AddToCartAction extends ActionSupport {

    @Inject
    private ShoppingCart sc;
    @Inject
    private CurrentItem ci;
    private int quantity;

    /**
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *
     */
    public AddToCartAction() {
    }

    /**
     * execute method of this class takes whatever item is held by CurrentItem
     * bean, and calls addItem method of ShoppingCart with this item as argument.
     * quantity argument is delivered to AddItemAction class by Struts 2 framework. 
     * @return
     * @throws Exception
     */
    public String execute() throws Exception {

            sc.addItem(ci.getProd(), quantity);
            return SUCCESS;
    }

}

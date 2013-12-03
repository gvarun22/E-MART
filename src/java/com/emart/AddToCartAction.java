/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import com.emart.controllers.CurrentItem;
import com.emart.controllers.ShoppingCart;
import com.opensymphony.xwork2.ActionSupport;
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

    public AddToCartAction() {
    }

    public String execute() throws Exception {

            sc.addItem(ci.getProd(), 1);
            return SUCCESS;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import com.emart.controllers.ShoppingCart;
import com.opensymphony.xwork2.ActionSupport;
import com.pojos.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;

/**
 *
 * @author punker
 */
public class ViewCartAction extends ActionSupport {

    @Inject
    private ShoppingCart sc;
    private Map<Integer, Product> items_map;
    private Map<Integer, Integer> item_qty_map;

    public ViewCartAction() {
    }

    @Override
    public String execute() throws Exception {
        items_map= sc.getItems_map();
        item_qty_map = sc.getItem_qty_map();
              
        return SUCCESS;
    }

    public Map<Integer, Product> getItems_map() {
        return items_map;
    }

    public void setItems_map(Map<Integer, Product> items_map) {
        this.items_map = items_map;
    }

    public Map<Integer, Integer> getItem_qty_map() {
        return item_qty_map;
    }

    public void setItem_qty_map(Map<Integer, Integer> item_qty_map) {
        this.item_qty_map = item_qty_map;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;


import com.emart.controllers.CartHelper;
import com.emart.controllers.ShoppingCart;
import com.opensymphony.xwork2.ActionSupport;
import com.pojos.Product;
import java.util.Map;
import javax.inject.Inject;

/**
 * ViewCartAction class is responsible for rendering current state of the shopping 
 * cart.  ShoppingCart managed bean is injected to provide access to the shopping 
 * cart state.  
 *
 * @author punker
 */
public class ViewCartAction extends ActionSupport {


    
    @Inject
    private ShoppingCart sc;
    private Map<Integer, Product> items_map;
    private Map<Integer, Integer> item_qty_map;

    /**
     *
     */
    public ViewCartAction() {
        
    }

    /**
     * execute method of this class is responsible for mapping items_map and 
     * item_qty_map held by ShoppingCart bean to local variables.  This way 
     * both of those maps can be accessed in jsp file this action is tied to by 
     * Struts 2 framework. Jsp file is responsible for rendering items held in the maps.
     * @return
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        items_map= sc.getItems_map();
        item_qty_map = sc.getItem_qty_map();
        return SUCCESS;
    }

    /**
     *
     * @return
     */
    public Map<Integer, Product> getItems_map() {
        return items_map;
    }

    /**
     *
     * @param items_map
     */
    public void setItems_map(Map<Integer, Product> items_map) {
        this.items_map = items_map;
    }

    /**
     *
     * @return
     */
    public Map<Integer, Integer> getItem_qty_map() {
        return item_qty_map;
    }

    /**
     *
     * @param item_qty_map
     */
    public void setItem_qty_map(Map<Integer, Integer> item_qty_map) {
        this.item_qty_map = item_qty_map;
    }
    
    

}

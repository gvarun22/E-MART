/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import com.emart.controllers.ShoppingCart;
import com.emart.controllers.UserManager;
import com.pojos.Customer;
import com.pojos.OrderUtil;
import com.pojos.Product;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

/**
 *
 * @author Sai
 */
public class PlaceOrderAction {
      @Inject
  private ShoppingCart sc;
      @Inject
  private UserManager um;
     private String user_click;
     private float finalCost;
     private float cartAmount;
     private String sh_cost;
     
    public float getCartAmount() {
        return cartAmount;
    }

    public void setCartAmount(float cartAmount) {
        this.cartAmount = cartAmount;
    }

    public float getFinalCost() {
        return finalCost;
    }

    public void setFinalCost(float finalCost) {
        this.finalCost = finalCost;
    }

    public String getSh_cost() {
        return sh_cost;
    }

    public void setSh_cost(String sh_cost) {
        this.sh_cost = sh_cost;
    }
     

    public String getUser_click() {
        return user_click;
    }

    public void setUser_click(String user_click) {
        this.user_click = user_click;
    }

    public String execute() {
        System.out.println("Inside Place Order Action");
        if (user_click.equals("Place your order")) {
            
            Customer customer = um.getCust();
            Date date = new Date();
            Map<Integer, Product> order_map = sc.getItems_map();
            
            float order_total = sc.getSubtotal();
                         
            OrderUtil ou = new OrderUtil();
            int ordernum=(int) (Math.random()*100000);
            
            
            ou.PersistOrders(order_map,ordernum, date, customer, order_total, "Order Placed", date, "Ordered", "Ordered", 10, date, "Ordered",order_total,finalCost, sh_cost, cartAmount);
            System.out.println("final cost" + finalCost);
            System.out.println("Shipping cost"+ sh_cost);
            System.out.println("cart amount"+ cartAmount);

            return "success";
        }
        else
            return "error";
    }
}
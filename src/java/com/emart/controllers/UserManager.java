/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.emart.controllers;

import com.pojos.Customer;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author punker
 */
@Named(value = "userManager")
@SessionScoped
public class UserManager implements Serializable {

    private boolean logged_in = false;
    private Customer cust;

    public boolean isLogged_in() {
        return logged_in;
    }

    public void setLogged_in(boolean logged_in) {
        this.logged_in = logged_in;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }
    /**
     * Creates a new instance of UserManager
     */
    public UserManager() {
    }
    
    public boolean isLoggedIn() {
        return false;
    }
    
}

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
 * UserManager class is responsible for keeping keeping information about currently 
 * logged in user.  It is a SessionScoped bean with session lifetime. This bean is injected
 * by by LoginAction. If the user passed the correct credentials, Customer object is created by 
 * LoginAction and passed to this bean.  This bean holds information about the customer
 * for duration of the session.  It also has logged_in variable to quickly and simply 
 * determine if owner of this session bean is logged in or not.  logged_in is false by 
 * default meaning user is not logged in by default. 
 * @author Maciej Warchalowski
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

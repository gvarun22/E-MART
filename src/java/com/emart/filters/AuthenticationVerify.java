/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.emart.filters;

import com.emart.controllers.UserManager;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import javax.inject.Inject;

/**
 * This is a Interceptor class used to check if user is logged in. 
 * If user is trying to access any of the actions and he is not logged in the
 * the interceptor will intercept the request and redirect user to login page. 
 * @author Maciej Warchalowski
 */
public class AuthenticationVerify implements Interceptor {
   
    @Inject 
    private UserManager um;
    
    public AuthenticationVerify() {
    }
    
    public void destroy() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void init() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    // Intercept method used to intercept the request 
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        
        // If user is not logged in redirect him to login, else go through rest of interceptor stack.
        if(um == null || !um.isLogged_in())
        {
            return "login";
        }
        
        return actionInvocation.invoke();
    }
    
}

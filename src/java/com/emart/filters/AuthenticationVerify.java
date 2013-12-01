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
 *
 * @author punker
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
    
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        
        if(um == null || !um.isLogged_in())
        {
            return "login";
        }
        
        return actionInvocation.invoke();
    }
    
}

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
 * This interceptor is checking if the user is logged in.
 * It is used only on the login action. If the user is logged in, he should 
 * not be able to login again.  Interceptor will redirect him to Home action.
 * @author Maciej Warchalowski
 */
public class LoggedInInterceptor implements Interceptor {
    
    @Inject
    private UserManager um;
    
    public LoggedInInterceptor() {
    }
    
    public void destroy() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void init() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    // If the user is logged in, dont let him login again. Redirect home. 
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        
        if(um != null && um.isLogged_in())
        {
            return "Home";
        }
        
        else return actionInvocation.invoke();
    }
    
}

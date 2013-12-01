/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import com.emart.controllers.UserManager;
import com.opensymphony.xwork2.ActionSupport;
import static com.opensymphony.xwork2.Action.SUCCESS;
import javax.inject.Inject;

/**
 *
 * @author punker
 */
public class HomeAction extends ActionSupport{
    
    public HomeAction()  {
    }
    
    @Override
    public String execute() throws Exception {
        
        return SUCCESS;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;

/**
 * LogoutAction is responsible for terminating session. 
 * @author punker
 */
public class LogoutAction extends ActionSupport {

    /**
     *
     */
    public LogoutAction() {
    }

    /**
     * execute method simply invalidates current session with the user.
     * @return
     * @throws Exception
     */
    public String execute() throws Exception {
        try {
            SessionMap session = (SessionMap) ActionContext.getContext().getSession();
            session.invalidate();
            return SUCCESS;
            
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return INPUT;
        }
        
    }

}

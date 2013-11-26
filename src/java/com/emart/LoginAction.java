package com.emart;


import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.pojos.CustomerUtility;
import static com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText;
import java.sql.*;

/**
 *
 * @author PLEX
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    Statement st=null;
    Connection con=null;
    ResultSet rs;
    String dbpassword;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String execute() throws Exception{
        
            CustomerUtility cu=new CustomerUtility();
            String password2;
        password2 = cu.getPassword(getUsername());
             
            if(password2.equals(getPassword()))
            {
                return SUCCESS;
            }
            else
            {
            addActionError(getText("login.invaliduser"));
            return INPUT;
            }
          
    }
    
}  

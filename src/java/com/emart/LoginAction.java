package com.emart;


import com.emart.controllers.UserManager;
import static com.opensymphony.xwork2.Action.*;
import com.opensymphony.xwork2.ActionSupport;
import com.pojos.Customer;
import com.pojos.CustomerCredentialsUtility;
import com.pojos.CustomerUtility;
import com.pojos.ItemUtility;
import com.pojos.OrderUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author PLEX
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
 

    @Inject
    private UserManager um;
    
   
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
                CustomerCredentialsUtility cc = new CustomerCredentialsUtility();
                Customer cust = cc.getCustomerByCredentials(username);
                System.out.println(cust.getFirstName());
                um.setCust(cust);
                um.setLogged_in(true);
                
                return SUCCESS;
            }
            else
            {
            this.addActionError(getText("login.invaliduser"));
            return INPUT;
            }
          
    }
    
}  

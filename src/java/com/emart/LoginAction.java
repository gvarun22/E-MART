package com.emart;


import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
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
        
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
       
        con = DriverManager.getConnection("jdbc:mysql://localhost/e-mart-1","root", "root");
        //nn.close();   
        //Connection con=DriverManager.getConnection("jdbc:mysql://localhost/e-mart-1?" +"user=root&password=pass");
        st=con.createStatement();
        rs=st.executeQuery("select customer_password from `e-mart-1`.customercredentials where customer_login='"+getUsername()+"'");
        
        rs=st.getResultSet();
        rs.next();
        if(rs!=null)
        {
            
            
            dbpassword=rs.getString(1);
            if(dbpassword.equals(getPassword()))
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
        catch(Exception e)
        {
            
        }
        addActionError(getText("login.invaliduser"));
         return INPUT;
            
      
        
    }
    
    public void validate(){
        if(getUsername().equals(""))
            addActionError(getText("login.username"));
        if(getPassword().equals(""))
            addActionError(getText("login.passowrd"));
        
    
        
    }
    
}   
package com.emart;


import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.pojos.CustomerUtility;
import com.pojos.ItemUtility;
import com.pojos.OrderUtil;
import static com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PLEX
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private List popularItems;
    private String productName;
    private List products;

    public List getProducts() {
        return products;
    }

    public void setProducts(List products) {
        this.products = products;
    }

    

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }
    private String productImg;

    public List getPopularItems() {
        return popularItems;
    }

    public void setPopularItems(List popularItems) {
        this.popularItems = popularItems;
    }
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
            OrderUtil ou= new OrderUtil();
            ItemUtility iu=new ItemUtility();
            String password2;
            password2 = cu.getPassword(getUsername());
             
            popularItems=ou.getHighestSellingProducts();
            
            ProductAttr pa=new ProductAttr();
            products=new ArrayList();
            
            for(Object i:popularItems)
            {
                pa.setProductName(iu.getProductName((Integer) i));
                pa.setProductId((Integer) i);
                pa.setProductPic(iu.getProductImage((Integer) i));
                pa.setProductPrice(Math.round(iu.getProductCost((Integer)i) * 1000)/1000.0);
                products.add(pa);
                pa=new ProductAttr();
            }
            
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

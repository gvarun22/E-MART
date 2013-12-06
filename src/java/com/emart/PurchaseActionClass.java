
package com.emart;

import com.emart.controllers.ShoppingCart;
import com.opensymphony.xwork2.ActionSupport;
import com.pojos.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;

/**
 *
 * @author Kunal
 */
public class PurchaseActionClass extends ActionSupport {
    int quantity;
    float priceLabel;
    double totalAmount;
    int productId;
    double price;
@Inject
    private ShoppingCart sc;
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPriceLabel() {
        return priceLabel;
    }

    public void setPriceLabel(float priceLabel) {
        this.priceLabel = priceLabel;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
   
    public String execute(){
        System.out.println("quantity desired: "+quantity);
        System.out.println("price: "+priceLabel);
        Map<Integer, Integer> items=sc.getItem_qty_map();
        Map item_price=sc.getItems_map();
    
//        totalAmount = quantity*priceLabel;
//        totalAmount=Math.round(totalAmount * 100.0) / 100.0;
    //    totalAmount=
      //  if(totalAmount>0){
            
        
        if(items != null && items.size()>0){
            totalAmount=sc.getSubtotal();
             totalAmount=Math.round(100.0*totalAmount)/100.0;

            
            return "success";
        }
        else{
             addActionError(getText("purchase.invalidquantity"));
            return "error";
        }
    }
}

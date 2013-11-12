
package com.emart;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Kunal
 */
public class PurchaseActionClass extends ActionSupport {
    int quantity;
    float priceLabel;
    double totalAmount;
    int productId;

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
        totalAmount = quantity*priceLabel;
        totalAmount=Math.round(totalAmount * 100.0) / 100.0;
        if(totalAmount>0){
            return "success";
        }
        else{
             addActionError(getText("purchase.invalidquantity"));
            return "error";
        }
    }
}

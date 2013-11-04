
package com.emart;

/**
 *
 * @author Kunal
 */
public class PurchaseActionClass {
    int quantity;
    float priceLabel;
    double totalAmount;
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
        if(totalAmount!=0.00){
            return "success";
        }
        else{
            return "fail";
        }
    }
}

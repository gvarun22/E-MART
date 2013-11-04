
package com.emart;

import com.pojos.ItemUtility;
import com.pojos.Product;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author Kunal
 */
public class SelectItemAction {
    Product product;
    int productId;
    String productName;
    String productDescr;
    String filePath;

    public FileOutputStream getFos() {
        return fos;
    }

    public void setFos(FileOutputStream fos) {
        this.fos = fos;
    }
    float cost;
    byte[] image;
    FileOutputStream fos;
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public String getProductDescr() {
        return productDescr;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setProductDescr(String productDescr) {
        this.productDescr = productDescr;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    
    public String execute() throws Exception {

        ItemUtility iu = new ItemUtility();
        productName = iu.getProductName(productId);    
        productDescr =iu.getProductDescription(productId);     
        image = iu.getProductImage(productId);
        System.out.println("image description: "+image);
       
        try{
            File file = new File("Test1.gif");
            fos = new FileOutputStream(file); 
            fos.write(image);
            fos.close();
            System.out.println("fos: "+ fos);
            System.out.println(file.getAbsolutePath());
        }
        catch(IOException e){
        }
        cost = iu.getProductCost(productId);
        System.out.println("cost is: "+cost);
        
        if (productName!=null && null != productDescr) {
            return "success";
        } else {
            return "error";
        }
    }
}

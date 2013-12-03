/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import com.emart.controllers.UserManager;
import com.opensymphony.xwork2.ActionSupport;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.pojos.ItemUtility;
import com.pojos.OrderUtil;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author punker
 */
public class HomeAction extends ActionSupport {

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

    public HomeAction() {
    }

    @Override
    public String execute() throws Exception {
        OrderUtil ou = new OrderUtil();
        ItemUtility iu = new ItemUtility();
        popularItems = ou.getHighestSellingProducts();

        ProductAttr pa = new ProductAttr();
        products = new ArrayList();

        for (Object i : popularItems) {
            pa.setProductName(iu.getProductName((Integer) i));
            pa.setProductId((Integer) i);
            pa.setProductPic(iu.getProductImage((Integer) i));
            pa.setProductPrice(Math.round(iu.getProductCost((Integer) i) * 1000) / 1000.0);
            products.add(pa);
            pa = new ProductAttr();
        }

        return SUCCESS;
    }

}

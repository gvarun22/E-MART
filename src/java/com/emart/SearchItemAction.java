/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import com.pojos.SearchUtility;
import java.util.List;

/**
 *
 * @author Varun
 */
public class SearchItemAction {

    private String name;
    private List newList;
    private List categoryList;
    private String prodCategory;

    public SearchItemAction() {
    }

    public List getNewList() {
        return newList;
    }
    
    public List getCategoryList(){
        return categoryList;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName(String name) {
        return name;

    }
     public void setProdCategory(String prodCategory) {
        this.prodCategory = prodCategory;

    }

    public String getProdCategory() {
        return prodCategory;

    }

    public String execute() throws Exception {
        SearchUtility su = new SearchUtility();
        SearchItemAction sa = new SearchItemAction();
        if(prodCategory==null||prodCategory.equals("none"))
        {
        newList = su.searchProductByName(name);
        }
        else
        {
        newList = su.searchProductByNameAndCategory(name, prodCategory);    
        }
                
        if (newList != null && !newList.isEmpty()) {
            return "success";
        } else {
            return "error";
        }

    }

}

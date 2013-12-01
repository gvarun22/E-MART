/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rahul
 */
public class SelectAction{

    String CardType;
    List<String> CardTypeList;

    public List<String> getCardTypeList() {
        return CardTypeList;
    }

    public void setCardTypeList(List<String> CardTypeList) {
        this.CardTypeList = CardTypeList;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    public SelectAction() {
        CardTypeList = new ArrayList<String>();
        CardTypeList.add("Visa");
        CardTypeList.add("MasterCard");
        CardTypeList.add("Discover");
        CardTypeList.add("American Express");

    }

    public String execute() throws Exception {
        return "SUCCESS";
    }

}

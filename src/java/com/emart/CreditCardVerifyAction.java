/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.emart;

/**
 *
 * @author Varun
 */
public class CreditCardVerifyAction {
    private String cardNum;
    public void setCardNum(String cardNum)
    {
        this.cardNum=cardNum;
    }
    public String getcardNum()
    {
        return this.cardNum;
    }
    public String execute()
    {
        if(cardNum.equals("1234"))
        {
            return "success";
        }
        else
            return "error";
    }
    
}

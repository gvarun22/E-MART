/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.emart;

import ws_creditcard.CardCheckWS;
import ws_creditcard.CardCheckWS_Service;


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
        CardCheckWS_Service service=new CardCheckWS_Service();
        CardCheckWS cc=service.getCardCheckWSPort();
String stat=cc.verifyCard(cardNum);
//System.out.println("Stat"+stat);
        if(stat.equals("True"))
        {
            return "success";
        }
        else
            return "error";
    }
    
}

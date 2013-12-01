/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import ws_creditcard.CardCheckWS;

/**
 *
 * @author Rahul
 */
@WebService
public class CreditCardValidation {

    @WebMethod
    public String verifyCard(String cardNum) {

        //int cNum=Integer.parseInt(cardNum);
        int[] cnum = new int[cardNum.length()];
        for (int i = 0; i < cardNum.length(); i++) {
            cnum[i] = (cardNum.charAt(i) - '0');

        }

        boolean status = ismod10(cnum);
        System.out.println("Status:" + status);

        if (status = true) {
            return "True";
        } else {
            return "False";
        }

    }

    public boolean ismod10(int[] cnum) {
        int sum = 0, temp = 0;
        for (int i = cnum.length - 2; i >= 0; i = i - 2) {

            sum = cnum[i] * 2;
            if (sum > 9) {
                temp = 0;
                while (sum > 0) {
                    temp = temp + sum % 10;
                    sum = sum / 10;
                }
                sum = temp;

            }
            cnum[i] = sum;
        }

//      for(int j=0;j<cnum.length;j++){
//    System.out.print(cnum[j]);}
        sum = 0;
        for (int i = 0; i < cnum.length; i++) {

            sum = sum + cnum[i];
        }
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        CreditCardValidation ccv = new CreditCardValidation();
        ccv.verifyCard("123456789");
        CreditCardValidation cc=new CreditCardValidation();
        Endpoint.publish("http://localhost:8086/verifyCard", new CardCheckWS() {

            @Override
            public String verifyCard(String arg0) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean ismod10(List<Integer> arg0) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import com.emart.creditvalid.CreditCardVerification;
import com.emart.creditvalid.CreditCardVerification_Service;
import com.pojos.ShippingUtility;

/**
 *
 * @author Varun
 */
public class CreditCardVerifyAction {

    private String cardNum;
    private String ba_Addr1;
    private String ba_Addr2;
    private String ba_city;
    private String ba_state;
    private String ba_zip;

    private String sh_Addr1;
    private String sh_Addr2;
    private String sh_city;
    private String sh_state;
    private String sh_zip;

    public String getBa_Addr1() {
        return ba_Addr1;
    }

    public void setBa_Addr1(String ba_Addr1) {
        this.ba_Addr1 = ba_Addr1;
    }

    public String getBa_Addr2() {
        return ba_Addr2;
    }

    public void setBa_Addr2(String ba_Addr2) {
        this.ba_Addr2 = ba_Addr2;
    }

    public String getBa_city() {
        return ba_city;
    }

    public void setBa_city(String ba_city) {
        this.ba_city = ba_city;
    }

    public String getBa_state() {
        return ba_state;
    }

    public void setBa_state(String ba_state) {
        this.ba_state = ba_state;
    }

    public String getBa_zip() {
        return ba_zip;
    }

    public void setBa_zip(String ba_zip) {
        this.ba_zip = ba_zip;
    }

    public String getSh_Addr1() {
        return sh_Addr1;
    }

    public void setSh_Addr1(String sh_Addr1) {
        this.sh_Addr1 = sh_Addr1;
    }

    public String getSh_Addr2() {
        return sh_Addr2;
    }

    public void setSh_Addr2(String sh_Addr2) {
        this.sh_Addr2 = sh_Addr2;
    }

    public String getSh_city() {
        return sh_city;
    }

    public void setSh_city(String sh_city) {
        this.sh_city = sh_city;
    }

    public String getSh_state() {
        return sh_state;
    }

    public void setSh_state(String sh_state) {
        this.sh_state = sh_state;
    }

    public String getSh_zip() {
        return sh_zip;
    }

    public void setSh_zip(String sh_zip) {
        this.sh_zip = sh_zip;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getcardNum() {
        return this.cardNum;
    }

    public String execute() {
        CreditCardVerification_Service service = new CreditCardVerification_Service();
        CreditCardVerification cc = service.getCreditCardVerificationPort();
        String stat = cc.verifyCard(cardNum);

//System.out.println("Stat"+stat);
        if (stat.equals("True")) {
            ShippingUtility su = new ShippingUtility();
            su.PersistShipingAddr(sh_Addr1, sh_Addr2, sh_city, sh_state, sh_zip);
            su.PersistBillingAddr(ba_Addr1, ba_Addr2, ba_city, ba_state, ba_zip);
            return "success";
        } else {
            return "error";
        }
    }

}

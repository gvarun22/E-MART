/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.emart;

import com.pojos.RegisterUitility;

/**
 *
 * @author Rahul
 */
public class RegisterAction {
    String FirstName;
    String LastName;
    String Gender;
    String Address;
    String username;
    String password;
    String dayPhone;
    String eveningPhone;
    String email;

    public String getDayPhone() {
        return dayPhone;
    }

    public void setDayPhone(String dayPhone) {
        this.dayPhone = dayPhone;
    }

    public String getEveningPhone() {
        return eveningPhone;
    }

    public void setEveningPhone(String eveningPhone) {
        this.eveningPhone = eveningPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }


    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public RegisterAction() {
    }
    
    public String execute() throws Exception {
        RegisterUitility ru=new RegisterUitility();
        ru.PersistCustomer( FirstName, LastName,Gender,Address,username,password);
        ru.PersistCustomerContact(email, dayPhone, eveningPhone);
        return "success";
        
    }
    
}

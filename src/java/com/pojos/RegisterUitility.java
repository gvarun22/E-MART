/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pojos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Rahul
 */
public class RegisterUitility {
      private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public  void PersistCustomer(String firstName,String lastName,String gender,String address,String userName, String password){
    Customer customer = new Customer();
    Session s = sessionFactory.openSession();
    Transaction tx = s.beginTransaction();

    customer.setFirstName(firstName);
    customer.setLastName(lastName);
   // customer.setBillingaddresses(address);
    customer.setGender(gender);
    s.persist(customer);
    PersistCustomerCreds(customer,userName,password);
    s.getTransaction().commit();
    
    }
    
      public  void PersistCustomerCreds(Customer customer,String userName, String password){
      
           Session s = sessionFactory.openSession();
           Transaction tx = s.beginTransaction();

          Customercredentials ccreds= new Customercredentials();
          ccreds.setAccountActive(1);
        //  ccreds.setCustomer(customer);
          ccreds.setCustomerLogin(userName);
          ccreds.setCustomerPassword(password);
          
          s.persist(ccreds);
          s.getTransaction().commit();

          
      }
      public void PersistCustomerContact(String email,String dayPhone, String eveningPhone){
           Session s = sessionFactory.openSession();
           Transaction tx = s.beginTransaction();
          Customercontact cc = new Customercontact();
          cc.setCustomerEmail(email);
          cc.setCustomerPhoneDay(dayPhone);
          cc.setCustomerPhoneNight(eveningPhone);
          s.persist(cc);
          s.getTransaction().commit();
          
          
      }
}

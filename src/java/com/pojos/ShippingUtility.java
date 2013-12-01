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
public class ShippingUtility {

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

    public void PersistShipingAddr(String Addr1, String Addr2, String city, String state, String zip) {

        Shippingaddress sa = new Shippingaddress();
        sa.setAddr1(Addr1);
        sa.setAddr2(Addr2);
        sa.setCity(city);
        sa.setState(state);
        sa.setZip(zip);

        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        s.persist(sa);
        s.getTransaction().commit();

    }

    public void PersistBillingAddr(String Addr1, String Addr2, String city, String state, String zip) {

        Billingaddress ba = new Billingaddress();
        ba.setAddr1(Addr1);
        ba.setAddr2(Addr2);
        ba.setCity(city);
        ba.setState(state);
        ba.setZip(zip);

       
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        s.persist(ba);
        s.getTransaction().commit();

    }
}

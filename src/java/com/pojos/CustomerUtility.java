/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pojos;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Varun
 */
public class CustomerUtility {
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
    public String getPassword(String userName)
    {
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        Query li = s.createQuery("select customerPassword from Customercredentials where customerLogin='" + userName + "'");
         List list=li.list();
         String val= (String) list.get(0);
        tx.commit();
        
        return val;
    }
    
    
}

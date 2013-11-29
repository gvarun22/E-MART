/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pojos;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Varun
 */
public class OrderUtil {

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
        public List getHighestSellingProducts() {
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        List li = s.createQuery("select product.productId as ProductID from Orderitems  group by product.productId order by count(product.productId) desc limit 5").list();
        tx.commit();
        return li;
    }    
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

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
public class SearchUtility {

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

    public List searchProductByName(String name) {

        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        List li = s.createQuery("from Product where productName like '%" + name + "%'").list();
        tx.commit();
        return li;
    }

    public List searchProductByNameAndCategory(String name, String Category) {

        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        String query="from Product pr where pr.productName like '%"+name+ "%' and pr.storeCategories.catName like '%"+Category+"%'";
        List li = s.createQuery(query).list();
        tx.commit();
        return li;
    }

    public List searchAllCategories() {
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        List li = s.createQuery("select  sc.catName from StoreCategories sc").list();
        tx.commit();
        return li;
    }
}

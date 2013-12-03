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
import org.hibernate.criterion.Restrictions;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author punker
 */
public class CustomerCredentialsUtility {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public Customer getCustomerByCredentials(String username) {
        
        Session s = sessionFactory.openSession();
        List<Customercredentials> customercreds = s.createCriteria(Customercredentials.class).add( Restrictions.like("customerLogin", username) ).list();
        //System.out.println(customercreds.get(0).getCustomer().getFirstName());
        return customercreds.get(0).getCustomer();
    }
}

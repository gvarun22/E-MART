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
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Kunal
 */
public class ItemUtility {

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


    public String getProductName(int productId){
        //Product product;
        String productName;
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        String query = " select pr.productName from Product pr where pr.productId ='" + productId+"'";
        productName =   (String) s.createQuery(query).uniqueResult();
        tx.commit();
        return productName;
    }
    public String getProductDescription(int productId){
        String descr;
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        String query = " select pr.productDescr from Product pr where pr.productId ='" + productId+"'";
        descr =   (String) s.createQuery(query).uniqueResult();
        tx.commit();
        return descr;
    }
    public String getProductImage(int productId){
        String image;
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        String query = "select pra.productImage from Productcustomattr pra where pra.product = '" + productId+"'";
        image =  (String) s.createQuery(query).uniqueResult();
        tx.commit();
        return image;
    }
    public float getProductCost(int productId){
        float price;
        Product product;
        //product.setProductId(productId);
        product = getCompleteProduct(productId);
       // Productprices productp;
        System.out.println("product name is: "+product.getProductName());
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        String query = "from Productprices prp where prp.product = '" + product.getProductId()+"'";
        System.out.println(query);
        Productprices p =   (Productprices) s.createQuery(query).uniqueResult();
        tx.commit();
        System.out.println(p.getProducPrice());
        return p.getProducPrice();
    }
    
    public Product getCompleteProduct(int productId){
        Product product;
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        String query = "from Product pr where pr.productId ='" + productId+"'";
        product =   (Product) s.createQuery(query).uniqueResult();
        tx.commit();
        return product;
    }
    
}


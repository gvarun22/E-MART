/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pojos;

import java.util.Date;
import java.util.List;
import java.util.Map;
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
        
        public void PersistOrders(Map<Integer, Product> order_map, int order_number, Date order_date, Customer customer, float order_total, String store_orders_col, Date date_created, String order_comments, String order_ip, float order_tax_rate, Date invoice_date,String invoice_status, float invoice_amount, float finalCost, float sh_cost, float cartAmount) {

        Storeorders so = new Storeorders();
        so.setOrderNumber(order_number);
        so.setOrderDate(order_date);
        so.setCustomer(customer);
        so.setOrderTotal(order_total);
        so.setStoreorderscol(store_orders_col);
        
        Orderitems oi = new Orderitems();
       
        for (Map.Entry<Integer, Product> entry : order_map.entrySet()) {
            
            oi.setStoreorders(so);
            oi.setProduct(entry.getValue());
            oi.setDateCreated(order_date);
        }
        
        Orderdetails od = new Orderdetails();
        od.setOrderComments(order_comments);
        od.setOrderTaxRate(order_tax_rate);
        od.setOrderIp(order_ip);
        od.setStoreorders(so);
        
        
        Orderinvoice o = new Orderinvoice();
        o.setInvoiceAmount(invoice_amount);
        o.setInvoiceDate(invoice_date);
        o.setInvoiceStatus(invoice_status);
        o.setStoreorders(so);
        
        /*float shipping_cost = Float.parseFloat(sh_cost);
        float cart_amount = Float.parseFloat(cartAmount);
        float final_cost = Float.parseFloat(finalCost);*/
        
        Orderamounts oa = new Orderamounts();
        oa.setOrderShipping(sh_cost);
        oa.setOrderSubtotal(cartAmount);
        oa.setOrderTotal(finalCost);
        oa.setStoreorders(so);
        
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        s.persist(so);
        s.persist(oi);
        s.persist(od);
        s.persist(oa);
        s.persist(o);
        s.getTransaction().commit();
    
        } 

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


}

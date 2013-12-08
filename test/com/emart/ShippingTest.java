/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emart;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import session.ShippingCostSessionBeanRemote;

/**
 *
 * @author Sai
 */
public class ShippingTest {
    ShippingCostSessionBeanRemote shippingCostSessionBean = lookupShippingCostSessionBeanRemote();
    
    public ShippingTest() {
    }

    @Test
    public void testShippingCostForValidInput() {
        String sh_zip = "60612";
        String sh_cost = shippingCostSessionBean.calculateShipping(sh_zip);
        assertEquals("6",sh_cost);
    }
    
    @Test
    public void testShippingCostForInvalidInput() {
        String sh_zip = "123abc";
        try {
            String sh_cost = shippingCostSessionBean.calculateShipping(sh_zip);
        }
        catch(NumberFormatException e)
        {
            assertTrue(true);
        }
        
    }

    private ShippingCostSessionBeanRemote lookupShippingCostSessionBeanRemote() {
        try {
            Context c = new InitialContext();
            return (ShippingCostSessionBeanRemote) c.lookup("java:global/ShippingCostEstimator/ShippingCostSessionBean!session.ShippingCostSessionBeanRemote");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
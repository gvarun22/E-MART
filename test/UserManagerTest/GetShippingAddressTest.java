/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserManagerTest;

import com.pojos.Customer;
import com.pojos.Shippingaddress;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author punker
 */
public class GetShippingAddressTest {

    private Customer c;
    private Shippingaddress sa;
    private Set sa_set;

    public GetShippingAddressTest() {
    }

    @Before
    public void setUp() {
        c = new Customer();
        sa = new Shippingaddress();
        sa.setCity("TEST");
        sa_set = new HashSet(0);
        sa_set.add(sa);
        c.setShippingaddresses(sa_set);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Get_Shipping_Address_Test() {
        try {
            Assert.assertEquals(((Shippingaddress)c.getShippingaddresses().iterator().next()).getCity(), "TEST");
        } catch (Exception ex) {
            Logger.getLogger(GetShippingAddressTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("GetShippingAddress test Failed");
        }
    }
}

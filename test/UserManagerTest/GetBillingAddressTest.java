/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserManagerTest;

import com.pojos.Billingaddress;
import com.pojos.Customer;
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
public class GetBillingAddressTest {

    private Customer c;
    private Billingaddress sa;
    private Set sa_set;

    public GetBillingAddressTest() {
    }

    @Before
    public void setUp() {
        c = new Customer();
        sa = new Billingaddress();
        sa.setCity("TEST");
        sa_set = new HashSet(0);
        sa_set.add(sa);
        c.setBillingaddresses(sa_set);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Get_Shipping_Address_Test() {
        try {
            Assert.assertEquals("TEST", ((Billingaddress)c.getBillingaddresses().iterator().next()).getCity());
        } catch (Exception ex) {
            Logger.getLogger(GetShippingAddressTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("GetBillingAddress test Failed");
        }
    }
}

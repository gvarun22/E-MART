/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardTest;

import com.emart.creditvalid.CreditCardVerification;
import com.emart.creditvalid.CreditCardVerification_Service;
import junit.framework.TestCase;

/**
 *
 * @author Rahul
 */
public class CreditCardValidTest extends TestCase {

    public CreditCardValidTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testNumber() {
        CreditCardVerification_Service service = new CreditCardVerification_Service();
        CreditCardVerification cc = service.getCreditCardVerificationPort();
        String stat = cc.verifyCard("4888937076888606");

        assertEquals("False", stat);
        stat = cc.verifyCard("4888937076888603");
        assertEquals("True", stat);

    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}

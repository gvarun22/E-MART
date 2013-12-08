/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserManagerTest;

import com.emart.controllers.UserManager;
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
public class LoginTest {

    private UserManager um;

    public LoginTest() {
    }

    @Before
    public void setUp() {
        um = new UserManager();
    }

    @Test
    public void Login_Default_State_Test() {
        try {
            Assert.assertEquals(false, um.isLogged_in());
        } catch (Exception ex) {
            Logger.getLogger(LoginTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Lging Default State Test Failed");
        }
    }

    @Test
    public void Login_Logged_In_Test() {
        try {
            um.setLogged_in(true);
            Assert.assertEquals(true, um.isLogged_in());
        } catch (Exception ex) {
            Logger.getLogger(LoginTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Logged in test Failed");
        }
    }
    @Test
    public void Login_Logged_Out_Test() {
        try {
            um.setLogged_in(false);
            Assert.assertEquals(false, um.isLogged_in());
        } catch (Exception ex) {
            Logger.getLogger(LoginTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Logged out test Failed");
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeTest;

import com.emart.HomeAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Varun
 */
public class HomeActionTest {

    public HomeActionTest() {
    }

    @Test
    public void Success_Recommendation_not_empty_HomeActionTest() {
        try {
            HomeAction ha = new HomeAction();
            String result = ha.execute();
            Assert.assertEquals("success", result);
            Assert.assertNotNull(ha.getPopularItems());
            Assert.assertNotSame(0, ha.getPopularItems().size());
        } catch (Exception ex) {
            Logger.getLogger(HomeActionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Recommendation failed");
        }

    }
}


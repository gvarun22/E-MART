/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchTest;

import com.emart.SearchItemAction;
import com.pojos.Product;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Varun
 */
public class SearchItemActionTest {

    public SearchItemActionTest() {

    }

    @Test
    public void Success_Category_SearchItemActionTest() {
        try {
            SearchItemAction sia = new SearchItemAction();
            sia.setName("HP");
            sia.setProdCategory("Electronics");
            String result = sia.execute();
            Product p = (Product) sia.getNewList().get(0);
            Assert.assertEquals("success", result);
            Assert.assertEquals("HP Pavilion Laptop", p.getProductName());
        } catch (Exception ex) {
            Logger.getLogger(SearchItemActionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Search did not succeed");
        }
    }

    @Test
    public void Success_No_Category_SearchItemActionTest() {
        try {
            SearchItemAction sia = new SearchItemAction();
            sia.setName("HP");
            String result = sia.execute();
            Product p = (Product) sia.getNewList().get(0);
            Assert.assertEquals("success", result);
            Assert.assertEquals("HP Pavilion Laptop", p.getProductName());
        } catch (Exception ex) {
            Logger.getLogger(SearchItemActionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Search did not succeed");
        }
    }

    @Test
    public void Failure_No_Category_SearchItemActionTest() {
        try {
            SearchItemAction sia = new SearchItemAction();
            sia.setName("HIP");
            String result = sia.execute();
            Assert.assertEquals("error", result);
        } catch (Exception ex) {
            Logger.getLogger(SearchItemActionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Search did not succeed");
        }
    }

    @Test
    public void Failure_Category_SearchItemActionTest() {
        try {
            SearchItemAction sia = new SearchItemAction();
            sia.setName("HIP");
            sia.setProdCategory("Ji Goe");
            String result = sia.execute();
            Assert.assertEquals("error", result);
        } catch (Exception ex) {
            Logger.getLogger(SearchItemActionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Search did not succeed");
        }
    }
}

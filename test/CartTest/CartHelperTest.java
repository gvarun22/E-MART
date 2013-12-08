/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CartTest;

import com.emart.controllers.CartHelper;
import com.pojos.Product;
import com.pojos.Productprices;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
public class CartHelperTest {

    private Product p;
    private Set prices_set;
    private Productprices pp;
    private CartHelper ch;

    public CartHelperTest() {
    }

    @Before
    public void setUp() {
        ch = new CartHelper();
        p = new Product();
        p.setProductId(10);
        pp = new Productprices();
        pp.setProducPrice((float) 99);
        prices_set = new HashSet(0);
        prices_set.add(pp);
        p.setProductpriceses(prices_set);

    }

    @Test
    public void Get_Product_Price_Test() {
        try {
            Assert.assertEquals((float) 99, ch.getProductPrice(p), 0.001);
        } catch (Exception ex) {
            Logger.getLogger(CartHelperTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Get Product Price Failed");
        }
    }

    @Test
    public void Get_Subtotal_One_Item_Test() {
        try {
            Map<Integer, Product> items_map = new HashMap();
            items_map.put(10, p);
            Map<Integer, Integer> items_qty_map = new HashMap();
            items_qty_map.put(10, 99);
            float res = ch.getSubtotal(items_map, items_qty_map);
            Assert.assertEquals((float) 9801, res, 0.0000001);

        } catch (Exception ex) {
            Logger.getLogger(CartHelperTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Get Subtotal One Item Test Failed");
        }
    }

    public void Get_Subtotal_No_Items_Test() {
        try {
            Map<Integer, Product> items_map = new HashMap();
            Map<Integer, Integer> items_qty_map = new HashMap();
            float res = ch.getSubtotal(items_map, items_qty_map);
            Assert.assertEquals((float) 0, res, 0.0000001);

        } catch (Exception ex) {
            Logger.getLogger(CartHelperTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Get Subtotal No Items Test Failed");
        }
    }
    @Test
    public void Get_Subtotal_Many_Items_Test() {
        try {
            Map<Integer, Product> items_map = new HashMap();
            Map<Integer, Integer> items_qty_map = new HashMap();
            for (int i = 1; i < 4; i++) {
                Product temp = new Product();
                temp.setProductId(i);
                Productprices temp_pp = new Productprices();
                temp_pp.setProducPrice((float) i * 10);
                Set temp_prices_set = new HashSet(0);
                temp_prices_set.add(temp_pp);
                temp.setProductpriceses(temp_prices_set);
                items_map.put(i, temp);
                items_qty_map.put(i, i);
            }
            float res = ch.getSubtotal(items_map, items_qty_map);
            Assert.assertEquals((float) 140, res, 0.0000001);

        } catch (Exception ex) {
            Logger.getLogger(CartHelperTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Get Subtotal Man Items Test Failed");
        }
    }

}

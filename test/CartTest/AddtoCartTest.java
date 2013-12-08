/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CartTest;

import com.emart.controllers.CurrentItem;
import com.emart.controllers.ShoppingCart;
import com.pojos.Product;
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
public class AddtoCartTest {
    
    private ShoppingCart sc;
    private CurrentItem cu;
    private Product p;
    
    public AddtoCartTest() {
    }
    
    
    @Before
    public void setUp() {
        sc = new ShoppingCart();
        sc.initializeSet();
        cu = new CurrentItem();
        p = new Product();
        p.setProductId(99);
        p.setProductName("TEST");
    }
    


    @Test
    public void Add_To_Cart_Test() {
        try {
        sc.addItem(p, 1);
        Product temp_p = new Product();
        temp_p.setProductId(99);
        temp_p.setProductName("TEST");
        Assert.assertEquals(sc.getItems_map().get(99).getProductId(),temp_p.getProductId());
        Assert.assertEquals(1, sc.getItem_qty_map().get(99).intValue());
        Assert.assertEquals(sc.getItems_map().get(99).getProductName(),temp_p.getProductName());
        } catch (Exception ex) {
            Logger.getLogger(AddtoCartTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Add to cart FAILED");
        }
        
    }
    
    @Test
    public void Update_Cart_Test() {
        try {
        sc.addItem(p, 1);
        sc.updateItem(99, 100);
        Assert.assertEquals(100, sc.getItem_qty_map().get(99).intValue());
        
        } catch (Exception ex) {
            Logger.getLogger(AddtoCartTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Update cart FAILED");
        }
        
    }
}

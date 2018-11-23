package otherSellables;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {
    
    GuitarString guitarString;

    @Before
    public void setUp() throws Exception {
        guitarString = new GuitarString("Guitar String", 20, 30);
    }

    @Test
    public void canGetType() {
        assertEquals("Guitar String", guitarString.getType());
    }

    @Test
    public void canSetType() {
        guitarString.setType("Another Guitar String");
        assertEquals("Another Guitar String", guitarString.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(20, guitarString.getPurchasePrice(), 0.01);
    }

    @Test
    public void canSetPurchasePrice() {
        guitarString.setPurchasePrice(30);
        assertEquals(30, guitarString.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(30, guitarString.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice() {
        guitarString.setSalePrice(40);
        assertEquals(40, guitarString.getSalePrice(), 0.01);
    }

}

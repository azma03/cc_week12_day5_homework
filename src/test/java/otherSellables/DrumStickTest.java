package otherSellables;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp() throws Exception {
        drumStick = new DrumStick("Drum Stick", 25, 40);
    }

    @Test
    public void canGetType() {
        assertEquals("Drum Stick", drumStick.getType());
    }

    @Test
    public void canSetType() {
        drumStick.setType("Another Drum Stick");
        assertEquals("Another Drum Stick", drumStick.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(25, drumStick.getPurchasePrice(), 0.01);
    }

    @Test
    public void canSetPurchasePrice() {
        drumStick.setPurchasePrice(30);
        assertEquals(30, drumStick.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(40, drumStick.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice() {
        drumStick.setSalePrice(50);
        assertEquals(50, drumStick.getSalePrice(), 0.01);
    }

}

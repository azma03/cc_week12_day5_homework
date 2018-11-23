package instruments;

import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    
    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet("Wood", "Brown", InstrumentType.WOODWIND, 50, 70, 6);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", trumpet.getMaterial());
    }

    @Test
    public void canSetGuitar() {
        trumpet.setMaterial("Basswood");
        assertEquals("Basswood", trumpet.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown", trumpet.getColour());
    }

    @Test
    public void canSetColour() {
        trumpet.setColour("Black");
        assertEquals("Black", trumpet.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.WOODWIND, trumpet.getType());
    }

    @Test
    public void canSetType() {
        trumpet.setType(InstrumentType.BRASS);
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(50, trumpet.getPurchasePrice(), 0.01);
    }

    @Test
    public void canSetPurchasePrice() {
        trumpet.setPurchasePrice(55);
        assertEquals(55, trumpet.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(70, trumpet.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice() {
        trumpet.setSalePrice(90);
        assertEquals(90, trumpet.getSalePrice(), 0.01);
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, trumpet.getNumberOfValves());
    }

    @Test
    public void canSetNumberOfStrings() {
        trumpet.setNumberOfValves(8);
        assertEquals(8, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Playing Trumpet...", trumpet.sound());
    }
}

package instruments;

import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Wood", "Brown", InstrumentType.STRING, 100, 150, 6);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canSetGuitar() {
        guitar.setMaterial("Basswood");
        assertEquals("Basswood", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void canSetColour() {
        guitar.setColour("Black");
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void canSetType() {
        guitar.setType(InstrumentType.BRASS);
        assertEquals(InstrumentType.BRASS, guitar.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(100, guitar.getPurchasePrice(), 0.01);
    }

    @Test
    public void canSetPurchasePrice() {
        guitar.setPurchasePrice(102.5);
        assertEquals(102.5, guitar.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(150, guitar.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice() {
        guitar.setSalePrice(170);
        assertEquals(170, guitar.getSalePrice(), 0.01);
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canSetNumberOfStrings() {
        guitar.setNumberOfStrings(8);
        assertEquals(8, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Playing Guitar...", guitar.sound());
    }
}

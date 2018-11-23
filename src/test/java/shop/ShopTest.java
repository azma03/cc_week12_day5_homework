package shop;

import enums.InstrumentType;
import instruments.Guitar;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import otherSellables.DrumStick;
import otherSellables.GuitarString;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Trumpet trumpet;
    DrumStick drumStick;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Ray's Music Exchange");

        guitar = new Guitar("Wood", "Brown", InstrumentType.STRING, 100, 150, 6);
        trumpet = new Trumpet("Wood", "Brown", InstrumentType.WOODWIND, 50, 70, 6);
        drumStick = new DrumStick("Drum Stick", 25, 40);

        shop.addItem(guitar);
        shop.addItem(trumpet);
        shop.addItem(drumStick);
    }


    @Test
    public void canGetName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canSetName() {
        shop.setName("Music Factory");
        assertEquals("Music Factory", shop.getName());
    }

    @Test
    public void canCountItems() {
        assertEquals(3, shop.getItemCount());
    }

    @Test
    public void canAddItems() {
       GuitarString guitarString = new GuitarString("Guitar String", 20, 30);
       shop.addItem(guitarString);
       assertEquals(4, shop.getItemCount());
    }

    @Test
    public void canRemoveItems() {
        shop.removeItem(guitar);
        assertEquals(2, shop.getItemCount());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        assertEquals(85, shop.calculateTotalPotentialProfit(), 0.01);
    }
}

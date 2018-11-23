package instruments;

import enums.InstrumentType;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String material, String colour, InstrumentType type, double purchasePrice, double salePrice, int numberOfValves) {
        super(material, colour, type, purchasePrice, salePrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    public String sound() {
        return "Playing Trumpet...";
    }
}

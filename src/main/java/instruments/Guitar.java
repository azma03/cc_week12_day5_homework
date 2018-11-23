package instruments;

import enums.InstrumentType;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType type, double purchasePrice, double salePrice, int numberOfStrings) {
        super(material, colour, type, purchasePrice, salePrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String sound() {
        return "Playing Guitar...";
    }
}

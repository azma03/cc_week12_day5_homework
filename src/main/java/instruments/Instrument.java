package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import enums.InstrumentType;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private InstrumentType type;
    private double purchasePrice;
    private double salePrice;

    public Instrument(String material, String colour, InstrumentType type, double purchasePrice, double salePrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double calculateMarkUp(){
        return this.salePrice - this.purchasePrice;
    }
}

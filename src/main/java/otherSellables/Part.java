package otherSellables;

import behaviours.ISell;

public abstract class Part implements ISell {

    private String type;
    private double purchasePrice;
    private double salePrice;

    public Part(String type, double purchasePrice, double salePrice) {
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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

package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemCount(){
        return this.stock.size();
    }

    public void addItem(ISell iSell){
        this.stock.add(iSell);
    }

    public void removeItem(ISell iSell){
        this.stock.remove(iSell);
    }

    public double calculateTotalPotentialProfit(){
        double totalPotentialProfit = 0;

        for(ISell isell: stock){
            totalPotentialProfit += isell.calculateMarkUp();
        }
        return totalPotentialProfit;
    }
}

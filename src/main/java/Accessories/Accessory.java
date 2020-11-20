package Accessories;

import Behaviours.ISell;

public abstract class Accessory implements ISell {

    private String brand;
    private String description;
    private double boughtPrice;
    private double sellPrice;

    public Accessory(String brand, String description, double boughtPrice, double sellPrice) {
        this.brand = brand;
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }
}

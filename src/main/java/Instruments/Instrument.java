package Instruments;

public abstract class Instrument {

    private String brand;
    private String colour;
    private String material;
    private double boughtPrice;
    private double sellPrice;

    public Instrument(String brand, String colour, String material, double boughtPrice, double sellPrice) {
        this.brand = brand;
        this.colour = colour;
        this.material = material;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}

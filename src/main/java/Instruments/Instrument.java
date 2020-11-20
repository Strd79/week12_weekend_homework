package Instruments;

public abstract class Instrument {

    private String brand;
    private String colour;
    private String material;

    public Instrument(String brand, String colour, String material) {
        this.brand = brand;
        this.colour = colour;
        this.material = material;
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
}

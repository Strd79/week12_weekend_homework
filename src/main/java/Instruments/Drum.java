package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Drum extends Instrument implements IPlay, ISell {

    private int diameter;

    public Drum(String brand, String colour, String material, double boughtPrice, double sellPrice, int diameter) {
        super(brand, colour, material, boughtPrice, sellPrice);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public String play() {
        return "Boom boom boom";
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }
}

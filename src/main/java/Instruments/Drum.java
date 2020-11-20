package Instruments;

import Behaviours.IPlay;

public class Drum extends Instrument implements IPlay {

    private int diameter;

    public Drum(String brand, String colour, String material, int diameter) {
        super(brand, colour, material);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public String play() {
        return "Boom boom boom";
    }
}

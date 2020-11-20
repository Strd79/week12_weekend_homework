package Instruments;

import Behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay {

    private SaxophoneType saxophoneType;

    public Saxophone(String brand, String colour, String material, SaxophoneType saxophoneType) {
        super(brand, colour, material);
        this.saxophoneType = saxophoneType;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public String play() {
        return "Jazzy jazz jazz jazz";
    }
}

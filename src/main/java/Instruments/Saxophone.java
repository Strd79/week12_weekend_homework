package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Saxophone extends Instrument implements IPlay, ISell {

    private SaxophoneType saxophoneType;

    public Saxophone(String brand, String colour, String material, double boughtPrice, double sellPrice, SaxophoneType saxophoneType) {
        super(brand, colour, material, boughtPrice, sellPrice);
        this.saxophoneType = saxophoneType;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public String play() {
        return "Jazzy jazz jazz jazz";
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }
}

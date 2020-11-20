package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private int numOfKeys;

    public Piano(String brand, String colour, String material, double boughtPrice, double sellPrice, int numOfKeys) {
        super(brand, colour, material, boughtPrice, sellPrice);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public String play() {
        return "Tinkle tinkle tinkle";
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }
}

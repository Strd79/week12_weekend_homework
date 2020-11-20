package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numOfStrings;

    public Guitar(String brand, String colour, String material, double boughtPrice, double sellPrice, int numOfStrings) {
        super(brand, colour, material, boughtPrice, sellPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play() {
        return "Strum strum strum";
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }
}

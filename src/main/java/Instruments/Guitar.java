package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numOfStrings;

    public Guitar(String brand, String colour, String material, int numOfStrings) {
        super(brand, colour, material);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play() {
        return "Strum strum strum";
    }
}

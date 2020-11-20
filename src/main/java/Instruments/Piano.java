package Instruments;

import Behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private int numOfKeys;

    public Piano(String brand, String colour, String material, int numOfKeys) {
        super(brand, colour, material);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public String play() {
        return "Tinkle tinkle tinkle";
    }
}

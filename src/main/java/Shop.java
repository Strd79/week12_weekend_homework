import Behaviours.ISell;
import Instruments.Drum;
import Instruments.Guitar;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }

    public double calculatePotentialProfit() {
        double potentialProfit = 0;
        for(ISell item : stock) {
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }
}

import Accessories.DrumSticks;
import Accessories.GuitarPicks;
import Accessories.SaxophoneReeds;
import Accessories.SheetMusic;
import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    public Shop shop;
    public Drum drum;
    public Guitar guitar1;
    public Guitar guitar2;
    public Piano piano;
    public Saxophone saxophone1;
    public Saxophone saxophone2;
    public Saxophone saxophone3;
    public DrumSticks drumsticks;
    public GuitarPicks guitarPicks;
    public SaxophoneReeds saxophoneReeds;
    public SheetMusic sheetMusic;

    @Before
    public void before() {
        shop = new Shop();
        drum = new Drum("Pearl", "deep red", "maple, steel and plastic", 83.50, 99.99, 18);
        guitar1 = new Guitar("Fender", "green", "mahogany, metal and plastic", 312.74, 420.00, 6);
        guitar2 = new Guitar("Gibson", "brown", "mahogany, metal and plastic", 200, 310.00, 8);
        piano = new Piano("Steinway", "black", "wood, cast iron and steel wires", 500.00, 750.00, 88);
        saxophone1 = new Saxophone("Yamaha", "gold", "brass",100.00, 169.50, SaxophoneType.ALTO);
        saxophone2 = new Saxophone("Yamaha", "gold", "brass",98.00, 130.00, SaxophoneType.TENOR);
        saxophone3 = new Saxophone("Yamaha", "gold", "brass",230.00, 300.50, SaxophoneType.BARITONE);
        drumsticks = new DrumSticks("Promark", "Premium drumsticks", 20.00, 56.00);
        guitarPicks = new GuitarPicks("Fender", "551 Shape Classic Celluloid", 1.00, 3.99);
        saxophoneReeds = new SaxophoneReeds("Vandoren Java", "Brighter sound, particularly good for big band playing", 12.50, 27.00);
        sheetMusic = new SheetMusic("Wise Publications", "Easy piano arrangements of 50 songs", 3.90, 14.99);


    }

    @Test
    public void canAddToStock() {
        shop.addToStock(drum);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(drumsticks);
        shop.addToStock(piano);
        shop.removeFromStock(drumsticks);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canCalculatePotentialProfit() {
        shop.addToStock(drum);
        shop.addToStock(guitar1);
        shop.addToStock(guitar2);
        shop.addToStock(piano);
        shop.addToStock(saxophone1);
        shop.addToStock(saxophone2);
        shop.addToStock(saxophone3);
        shop.addToStock(drumsticks);
        shop.addToStock(guitarPicks);
        shop.addToStock(saxophoneReeds);
        shop.addToStock(sheetMusic);
        assertEquals(11, shop.getStock().size());
        assertEquals(728.13, shop.calculatePotentialProfit(), 0.01);
    }
}

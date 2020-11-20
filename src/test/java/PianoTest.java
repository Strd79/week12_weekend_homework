import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    public Piano piano;

    @Before
    public void before() {
        piano = new Piano("Steinway", "black", "wood, cast iron and steel wires", 500.00, 750.00, 88);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Steinway", piano.getBrand());
    }

    @Test
    public void canGetColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("wood, cast iron and steel wires", piano.getMaterial());
    }

    @Test
    public void canGetBoughtPrice() {
        assertEquals(500.00, piano.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(750.00, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canGetNumOfKeys() {
        assertEquals(88, piano.getNumOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Tinkle tinkle tinkle", piano.play());
    }

    @Test
    public void checkMarkup() {
        assertEquals(250.00, piano.calculateMarkup(), 0.01);
    }
}

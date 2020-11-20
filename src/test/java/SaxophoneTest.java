import Instruments.Saxophone;
import Instruments.SaxophoneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    public Saxophone saxophone;

    @Before
    public void before() {
            saxophone = new Saxophone("Yamaha", "gold", "brass",120.00, 169.50, SaxophoneType.ALTO);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Yamaha", saxophone.getBrand());
    }

    @Test
    public void canGetColour() {
        assertEquals("gold", saxophone.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void canGetBoughtPrice() {
        assertEquals(120.00, saxophone.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(169.50, saxophone.getSellPrice(), 0.01);
    }

    @Test
    public void canGetType() {
        assertEquals(SaxophoneType.ALTO, saxophone.getSaxophoneType());
    }

    @Test
    public void canPlay() {
        assertEquals("Jazzy jazz jazz jazz", saxophone.play());
    }

    @Test
    public void checkMarkup() {
        assertEquals(49.50, saxophone.calculateMarkup(), 0.01);
    }
}

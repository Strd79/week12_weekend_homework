import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    public Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "green", "mahogany, metal and plastic", 6);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void canGetColour() {
        assertEquals("green", guitar.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("mahogany, metal and plastic", guitar.getMaterial());
    }

    @Test
    public void canGetNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum strum strum", guitar.play());
    }
}

import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    public Drum drum;

    @Before
    public void before() {
        drum = new Drum("Pearl", "deep red", "maple, steel and plastic", 18);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Pearl", drum.getBrand());
    }

    @Test
    public void canGetColour() {
        assertEquals("deep red", drum.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("maple, steel and plastic", drum.getMaterial());
    }

    @Test
    public void canGetDiameter() {
        assertEquals(18, drum.getDiameter());
    }

    @Test
    public void canPlay() {
        assertEquals("Boom boom boom", drum.play());
    }
}

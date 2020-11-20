import Accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    public DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Promark", "Premium drumsticks", 20.00, 56.00);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Promark", drumSticks.getBrand());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Premium drumsticks", drumSticks.getDescription());
    }

    @Test
    public void canGetBoughtPrice() {
        assertEquals(20.00, drumSticks.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(56.00, drumSticks.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(36.00, drumSticks.calculateMarkup(), 0.01);
    }
}

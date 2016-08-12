package fruity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FruityTest {

    @Test
    public void testOneAppleIs60Pence() {
        assertEquals(60, FruitCart.getTotal("Apple"));
    }

    @Test
    public void testOneOrangeIs25Pence() {
        assertEquals(25, FruitCart.getTotal("Orange"));
    }
}
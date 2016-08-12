package fruity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;


public class FruityTest {
    // ////////////////////////////////////////////////////////////////////////
    // Just one item
    // ////////////////////////////////////////////////////////////////////////
    @Test
    public void testOneAppleIs60Pence() {
        assertEquals(60, FruitCart.getTotal(Arrays.asList("Apple")));
    }

    @Test
    public void testOneOrangeIs25Pence() {
        assertEquals(25, FruitCart.getTotal(Arrays.asList("Orange")));
    }

    // ////////////////////////////////////////////////////////////////////////
    // Two items
    // ////////////////////////////////////////////////////////////////////////
    @Test
    public void testTwoApplesIs120Pence() {
        assertEquals(120, FruitCart.getTotal(Arrays.asList("Apple", "Apple")));
    }

    @Test
    public void testTwoOrangesIs50Pence() {
        assertEquals(50, FruitCart.getTotal(Arrays.asList("Orange", "Orange")));
    }

    @Test
    public void testAppleAndOrangeIs85Pence() {
        assertEquals(85, FruitCart.getTotal(Arrays.asList("Apple", "Orange")));
    }

    // ////////////////////////////////////////////////////////////////////////
    // A whole bunch of random items
    // ////////////////////////////////////////////////////////////////////////
    @Test
    public void testAppleAppleOrangeAppleIs205Pence() {
        // combination taken from requirements example
        assertEquals(205, FruitCart.getTotal(Arrays.asList("Apple", "Apple", "Orange", "Apple")));
    }

    @Test
    public void testOrangeAppleOrangeAppleOrangeAppleIs255Pence() {
        assertEquals(255, FruitCart.getTotal(Arrays.asList("Orange", "Apple", "Orange", "Apple", "Orange", "Apple")));
    }

}
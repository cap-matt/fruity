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
    public void testTwoApplesIs60Pence() {
        // apples are buy-one-get-one-free, so only 1 of the 2 apples should be counted
        assertEquals(60, FruitCart.getTotal(Arrays.asList("Apple", "Apple")));
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
    public void testAppleAppleOrangeAppleIs145Pence() {
        // combination taken from requirements example
        // apples are buy-one-get-one-free, so only 2 of the 3 apples should be counted
        assertEquals(145, FruitCart.getTotal(Arrays.asList("Apple", "Apple", "Orange", "Apple")));
    }

    @Test
    public void testOrangeAppleOrangeAppleOrangeAppleIs170Pence() {
        // apples are buy-one-get-one-free, so only 2 of the 3 apples should be counted
        // oranges are 3-for-2, so only 2 of the 3 oranges should be counted
        assertEquals(170, FruitCart.getTotal(Arrays.asList("Orange", "Apple", "Orange", "Apple", "Orange", "Apple")));
    }

    @Test
    public void testOrangeOrangeOrangeIs50Pence() {
        // oranges are 3-for-2, so only 2 of the 3 oranges should be counted
        assertEquals(50, FruitCart.getTotal(Arrays.asList("Orange", "Orange", "Orange")));
    }

    @Test
    public void testFourOranges75Pence() {
        // oranges are 3-for-2, so only 3 of the 4 oranges should be counted
        assertEquals(75, FruitCart.getTotal(Arrays.asList("Orange", "Orange", "Orange", "Orange")));
    }

    @Test
    public void testFiveOrangesIs100Pence() {
        // oranges are 3-for-2, so only 4 of the 5 oranges should be counted
        assertEquals(100, FruitCart.getTotal(Arrays.asList("Orange", "Orange", "Orange", "Orange", "Orange")));
    }

    @Test
    public void testSixOrangesIs100Pence() {
        // oranges are 3-for-2, so only 4 of the 6 oranges should be counted
        assertEquals(100, FruitCart.getTotal(Arrays.asList("Orange", "Orange", "Orange", "Orange", "Orange", "Orange")));
    }
}
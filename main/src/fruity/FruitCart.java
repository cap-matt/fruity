package fruity;

/**
 * A simple Fruit Shop 'checkout' system for calculating the total cost of a given 'item'.
 *
 * @author Matt Seymour
 */
public class FruitCart {
    /**
     * Get the cost of the given item.
     *
     * @param item The cost of the given item.
     * @return The cost of the given item.
     */
    public static int getTotal(String item) {
        int total = 0;

        if ("Apple".equalsIgnoreCase(item)) {
            total = 60;
        }

        if ("Orange".equalsIgnoreCase(item)) {
            total = 25;
        }

        //assumption: no error handling necessary of 'invalid' item names

        return total;
    }
}
package fruity;

import java.util.List;

/**
 * A simple Fruit Shop 'checkout' system for calculating the total cost of a given set of
 * 'items'.
 * <p>
 * The main method of interest to client code is the getTotal() method.
 *
 * @author Matt Seymour
 */
public class FruitCart {
    public static String APPLE = "Apple";
    public static String ORANGE = "Orange";

    /**
     * Get the total cost of the given items.
     *
     * @param items The items to be 'totalled'.
     * @return The total cost of the given items.
     */
    public static int getTotal(List<String> items) {
        // item counts
        final int apples = count(APPLE, items);
        final int oranges = count(ORANGE, items);

        // item totals
        final int appleTotal = bogof(apples, 60);
        final int orangeTotal  = threeForTwo(oranges, 25);

        return appleTotal + orangeTotal;
    }

    /**
     * Apply a 'Buy-one-get-one-free' algorithm to calculate the cost of the
     * specified number of items at the given <tt>price</tt>.
     *
     * @param count The number of items.
     * @param price The unit price of each item.
     * @return the cost of the specified number of items at the given
     * <tt>price</tt> with a 'Buy-one-get-one-free' discount applied.
     */
    public static int bogof(int count, int price) {
        int total = ((count / 2) * price);

        // count is odd
        if(count % 2 > 0) {
            // for odd numbers one gets 'lost' in rounding
            // so add the cost of another item
            total += price;
        }
        // else - even number, the calculated cost will be correct.

        return total;
    }

    /**
     * Count the number of occurrences of the given <tt>item</tt> within the
     * given <tt>items</tt> List.
     *
     * @param item  The item name being sought.
     * @param items The List in which to 'search' for the given item name.
     * @return The number of occurrences of the given <tt>item</tt> within the
     * given <tt>items</tt> List.
     */
    public static int count(String item, List<String> items) {
        int count = 0;

        if (item != null && items != null) {
            for (String currItem : items) {
                if (item.equalsIgnoreCase(currItem)) {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * Apply a '3-for-2' algorithm to calculate the cost of the
     * specified number of items at the given <tt>price</tt>.
     *
     * @param count The number of items.
     * @param price The unit price of each item.
     * @return the cost of the specified number of items at the given
     * <tt>price</tt> with a '3-for-2' discount applied.
     */
    public static int threeForTwo(int count, int price) {
        // each 'set' of 3 items costs the price of 2
        int total = ((count / 3) * (price * 2));
        final int remainderCount = count % 3;

        // count is not exactly divisible by the 'discount threashold' (3)
        if(remainderCount > 0) {
            // so add the cost of the 'remainder' number of items
            total += remainderCount * price;
        }

        return total;
    }
}
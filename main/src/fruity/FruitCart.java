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
        final int appleTotal = bogoff(apples, 60);
        final int orangeTotal  = (oranges * 25);

        return appleTotal + orangeTotal;
    }

    /**
     * Apply a 'Buy-one-get-one-free' algorithm to calculate the cost of the
     * specified number of items at the given <tt>price</tt>.
     *
     * @param count The number of items.
     * @param price The unit price of each item.
     * @return the cost of the specified number of items at the given
     * <tt>price</tt>.
     */
    public static int bogoff(int count, int price) {
        int total = 0;

        total  = ((count / 2) * price);
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
}
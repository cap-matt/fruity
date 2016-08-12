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

        // orange total
        final int orangeTotal  = (oranges * 25);

        // apple total - applying a 'BOGOFF' discount...
        int appleTotal  = ((apples / 2) * 60);
        // odd number of apples
        if(apples % 2 > 0) {
            // for odd numbers of apples one gets 'lost' in rounding
            // so add the cost of another apple
            appleTotal += 60;
        }
        // else - even number of apples, the calculated cost will already be correct.

        return appleTotal + orangeTotal;
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
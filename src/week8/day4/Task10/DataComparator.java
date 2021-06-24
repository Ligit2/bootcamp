package week8.day4.Task10;

import java.util.Comparator;

public class DataComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o2.getDeliveryData().compareTo(o1.getDeliveryData());
    }
}

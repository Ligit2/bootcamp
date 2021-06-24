package week8.day4.Task10;

import java.util.Comparator;

public class MinComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
       return o1.getPrice().compareTo(o2.getPrice());
    }
}

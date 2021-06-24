package week7.day5;

import java.util.Comparator;
import java.util.Map;

public class MyComparator<K extends Comparable, V extends Comparable> implements Comparator<Map.Entry<K, V>> {
    @Override
    public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
        if (o1.getValue().compareTo(o2.getValue()) < 0) {
            return -1;
        } else if (o1.getValue().compareTo(o2.getValue()) > 0) {
            return 1;
        } else {
            if (o1.getKey().compareTo(o2.getKey()) < 0) {
                return -1;
            } else if (o1.getKey().compareTo(o2.getKey()) > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

package week7.day5;

import java.util.*;

public class Tasks {

    public static <K, V> void copy(Map<K, V> map1, Map<K, V> map2) {
        map2.clear();
        for (Map.Entry<K, V> current :
                map1.entrySet()) {
            map2.put(current.getKey(), current.getValue());
        }
    }

    public static <K, V> void removeAll(Map<K, V> map) {
        Iterator<K> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static <K, V> boolean checkKey(Map<K, V> map, K key) {
        for (K current :
                map.keySet()) {
            if (current == key)
                return true;
        }
        return false;
    }

    public static <K, V> void view(Map<K, V> map) {
        for (K current :
                map.keySet()) {
            System.out.println(current);
        }
    }

    public static <K, V> void viewValues(Map<K, V> map) {
        for (Map.Entry<K, V> current :
                map.entrySet()) {
            System.out.println(current.getValue());
        }
    }

    public static <K, V> K getLast(Map<K, V> map) {
        Iterator<K> iterator = map.keySet().iterator();
        K obj = null;
        while (iterator.hasNext()) {
            obj = iterator.next();
        }
        return obj;
    }

    public static <K, V> void viewReverse(TreeMap<K, V> map) {
        Map<K, V> m = map.descendingMap();
        for (K key :
                m.keySet()) {
            System.out.println(key);
        }
    }

    public static <K extends Comparable, V> Map<K,V> getPortionOf(Map<K, V> map, K key) {
        HashMap<K, V> splitMap = new HashMap<>();
        for (Map.Entry<K, V> current :
                map.entrySet()) {
            if (current.getKey().compareTo(key) >= 0) {
                splitMap.put(current.getKey(), current.getValue());
            }
        }
        return splitMap;
    }
    public static <K extends Comparable,V> K getGreaterLastKey(Map<K,V> map, K key){
        ArrayList<K> ks1 = new ArrayList<>(map.keySet());
        Collections.reverse(ks1);
        Iterator<K> iterator = ks1.iterator();
        while(iterator.hasNext()){
            K obj = iterator.next();
            if(obj.compareTo(key)>=0)
                return obj;
        }
        return null;
    }
}

package week7.day5;

import java.util.*;

public class TaskAster {
    static private ArrayList<Integer> array;

    public static void getAnswer(Integer array1[]) {
        array = new ArrayList(Arrays.asList(array1));
        convert();
    }

    private static void convert() {
        HashMap<Integer, Integer> entries = new HashMap<>();
        while (array.size() > 0) {
            Integer obj = array.get(0);
            Iterator<Integer> iterator = array.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                if (iterator.next().equals(obj)) {
                    count++;
                    iterator.remove();
                }
            }
            entries.put(obj, count);
        }
       printSorted(entries);
    }

    private static void printSorted(Map<Integer, Integer> entries) {
        SortedSet<Map.Entry<Integer, Integer>> sortedset = new TreeSet<>(new MyComparator<>());
        sortedset.addAll(entries.entrySet());
        Iterator<Map.Entry<Integer, Integer>> iterator = sortedset.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> l = iterator.next();
            Integer k = l.getValue();
            while (!k.equals(0)) {
                System.out.print(l.getKey() + " ");
                k--;
            }
        }
    }
}

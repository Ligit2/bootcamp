package week7.day5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*SortedMap<Integer, Integer> objectObjectTreeMap = new TreeMap<Integer,Integer>();
        objectObjectTreeMap.put(4,2);
        objectObjectTreeMap.put(3,1);
        objectObjectTreeMap.put(6,1);
        objectObjectTreeMap.put(5,2);
        ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(objectObjectTreeMap.entrySet());
        Collections.sort(entries,new MyComparator<>());
        System.out.println(entries);
        System.out.println(objectObjectTreeMap);*/
        /*Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        Integer array1[] = new Integer[length];
        for (int i = 0; i < length; i++) {
            array1[i] = scanner.nextInt();
        }
        TaskAster.getAnswer(array1);*/
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aabbnnnnmm");
        strings.add("bbbbbb");
        strings.add("ababa");
        strings.add("dnmmmklllwettttt");
        System.out.println(StringTask.getAnswer(strings));
    }
}

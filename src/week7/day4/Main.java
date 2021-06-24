package week7.day4;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        MyHashMap<Integer, String> integerStringMyHashMap = new MyHashMap<>();
//        integerStringMyHashMap.put(8,"aa");
//        integerStringMyHashMap.put(9,"aa");
//        integerStringMyHashMap.put(24,"ab");
//        integerStringMyHashMap.put(null,"ab");
        //integerStringMyHashMap.put(5,"bb");
        //integerStringMyHashMap.put(null,null);
        //integerStringMyHashMap.put(null,"abs");
//        System.out.println(integerStringMyHashMap);
        //System.out.println(integerStringMyHashMap.get(null).getClass());
        /*Student [] students = {new Student("aa",2)};
        List arrayList = Arrays.asList(students);
        System.out.println(arrayList.getClass());*/

//        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(4);
//        hashSet.add(2);
//        hashSet.add(-1);
//        hashSet.add(9);
//        System.out.println(hashSet);
//        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
//        treeSet.addAll(hashSet);
//        System.out.println(treeSet);

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"a");
        hashMap.put(3,"c");
        hashMap.put(7,"g");
        hashMap.put(0,"w");

        TreeMap<Integer,String> treeMap = new TreeMap<>(Collections.reverseOrder());
        treeMap.putAll(hashMap);
        System.out.println(treeMap);

    }
}

package week7.day4;

import java.util.LinkedList;

public class MyHashMap<K, V> {
    private LinkedList<Entry<K, V>>[] array;
    private int capacity;
    private int size;
    private final int factor = 16;

    public MyHashMap() {
        capacity = factor;
        array = new LinkedList[capacity];
    }

    public void put(K key, V value) {
        extend();
        int index = 0;
        if (key != null) {
            int hashCode = key.hashCode();
            index = hashCode % capacity;
        }
        if (array[index] == null) {
            array[index] = new LinkedList<Entry<K, V>>();
            array[index].push(new Entry<K, V>(key, value));
            size++;
            return;
        }
        for (int i = 0; i < array[index].size(); i++) {
            if (equals(array[index].get(i).getKey(), key)) {
                array[index].get(i).setValue(value);
                return;
            }
        }
        array[index].push(new Entry<>(key, value));
        size++;
    }

    public Entry<K, V> get(K key) {
        int index = 0;
        if (key != null) {
            index = key.hashCode() % capacity;
        }
        if (array[index] != null) {
            for (int i = 0; i < array[index].size(); i++) {
                if (equals(array[index].get(i).getKey(), key)) {
                    return array[index].get(i);
                }
            }
        }
        return null;
    }

    private boolean checkSize() {
        return size == capacity * 7 / 10;
    }

    private void extend() {
        if (checkSize()) {
            capacity += factor;
            LinkedList<Entry<K, V>> []newArray = new LinkedList[capacity];
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    for (int j = 0; j < array[i].size(); j++) {
                        fullArray(newArray,array[i].get(j));
                    }
                }
            }
            array = newArray;
        }
    }
    private void fullArray(LinkedList<Entry<K,V>>[] array1, Entry<K,V> entry){
        int index=0;
        if (entry.getKey() != null) {
            int hashCode = entry.getKey().hashCode();
            index = hashCode % capacity;
        }
        if (array1[index] == null) {
            array1[index]= new LinkedList<Entry<K,V>>();
            array1[index].push(entry);
        }
       else {
            array[index].add(entry);
        }
    }

    private boolean equals(K key1, K key2) {
        if (key1 == null && key2 == null)
            return true;
        if (key1 != null)
            return key1.equals(key2);
        return false;
    }

    @Override
    public String toString() {
        String s="";
        for (int i = 0; i < capacity; i++) {
            if(array[i]!=null) {
                s += array[i].toString()+'\n';
            }
        }
        return s;
    }
}

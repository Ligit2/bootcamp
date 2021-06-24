package week7.day3;

import java.util.*;

public class Tasks {
    public static int countOfElements(Set set) {
        Iterator iterator = set.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }
        return count;
    }

    public static void print(Set set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static boolean isEmpty(Set set) {
        Iterator iterator = set.iterator();
        boolean check = iterator.hasNext();
        return check;
    }

    public static <T> void cloneSet(Set<T> set1, Set<T> set2) {
        Iterator iterator = set1.iterator();
        set2.clear();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            set2.add((T) obj);
        }
    }

    public static <T> TreeSet<T> toTreeSet(HashSet<T> set) {
        TreeSet<T> ts = new TreeSet<>();
        Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()) {
            T obj = iterator.next();
            ts.add(obj);
        }
        return ts;
    }

    public static <T> ArrayList<T> toArrayList(HashSet<T> set) {
        ArrayList<T> list = new ArrayList<>();
        Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            list.add((T) obj);
        }
        return list;
    }

    public static <T>boolean compare(Set<T> s1, Set<T> s2) {
        if (s1.size() != s2.size()) return false;
        else {
            Iterator<T> iterator = s1.iterator();
            Iterator<T> iterator1 = s2.iterator();
            while (iterator.hasNext()) {
                T obj1 = iterator.next();
                if (!obj1.equals(iterator1.next()))
                    return false;
            }
            return true;
        }
    }

    public static <T> T getFirst(TreeSet<T> tree) {
        Iterator<T> iterator = tree.iterator();
        if (iterator.hasNext())
            return iterator.next();
        return null;
    }

    public static <T> T getLast(TreeSet<T> tree) {
        Iterator<T> iterator = tree.iterator();
        T obj = null;
        for (int i = 0; i < tree.size(); i++) {
            obj = iterator.next();
        }
        return obj;
    }
    public static Integer getElementOf(TreeSet<Integer> tree, Integer t){
        Iterator<Integer> iterator = tree.iterator();
        int count=0;
        while(iterator.hasNext())
        {
            Integer t1 = iterator.next();
            if(t1.compareTo(t)<=0){
                return t1;
            }
        }
        return null;
    }
    public static <T> void removeElement(T obj, Set<T> tree){
        tree.remove(obj);
    }
    public static <T> boolean comparePriorityQ(Queue<T> queue1, Queue<T> queue2){
        if (queue1.size() != queue2.size()) return false;
        else {
            while(queue1.size()>0){
               if(! queue1.poll().equals(queue2.poll()))
                   return false;
            }
            return true;
        }
    }
    public static<T> void rotate(ArrayDeque<T> array,int d){
        if(d<=array.size()){
            int k = array.size()-d;
            for (int i = 0; i < k; i++) {
                T obj = array.removeLast();
                array.addFirst(obj);
            }
        }
    }
}

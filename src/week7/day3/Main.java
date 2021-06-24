package week7.day3;

import java.util.ArrayDeque;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        integers1.add(5);
        integers1.add(6);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        //System.out.println(week7.day3.HashSet.countOfElements(integers));
       // week7.day3.HashSet.print(integers);
       // System.out.println(week7.day3.HashSet.isEmpty(integers));
       // System.out.println(Tasks.getContOf(Tasks.toTreeSet(integers),7));
        /*TreeSet<Integer> tree = Tasks.toTreeSet(integers);
        Tasks.removeElement(4,tree);
        Tasks.print(tree);*/
        /*PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> objects = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(3);
        objects.add(2);
        objects.add(3);
        System.out.println(Tasks.comparePriorityQ(objects, priorityQueue));*/

       /* HashSet<Integer> integers2 = new HashSet<>();
        integers2.add(2);
        integers2.add(3);
        integers2.add(4);
        integers2.add(5);
        integers2.add(6);
        Set<Integer> integers3 = Collections.unmodifiableSet(integers2);
        Iterator<Integer> iterator = integers3.iterator();
        iterator.remove();*/
        ArrayDeque<Integer> array = new ArrayDeque<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        Tasks.rotate(array,3);
        System.out.println(array);
    }
}

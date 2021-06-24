package week6.day1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
       list.add(1);
       list.add(2);
      list.set(0, null);
        System.out.println(list);



    }
    public static void swap(LinkedList list,int index1, int index2){
        Object obj =  list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,obj);
        System.out.println(list.toString());
    }

}

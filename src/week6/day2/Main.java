package week6.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer array[]= {1,2,2,4,4,6,7,8,9};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        //System.out.println(duplicateNumber(list));
        reverse(list);
        System.out.println(list);

    }
    public static void reverse(ArrayList list){
        for (int i = 0; i <list.size()/2; i++) {
            Object temp = list.get(i);
            list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-i-1,temp);
        }
    }

    /*
    * task 18*/
    public static List duplicateNumber(List<Integer> array){
        ArrayList<Integer> integers = new ArrayList<>();
        int count=0;
        while(array.size()>0) {
            int i=0;
            count=0;
            Integer number = array.get(i);
            while(array.contains(number)){
                count++;
                array.remove(number);
            }
            if(count==2){
                integers.add(number);
            }
        }
        return integers;
    }
    /*
    * task 15*/
    public static int findMissingNumber(int array[]) {
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < array.length; i++) {
            sum1+=array[i];
        }
        for (int i = 1; i <= 100; i++) {
            sum2+=i;
        }
        return sum2-sum1;
    }
}

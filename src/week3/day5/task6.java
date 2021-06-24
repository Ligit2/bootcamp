package week3.day5;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int array[]= new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        double average = selectionSort(array);
        System.out.println(average);
        printArray(array);
    }
    public static double selectionSort(int array[]){
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min])
                    min=j;

            }
            sum+=array[i];
            int temp = array[i];
            array[i]=array[min];
            array[min]=temp;
        }
        System.out.println("min = " + array[0] + "  max = " + array[array.length - 1]);
        return sum/array.length;
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

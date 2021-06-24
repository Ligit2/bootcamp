package week3.day5;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int array[]= new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        insertionSort(array);
        printArray(array);
        System.out.println();
        System.out.println(searchBinary(array, number));

    }
    public static int searchBinary(int array[],int number){
        int left = 0;
        int right = array.length-1;
        int middle = left + (right-left)/2;
        while(left<=right){
            if(array[middle] == number){
                return middle;
            }
            else if(array[middle]<number){
                left = middle+1;
            }
            else{
                right = middle-1;
            }
            middle = left+(right-left)/2;
        }
        return -1;
    }
    public static void insertionSort(int array[]){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                int temp = array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                j--;
            }
        }
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

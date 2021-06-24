package week3.day5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int array[]= new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int average = bubbleSort(array);
        System.out.println(searchAverage(array, average));
        printArray(array);
    }
    public static int searchAverage(int array[],int number){
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
    public static int bubbleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    check = true;
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            if(!check){
                break;
            }
        }
        System.out.println("min = " + array[0] + "  max = " + array[array.length - 1]);
        return array[0]+array[array.length-1];
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

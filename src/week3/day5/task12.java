package week3.day5;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        int helper[] = new int [n];
        int i=0,j=0;
        while(i<n)
        {
            if(array[i]!=-1) {
                helper[j] = array[i];
                i++;
                j++;
            }
            else
            i++;
        }
        insertionSort(helper,j);
        for (int k = 0; k < n; k++) {
            if(array[k]==-1){
                for (int l = j; l >k; l--) {
                    helper[l]=helper[l-1];
                }
                helper[k]=-1;
                j++;
            }
        }
        printArray(helper);
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void insertionSort(int array[],int length) {
        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
    }
}

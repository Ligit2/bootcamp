package week3.day5;

import java.util.Scanner;

public class task12new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int j = 0, k = 1;
            while (j < n && k < n) {
                if (array[j] != -1 && array[k] != -1 && array[j] > array[k]) {
                    int temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                    j++;
                }
                if (j < n && k < n && array[j] != -1 && array[k] != -1 && array[j] <= array[k]) {
                    j++;
                    k++;
                }
                if (j < n && k < n && array[j] == -1) {
                    j++;
                    k++;
                }
                if (j < n && k < n && array[k] == -1) {
                    k++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

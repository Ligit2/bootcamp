package week3.day5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String array[] = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        bubbleSortStrings(array);
        printArray(array);
    }

    public static void bubbleSortStrings(String array[]) {
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
            }
            if (!check) {
                break;
            }
        }
        System.out.println(array[0] + " " + array[array.length - 1]);
    }

    public static void bubbleSortStringRecursive(String array[], int length) {
        if (length <= 1) return;
        for (int i = 0; i < length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                String temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        bubbleSortStringRecursive(array, length - 1);
    }

    public static void printArray(String array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

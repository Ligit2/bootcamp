package week4.day1;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = {1, -4, 40, 0, 7, 8, 3, -45,99};
        bubbleSort(array);
    }

    public static void bubbleSort(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

            }
            count++;
        }
        System.out.println(count);
    }

    public static void bubbleSortOptimization(int array[]) {
        int count = 0;
        boolean check = true;
        int count1 = 0;
        while (check) {
            check = false;
            for (int j = 0; j < array.length - 1 - count1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
            }
            count1++;
            count++;
        }
        System.out.println(count);
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

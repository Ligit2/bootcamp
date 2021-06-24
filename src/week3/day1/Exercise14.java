package week3.day1;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int [7];
        for (int i = 0; i < 7; i++) {
            array[i] = scanner.nextInt();
        }
        array = Copy(array);
        print(array);

    }
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] Copy(int[] array){
        int copyArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }
}

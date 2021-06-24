package week3.day1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int [7];
        for (int i = 0; i < 7; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(contains(array, 7));
    }
    public static boolean contains(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] ==key)
                return true;
        }
        return false;
    }
}

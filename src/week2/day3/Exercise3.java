package week2.day3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] > 0) {
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(count);
    }
}

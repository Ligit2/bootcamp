package week2.day3;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int repeat = 0;
        for (int i = 0; i < length; i++) {
            int count =0;
            for (int j = 0; j < length; j++) {
                if (arr[i] == arr[j] && i!=j)
                    count++;
            }
            if(count == 0) {
                repeat++;
            }
        }
        System.out.println(repeat);
    }
}

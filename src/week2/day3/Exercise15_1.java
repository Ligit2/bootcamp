package week2.day3;

import java.util.Scanner;

public class Exercise15_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int []arr = new int [length];
        for(int i=0;i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int count =0;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(length-count);
    }
}

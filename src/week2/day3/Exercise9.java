package week2.day3;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int []arr = new int [length];
        for(int i=0;i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        for(int i =length-1;i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

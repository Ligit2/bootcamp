package week2.day3;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int []arr = new int [length];
        for(int i=0;i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int index =scanner.nextInt();
        for(int i =index ;i<length-1; i++) {
            arr[i] = arr[i + 1];
        }
        length--;;
        for(int i = 0; i<length; i++ )
        {
            System.out.print(arr[i] + " ");
        }
    }
}

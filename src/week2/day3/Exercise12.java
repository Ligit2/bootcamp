package week2.day3;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int []arr = new int [length];
        for(int i=0;i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        for(int i =length-1 ;i>=1 ;i--)
        {
            int temp = arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;

        }
        for(int i = 0; i< length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

package week2.day3;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int []arr = new int [length];
        for(int i=0;i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        if(length%2 ==1) {
            for (int i = 1; i < length-1; i++) {
                    int helper = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = helper;
            }
        }
        else
        {
            for (int i = 1; i < length; i+=2) {

                int helper = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = helper;
            }
        }
        for(int i =0 ; i< length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

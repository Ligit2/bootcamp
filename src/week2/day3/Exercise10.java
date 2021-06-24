package week2.day3;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int []arr = new int [length];
        for(int i=0;i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int helper[]= new int[length];
        for(int i=0 ; i<length ;i++)
        {
            helper[i] = arr[length - i -1];
            System.out.print(helper[i] + " ");
        }
    }
}

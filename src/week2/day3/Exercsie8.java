package week2.day3;

import java.util.Scanner;

public class Exercsie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int []arr = new int [length];
        for(int i=0;i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int count = 1;
        for(int i = 0; i<length-1; i++)
        {
            if(arr[i] < arr[i+1])
                count++;
        }
        System.out.println(count);
    }
}

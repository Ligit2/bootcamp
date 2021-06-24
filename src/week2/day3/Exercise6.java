package week2.day3;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int []arr = new int [length];
        for(int i=0;i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int max=arr[0];
        int index=0;
        for(int i =1; i<length ;i++)
        {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max+ " "+index);
    }
}

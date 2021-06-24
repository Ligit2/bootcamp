package week2.day3;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int []arr = new int [length];
        for(int i=0;i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        for(int i = 1; i<length ;i++)
        {
            if((arr[i] >0 && arr[i-1] >0 ) || (arr[i]<0 && arr[i-1]<0))
            {
                System.out.println(arr[i - 1] + " " + arr[i]);
                break;
            }
        }
    }
}

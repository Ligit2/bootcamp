package week2.day3;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int []arr = new int [length];
        int maxindex = 0;
        int minindex = 0;
        for(int i=0;i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<length; i++)
        {
            if(arr[i] > max ) {
                max =arr[i];
                maxindex = i;
            }
            if(arr[i]<min) {
                min = arr[i];
                minindex = i;
            }
        }
        int temp = arr[minindex];
        arr[minindex] = arr[maxindex];
        arr[maxindex] = temp;
        for(int i =0; i<length ;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

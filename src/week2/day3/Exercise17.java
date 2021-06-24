package week2.day3;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean check = true;
        for(int i = 1; i<length-1; i++)
        {
            if(arr[i]< arr[i-1] || arr[i] > arr[i+1]) {
                check = false;
                break;
            }
        }
        boolean check1 = true;
        if(check == false)
        {
            for(int i = 1; i<length-1; i++)
            {
                if(arr[i]> arr[i-1] || arr[i] < arr[i+1]) {
                    check1 = false;
                    break;
                }
            }
        }
        if(check == true || check1 == true)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}

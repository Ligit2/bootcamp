package week2.day4;

import java.util.Scanner;

public class countOfDiffNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt() ;
        int []arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        int urishcount = 0;
        for (int i = 0; i < length-1; i++) {
            if(arr[i] == arr[i+1]) {
                count++;
            }
            else
            {
                if(count ==0)
                    urishcount++;
                count =0;
            }
        }
        if(arr[length-2] != arr[length-1])
            urishcount++;
        System.out.println(urishcount);

    }
}

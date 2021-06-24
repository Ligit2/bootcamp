package week2.day1;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i=1;
        int k =0;
        while(i < number)
        {
            i= i*2;
            k++;
        }
        System.out.println(k);
    }
}

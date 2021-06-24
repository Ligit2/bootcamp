package week2.day1;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        while(i <=number)
        {
            System.out.println(i);
            i = i * 2;
        }
    }
}

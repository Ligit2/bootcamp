package week2.day1;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 2;
        while(i <= number/2)
        {
            if(number % i == 0 )
            {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}

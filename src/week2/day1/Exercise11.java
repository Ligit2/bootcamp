package week2.day1;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int number = scanner.nextInt();
        while(n<=number)
        {
            if(n %3 == 0 )
            {
                n++;
                continue;
            }
                System.out.println(n);
                n++;
        }
    }
}

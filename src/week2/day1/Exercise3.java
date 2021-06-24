package week2.day1;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        if(number >= 1)
        {
            System.out.println(i);
            i++;
        }
        while(i <= number)
        {
            int j = 1;
            while(j <= i/2)
            {
                if(i == j*j)
                {
                    System.out.println(i);
                    break;
                }
                j++;
            }
            i++;
        }
    }
}

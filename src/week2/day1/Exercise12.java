package week2.day1;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int x =1;
        int y = 1;
        int z;
        int count = 1;
        while(true )
        {
            if(number == 1)
            {
                System.out.println(0);
                break;
            }
            z = x + y;
            x = y;
            y = z;
            count++;
            if(z == number)
            {
                System.out.println(count);
                break;
            }
            else if(z > number)
            {
                System.out.println(-1);
                break;
            }

        }
    }
}

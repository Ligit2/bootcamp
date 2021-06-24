package week2.day1;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x1 = num;
        int x2 = num;
        while(num !=0 )
        {
            num = scanner.nextInt();
            if(num > x1)
            {
                x2 = x1;
                x1 = num;
            }
            else if(num < x1)
            {
                if(num > x2 || (num < x2 && x2==x1 && num != 0))
                {
                    x2 = num;
                }
            }
        }
        System.out.println(x2);
    }
}

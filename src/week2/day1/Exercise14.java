package week2.day1;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deposit = scanner.nextInt();
        int percent =  scanner.nextInt();
        int contribution = scanner.nextInt();
        double sum  = deposit;
        int years = 0;
        while(sum <= contribution)
        {
            sum+= (double)deposit * percent/100;
            deposit = (int)sum;
            years++;
        }
        System.out.println(years);
    }
}

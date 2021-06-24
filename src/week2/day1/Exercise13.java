package week2.day1;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        int days =1;
        double sum = number1;
        while( sum <= number2)
        {
            sum += sum * 0.1;
            days++;
        }
        System.out.println(days);
    }
}

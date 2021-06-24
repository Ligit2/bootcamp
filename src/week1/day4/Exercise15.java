package week1.day4;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int count  = 1;
        if(number1 == number2)
        {
            count++;
            if(number1 == number3)
            {
                count++;
            }
        }
        else if(number1 == number3)
        {
            count++;
            if(number1 == number2)
            {
                count++;
            }
        }
        else
        {
            if(number2 == number3)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

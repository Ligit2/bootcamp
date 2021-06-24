package week2.day5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int helper = number1/100;
        int digit1 = helper/10;
        int digit2=helper%10;
        int number=1;
        number = 1001*digit1 + 110 *digit2;
        for(;number <= number2;)
        {
            System.out.println(number);
            if(digit2!=9)
            {
                digit2++;
            }
            else
            {
                digit1++;
                digit2=0;
            }
            number = 1001*digit1 + 110 *digit2;
        }
    }
}

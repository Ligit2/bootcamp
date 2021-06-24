package week1.day4;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if(number1 >= number2 && number1 >= number3)
        {
            System.out.println("The greatest number is "+ number1);

        }
        if(number2 >= number1 && number2 >= number3)
        {
            System.out.println("The greatest number is "+ number2);
        }
        else
        {
            System.out.println("The greatest number is "+ number3);
        }
    }
}

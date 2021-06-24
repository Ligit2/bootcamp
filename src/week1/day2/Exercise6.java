package week1.day2;

import java.util.Scanner;

//Input from console 3 arguments and then prints the sum, the difference, the average.
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int difference , sum;
        double overage ;
        difference = number1 - number2 - number3;
        sum  = number1 + number2 + number3;
        overage = sum/3;
        System.out.println(difference);
        System.out.println(sum);
        System.out.println(overage);
    }
}

package week1.day2;

import java.util.Scanner;

//Given 2 integer numbers, swap them,Input numbers from console.
public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        number1 = number1 + number2;
        number2 = number1-number2;
        number1= number1-number2;
        System.out.println(number1 + " "+ number2);
    }
}

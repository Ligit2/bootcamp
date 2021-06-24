package week1.day2;

import java.util.Scanner;

//Write a java program which has input number from console, and print the remainder.(use modulo operator)
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int remainder = number1 % number2;
        System.out.println(remainder);
    }
}

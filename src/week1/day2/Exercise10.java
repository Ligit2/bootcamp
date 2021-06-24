package week1.day2;

import java.util.Scanner;

//Given int number,input from console, find last digit and print it.
public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}

package week1.day2;

import java.util.Scanner;

//Given an integer  3-digit number, determine and print the sum of all 3 digits. Input number from console.
public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit= number/100;
        System.out.println(firstDigit);
    }
}

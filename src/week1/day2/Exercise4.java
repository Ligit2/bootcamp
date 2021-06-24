package week1.day2;

import java.util.Scanner;

//Write a Java program  that takes two numbers as input from the console and display the product of two numbers.
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int product = input1 * input2;
        System.out.println(product);
    }
}

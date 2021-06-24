package week1.day5;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number % 2) {
            case 0: {
                System.out.println("The number is even");
                break;
            }
            default: {
                System.out.println("The number is odd");
                break;
            }
        }
    }
}

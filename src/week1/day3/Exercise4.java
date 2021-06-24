package week1.day3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        float pi = 3.14159f;
        double perimeter = 2 * pi* radius;
        double area = pi * radius *radius;
        System.out.println(perimeter + " " + area);
    }
}

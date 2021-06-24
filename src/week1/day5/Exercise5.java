package week1.day5;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 4/30/2021.
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a >= b ? a : b;
        System.out.println(max);
        int abs = a < 0 ? -a : a;
        System.out.println(abs);
    }
}

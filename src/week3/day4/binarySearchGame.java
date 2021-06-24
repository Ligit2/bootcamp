package week3.day4;

import java.util.Scanner;

public class binarySearchGame {
    public static void main(String[] args) {
        search(1,100);
    }
    public static void search(int a, int b) {
        int left = a;
        int right = b;
        int middle = left + (right - left) / 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("if you memorize the number pls input ok");
        String text = scanner.next();
        if (text.equals("ok")) {
            while (left <= right) {
                System.out.println("Is it " + middle);
                text = scanner.next();
                if (text.equals("yes")) {
                    System.out.println("I guess it");
                    return;
                }
                System.out.println("is it grater then " + middle);
                text = scanner.next();
                if (text.equals("yes")) {
                    left = middle + 1;
                } else if (text.equals("no")) {
                    right = middle - 1;
                }
                middle = left + (right - left) / 2;
            }
        }
        return;
    }
}

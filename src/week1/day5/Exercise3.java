package week1.day5;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String text =  number > 0 ? "positive" : "negative";
        System.out.println(text);
    }
}

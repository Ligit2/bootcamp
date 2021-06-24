package week3.day3;

import java.util.Locale;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        text = text.toLowerCase(Locale.ROOT);
        isPalindrome(text);
    }
    public static void isPalindrome(String str) {
        StringBuilder s1 = new StringBuilder(str);
        StringBuilder s2 = new StringBuilder(str);
        s2.reverse();
        if (s1.toString().equals(s2.toString()))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");
    }
}

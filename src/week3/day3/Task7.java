package week3.day3;

import java.util.Locale;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(caesarCode(text, 6));
    }

    public static String caesarCode(String str, int n) {
        str = str.toUpperCase(Locale.ROOT);
        StringBuilder s = new StringBuilder(str);
        if (n > 26)
            n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char c = (char) ('A' + (s.charAt(i) + n - 65) % 26);
            s.replace(i, i + 1, c + "");
        }
        return s.toString();
    }
}

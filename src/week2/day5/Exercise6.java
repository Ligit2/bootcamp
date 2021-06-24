package week2.day5;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        char a = text.charAt(0);
        String text1 = "";
        if (a >= 'a' && a <= 'z')
            a -= 32;
            text1 += a;
        for (int i = 1; i < text.length(); i++) {
            a = text.charAt(i);
            if (a >= 'a' && a <= 'z')
                text1 = text1 + a;
            else if (a >= 'A' && a <= 'Z') {
                a += 32;
                text1 = text1 + a;
            }
        }
        System.out.println(text1);
    }
}

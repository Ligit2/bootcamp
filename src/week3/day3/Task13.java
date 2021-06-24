package week3.day3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(firstNonRepeated(str));
    }

    public static int firstNonRepeated(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean check = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && j != i) {
                    check = true;
                }
            }
            if (!check)
                return i;
        }
        return -1;
    }
}

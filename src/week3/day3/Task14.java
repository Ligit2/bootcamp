package week3.day3;

import java.io.IOException;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = (char) System.in.read();
        System.out.println(occurrence(str, c));
    }

    public static int occurrence(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }
}

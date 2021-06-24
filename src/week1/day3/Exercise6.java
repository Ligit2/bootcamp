package week1.day3;

import java.io.IOException;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char L = (char) System.in.read();
        char i= (char) System.in.read();
        char l = (char) System.in.read();
        int age = scanner.nextInt();
        String text = String.valueOf(L);
        text = text + i + l+ " " + String.valueOf(age);
        System.out.println(text);
    }
}

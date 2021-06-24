package week1.day5;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = "katuner";
        String text2 = new String("puchikner");
        boolean equal = text1 == text2;
        boolean equals = text1.equals(text2);
        System.out.println(equal);
        System.out.println(equals);
    }
}

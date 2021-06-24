package week1.day5;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int num = text == null ? -1 : (text == "" ? 0 :1);
        System.out.println(num);
    }
}

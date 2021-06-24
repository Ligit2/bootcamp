package week1.day3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte num1 = scanner.nextByte();
        short num2 = num1;
        System.out.println(num1 + " " + num2);
        int num3 = num2;
        System.out.println(num2 + " " + num3);
        long num4 = num3;
        System.out.println(num3 + " " + num4);
        float num5 = num4;
        System.out.println(num4 + " " + num5);
        double num6 =num5;
        System.out.println(num5 + " " + num6);
    }
}

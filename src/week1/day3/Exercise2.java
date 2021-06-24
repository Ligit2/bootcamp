package week1.day3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        float num2 = (float) num1;
        System.out.println(num1 + " " + num2);
        long num3 = (long) num2;
        System.out.println(num2 + " " + num3);
        int num4 = (int ) num3;
        System.out.println(num3 + " " + num4);
        short num5 = (short) num4;
        System.out.println(num4 + " " + num5);
        byte num6 = (byte) num5;
        System.out.println(num5 + " " + num6);
    }
}

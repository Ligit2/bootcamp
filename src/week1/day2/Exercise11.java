package week1.day2;

import java.util.Scanner;

//Given int numbers ,input a and b from console, determine and print the reminder from deleting  a to b
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a%b;
        System.out.println(a + " "+ b +" "+c);
    }
}

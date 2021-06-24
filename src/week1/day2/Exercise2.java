package week1.day2;

import java.util.Scanner;

//Write a Java program to convert minutes into a number of hours,print count of hours and minutes. Input minutes from console
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int hours;
        int minutes;
        hours = input / 60;
        minutes = input - hours*60;
        System.out.println(hours);
        System.out.println(minutes);
    }
}


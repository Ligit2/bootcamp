package week2.day5;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        int days = minutes/(60*24);
        int hours = (minutes % (60*24))/60;
        int minutes1 = (minutes % (60*24))%60;
        System.out.println(days + " " + hours + " " + minutes1);
    }
}

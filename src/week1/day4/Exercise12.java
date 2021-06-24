package week1.day4;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        if((value1 % 7 == 0 || value2 % 7 == 0 ) && value1 > 0 && value2 > 0 && value1 > value2 )
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}

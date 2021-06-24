package week1.day4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 5 == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}

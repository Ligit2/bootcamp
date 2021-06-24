package week1.day4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

    }
}

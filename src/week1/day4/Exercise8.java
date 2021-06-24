package week1.day4;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balls = scanner.nextInt();
        if(balls <= 0)
        {
            System.out.println("enter a positive number");
        }
        else if(balls < 3 || balls == 7)
        {
            System.out.println("you cant buy");
        }
        else
        {
            System.out.println("You can buy");
        }
    }
}

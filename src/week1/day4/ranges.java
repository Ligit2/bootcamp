package week1.day4;

import java.util.Scanner;

public class ranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >=10 && number <= 100)
        {
            System.out.println("number is in range 10 -> 100");
        }
        else if(number >= 200 && number <= 300)
        {
            System.out.println("number is in range of 200 -> 300");
        }
        else if(number > 300 && number <= 500)
        {
            System.out.println("number is in range of 300 -> 500");
        }
        else
        {
            System.out.println("number is in other range");
        }
    }
}

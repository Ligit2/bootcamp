package week1.day4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age >= 0 && age <18 ){
            System.out.println("You are not eligible to vote");
        }
        else if(age >= 18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("The age is incorrect");
        }
    }
}

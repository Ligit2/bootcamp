package week2.day1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt();
        int guess;
        while(true)
        {
            guess = scanner.nextInt();
            if(guess == number)
            {
                System.out.println("yes you guessed the number");
                break;
            }
            else if(guess >number)
            {
                System.out.println("too high , try again");
            }
            else
            {
                System.out.println("too low , try again");
            }
        }
    }
}

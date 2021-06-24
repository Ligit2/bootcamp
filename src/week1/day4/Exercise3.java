package week1.day4;

import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        if(number < 0)
        {
            number = -number;
        }
        int printNumber = 2 + number % 6;
        System.out.println(printNumber);
    }
}

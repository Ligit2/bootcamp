package week1.day2;

import java.util.Random;

// Generate and print random integer number between 0 to 15(bound)
public class Exercise13 {
    public static void main(String[] args) {
        Random random = new Random();
        int number2 = random.nextInt(15);
        System.out.println(number2);
    }
}

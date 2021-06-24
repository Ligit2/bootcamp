package week1.day2;

import java.util.Random;

//Generate and print random integer number between 15 to 30
public class Exercise14 {
    public static void main(String[] args) {
        Random random = new Random();
        int number2 = 15 + random.nextInt(15);
        System.out.println(number2);
    }
}

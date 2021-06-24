package week1.day4;

import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        boolean value = false;
        if((number > -1000 && number < 1000 && (number %3==0 || number %5 ==0)))
        {
            value = true;
        }
        System.out.println(value);
    }
}

package week2.day5;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        for(int i= number1; i<= number2; i++)
        {
            int helper1 = i/100;
            int digit1 = helper1/10;
            int digit2 = helper1%10;
            int helper2 = i%100;
            int digit3 = helper2/10;
            int digit4 = helper2%10;
            if(digit1 == digit4 && digit2 == digit3)
                System.out.println(i);
        }
    }
}

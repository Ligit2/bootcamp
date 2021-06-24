package week2.day2;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        int count = 2;
        for(int i=2; i<=number/2; i++)
        {
            if(number % i==0)
                count++;
        }
        System.out.println(count);
    }
}

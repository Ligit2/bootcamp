package week2.day2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        for(int i=1; i<=number/2; i++)
        {
            if(number % i==0)
                System.out.print(i + " ");
        }
    }
}

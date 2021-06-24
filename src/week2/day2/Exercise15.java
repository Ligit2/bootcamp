package week2.day2;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number<0)
        {
            System.out.println("Please input positive number");
            number = scanner.nextInt();
        }
        System.out.print("*|");
        for(int i=0; i<= number; i++)
            System.out.print(i + " ");
        System.out.println("");
        for(int i=0; i<= number; i++)
            System.out.print("---");
        System.out.println();
        for(int i = 1; i<=number; i++)
        {
            System.out.print(i+"|");
            for(int j =1; j<= number ;j++)
            {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}

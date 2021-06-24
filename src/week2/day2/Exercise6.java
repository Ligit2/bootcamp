package week2.day2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i =2; i<=30000; i++)
        {
            if(number % i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}

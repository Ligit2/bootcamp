package week2.day2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for(int i= a; i<=b; i++)
        {
            if(i%d == c)
            {
                System.out.print(i+ " ");
            }
        }
    }
}

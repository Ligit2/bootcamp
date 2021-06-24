package week2.day2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i = a; i<=b; i++)
        {
            for(int j = 1; j<i; j++)
            {
                if(j*j ==i)
                {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}

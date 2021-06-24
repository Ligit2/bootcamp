package week2.day2;

import java.util.Scanner;

public class Exercsie16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1; i<=num; i++)
        {
            for(int j =1 ; j<=i ; j++)
            {
                System.out.print('*'+ " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=num; i++)
        {
            for(int j =num ; j>=i; j--)
            {
                System.out.print('*'+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=num; i>=1; i--)
        {
            for(int j =1 ; j<=num ; j++)
            {
                if(i+j<=num)
                {
                    System.out.print("  ");
                }
                else
                System.out.print('*'+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=num; i++)
        {
            for(int j =1 ; j<=num-i ; j++)
            {
                System.out.print("  ");
            }
          for(int j = num-i+1; j<=num ; j++)
          {
              System.out.print('*' + " ");
          }
            System.out.println();
        }

    }
}

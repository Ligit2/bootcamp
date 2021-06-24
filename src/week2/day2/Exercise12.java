package week2.day2;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        anun:
        for(int i=1; ; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if(count !=0)
                    count--;
                else break anun;
                System.out.print(i);
            }
        }
    }
}

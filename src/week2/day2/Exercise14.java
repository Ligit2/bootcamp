package week2.day2;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        while(true) {
            if(number < 0)
            {
                System.out.println("Input the positive number");
                number = scanner.nextInt();
                continue;
            }
            else {
                for(int i = 1; i<=number; i++)
                {
                    for(int j =1; j<= number ;j++)
                    {
                        System.out.print('#' + " ");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}

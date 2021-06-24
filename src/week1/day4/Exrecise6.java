package week1.day4;

import java.util.Scanner;

public class Exrecise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        if(number == 0)
        {
            System.out.println("zero ");
        }
        else if(number < 0)
        {
            System.out.println("negative ");
            if(Math.abs(number) < 1)
            {
                System.out.println("small");
            }
            if(Math.abs(number) > 1000000)
            {
                System.out.println("large");
            }
        }
        else
        {
            System.out.println("positive");
            if(number < 1)
            {
                System.out.println("small");
            }
             if(number > 1000000)
            {
                System.out.println(" Large");
            }
        }
    }
}

package week1.day4;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b = scanner.nextInt();
        if(a > 10)
        {
            if(b != 10)
            {
                System.out.println("a anb b legal");
            }
            else
            {
                System.out.println("a legal anb b illegal");
            }
        }
        else
        {
            if(b!=10)
            {
                System.out.println("a illegal and b legal");
            }
            else
            {
                System.out.println("a and b illegal");
            }
        }
        if(a > 0)
        {
            if(b > 0)
            {
                System.out.println("a anb b legal");
            }
            else
            {
                System.out.println("a legal anb b illegal");
            }
        }
        else
        {
            if(b>0)
            {
                System.out.println("a illegal and b legal");
            }
            else
            {
                System.out.println("a and b illegal");
            }
        }
        if(a < 0)
        {
            if(b <0)
            {
                System.out.println("a anb b legal");
            }
            else
            {
                System.out.println("a legal anb b illegal");
            }
        }
        else
        {
            if(b<0)
            {
                System.out.println("a illegal and b legal");
            }
            else
            {
                System.out.println("a and b illegal");
            }
        }
    }
}

package week1.day4;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for permiter or 2 for area");
        int num = scanner.nextInt();
        int radius = 4;
        double pi = Math.PI;
        if(num == 1)
        {
            double perimeter = 2 * pi * radius;
            System.out.println(perimeter);
        }
        else if(num==2)
        {
            double area = pi * Math.pow(radius ,2);
            System.out.println(area);
        }
        else{
            System.out.println("Please input 1 or 2");
        }
    }
}


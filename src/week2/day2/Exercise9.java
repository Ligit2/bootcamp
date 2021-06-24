package week2.day2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number ;
        int sum = 0;
        for(int i =1; i<=10; i++)
        {
            number = scanner.nextInt();
            sum+=number;
        }
        System.out.println(sum);
    }
}

package week2.day2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit = scanner.nextInt();
        int count=0;
        for(int i = number ; i!=0 ; i=i/10)
        {
            if(i%10 == digit)
                count++;
        }
        System.out.println(count);
    }
}

package week2.day2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int newnumber = 0;
        for(int i = number ; i>0; i/=10)
        {
            int mn=i%10;
            newnumber = newnumber * 10 + mn;
        }
        System.out.println(newnumber);
    }
}

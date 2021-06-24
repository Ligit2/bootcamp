package week2.day5;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<=0 || number ==1 || number ==2)
            System.out.println("no");
        else
        {
            boolean check = true;
            for(int i = 2; i<=Math.sqrt((double)number) ; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
                if(!check)
                    System.out.println("no");
                else
                    System.out.println("yes");
            }
    }
}

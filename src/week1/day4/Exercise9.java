package week1.day4;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year= scanner.nextInt();
        if(year < 0){
            System.out.println("enter the correct year");
        }
       if(year % 4 == 0)
       {
            if( year %100 == 0 && year % 400 != 0)
           {
               System.out.println("not Leap year");
           }
           else{
               System.out.println(" Leap year ");
           }
       }
       else
       {
           System.out.println("not Leap year");
       }
    }
}

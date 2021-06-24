package week2.day2;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countzero=0;
        int countnegative = 0;
        int countpositive = 0;
        int n = scanner.nextInt();
        int number ;
        for(int i =1; i<= n; i++)
        {
            number = scanner.nextInt();
            if(number >0)
                countpositive++;
            else if(number ==0)
                countzero++;
            else
                countnegative++;
        }
        System.out.println(countnegative + " "+ countpositive + " " + countzero);
    }
}

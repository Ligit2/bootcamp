package week2.day1;

import java.util.Scanner;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean check;
        int count =0;
        while(true)
        {
            System.out.println("Please enter the value");
            check = false;
            int i = 1;
            number = scanner.nextInt();
            while(i <= number)
            {
                if(number == i)
                {
                    check = true;
                    break;
                }
                i = i*2;
            }
            if(check == true)
            {
                System.out.println(count);
                break;
            }
            else if(check == false)
            {
                count++;
            }
        }
    }
}

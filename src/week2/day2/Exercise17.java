package week2.day2;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int length  = text.length();
        int upletter = 0;
        int letter = 0;
        int digit = 0;
        int symbol = 0;
        if(length <6 || length >16)
        {
            System.out.println("Invalid");
        }
        else
        {
            char c ;
            while(length != 0)
            {
                c = text.charAt(length-1);
                if(c >= '0' && c<= '9')
                    digit++;
                if(c >= 'a' && c<= 'z')
                    letter++;
                if(c>= 'A' && c<= 'Z')
                    upletter++;
                if(c == '$' || c== '#' || c== '@')
                    symbol++;
                length--;
            }
            if(digit >0 && letter>0 && upletter>0 &&symbol>0)
            {
                System.out.println("Valid");
            }
            else
                System.out.println("Invalid");
        }
    }
}

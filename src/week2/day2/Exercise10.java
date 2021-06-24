package week2.day2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.next();
        int length = binary.length();
        int decimal = 0;
        for(int i = length, j=0; i>0; i--,j++)
        {
            char c = binary.charAt(i-1);
            int digit = Character.getNumericValue(c);
            decimal += digit * Math.pow(2,j);
        }
        System.out.println(decimal);
    }
}

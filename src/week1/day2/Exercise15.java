package week1.day2;

import java.util.Scanner;

//Write java program which determines if the given int number is odd,
//print result(use == operator, use boolean primitive type).
public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isOdd = number % 2 == 1;
        System.out.println(isOdd);
    }
}

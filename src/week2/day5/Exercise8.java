package week2.day5;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double q = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        int n = scanner.nextInt();
        while(n>1)
        {
            b1 *= q;
            n--;
        }
        System.out.format("%.2f", b1);// storaketic heto 2 nishi chshtutyamb
    }
}

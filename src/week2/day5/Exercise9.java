package week2.day5;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                boolean check = true;
                for (int j = 2; i <= Math.sqrt((double) i); j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (!check)
                    continue;
                else {
                    while(n%i==0) {
                        System.out.print(i + " ");
                        n = n / i;
                    }
                }
            }
        }
    }
}

package week2.day5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 1;
        while(n!=0)
        {
            answer *=2;
            n--;
        }
        System.out.println(answer);
    }
}

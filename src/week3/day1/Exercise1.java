package week3.day1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(min(a, b, c, d));
    }
    public static int min(int a,int b, int c, int d) {
        int min=a;
        if(b<min) min =b;
        if(c<min) min = c;
        if(d<min) min =d;
        return min;
    }
}



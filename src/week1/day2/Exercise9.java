package week1.day2;

import java.util.Scanner;

//Given arithmetic sequence Sn  = 3n*n - 12n
//print the sum S10
//print the sum S15
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Sum = 3*10*10-12*10;
        System.out.println(Sum);
        Sum = 3*15*15-12*15;
        System.out.println(Sum);
    }
}

package week3.day2;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println(calculateDistance(x, y));
    }
    public static double calculateDistance(int x, int y){
        return Math.sqrt(x*x+y*y);
    }
    public static double calculateDistance(int x, int y, int x1, int y1){
        return Math.sqrt(Math.pow(x1-x,2) + Math.pow(y-y1,2));
    }
}

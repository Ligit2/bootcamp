package week1.day4;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int point1x = scanner.nextInt();
        int point1y = scanner.nextInt();
        int point2x = scanner.nextInt();
        int point2y = scanner.nextInt();
        if(point1x != 0&& point1y !=0 && point2x !=0 && point2y !=0) {
            if (point1x > 0 && point2x > 0) {
                if (point1y > 0 && point2y > 0) {
                    System.out.println("In the same quarter");
                } else if (point1y < 0 && point2y < 0) {
                    System.out.println("In the same quarter");
                } else {
                    System.out.println("Not in the same quarter");
                }
            }
            if (point1x < 0 && point2x < 0) {
                if (point1y > 0 && point2y > 0) {
                    System.out.println("In the same quarter");
                } else if (point1y < 0 && point2y < 0) {
                    System.out.println("In the same quarter");
                } else {
                    System.out.println("Not in the same quarter");
                }
            } else {
                System.out.println("Not in the same quarter");
            }
        }
        else {
            System.out.println("Input non zero coordinates");
        }
    }
}

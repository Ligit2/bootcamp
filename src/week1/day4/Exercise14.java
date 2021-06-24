package week1.day4;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edge1 = scanner.nextInt();
        int edge2 = scanner.nextInt();
        int edge3 = scanner.nextInt();
        if (edge1 > 0 && edge2 > 0 && edge3 > 0) {
            if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("Input positive numbers");
        }
    }
}

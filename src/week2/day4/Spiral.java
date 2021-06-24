package week2.day4;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int up = 0;
        int down = n - 1;
        int left = 0;
        int rigth = n - 1;
        while (up < n) {
            for (int j = left; j <= rigth; j++)
                matrix[up][j] = 1;
            up += 2;
            rigth -= 2;
            if (left >= 1)
                left += 2;
            else
                left += 1;
        }
        left = 0;
        up = 0;
        rigth = n - 1;
        while (up < n - 1) {
            up++;
            for (int i = up; i <= down; i++)
                matrix[i][rigth] = 1;
            rigth -= 1;

            for (int j = rigth; j >= left; j--)
                matrix[down][j] = 1;
            down--;
            for (int i = down; i > up; i--)
                matrix[i][left] = 1;
            left += 2;
            up += 1;
            rigth--;
            down--;
        }
        if (n % 2 == 0) {
            matrix[n / 2][n / 2 - 1] = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

package week2.day4;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int up = 0;
        int down = n - 1;
        int left = 0;
        int rigth = n - 1;
        int k = 1;
        int count = 0;
        while (count < n * n) {
            for (int j = left; j <= rigth; j++) {
                matrix[up][j] = k++;
                count++;
            }
            up++;
            for (int i = up; i <= down; i++) {
                matrix[i][rigth] = k++;
                count++;
            }
            rigth--;
            for (int j = rigth; j >= left; j--) {
                matrix[down][j] = k++;
                count++;
            }
            down--;
            for (int i = down; i >= up; i--) {
                matrix[i][left] = k++;
                count++;
            }
            left++;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

}

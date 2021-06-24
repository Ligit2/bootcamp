package week2.day5;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Push 1 for transporting matrix by 90 degrees," +
                "\nPush 2 for transporting matrix by 180 degrees");
        int choice = scanner.nextInt();
        if (choice == 1) {
            int arr1[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr1[i][j] = arr[n - 1 - j][i];
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
        } else if (choice == 2) {
            int arr1[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr1[i][j] = arr[n - 1 - i][m - 1 - j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("input error");
    }
}
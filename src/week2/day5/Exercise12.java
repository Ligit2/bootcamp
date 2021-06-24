package week2.day5;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m = scanner.nextInt();
        int arr[][] = new int[n][m];
        int count=0;
        for (int i = 0; i < n; i++) {
            if(i%2==0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j]=count++;
                }
            }
            else
            {
                for (int j = m-1; j >=0; j--) {
                    arr[i][j] = count++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

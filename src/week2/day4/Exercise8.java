package week2.day4;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int k=1;
        while(n/2+1>k)
        {
            for(int j = k-1; j<n-k; j++)
            matrix[k-1][j]=k;
            for(int i=n-k; i>=k-1; i--)
            matrix[i][n-k]=k;
            for(int j= n-k-1; j>=k-1; j--)
                matrix[n-k][j]=k;
            for(int i= n-k-1; i>k-1; i--)
                matrix[i][k-1]=k;
            k++;
        }
        if(n%2!=0)
        matrix[n/2][n/2]=k;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

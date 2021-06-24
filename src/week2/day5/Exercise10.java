package week2.day5;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m = scanner.nextInt();
        int arr[][]=new int [n][m];
        int i=0;
        for(int j=0;j<n;i++)
        {
            if(i<m)
            {
                arr[j][i] =j*i;
                continue;
            }
            else
            {
                j++;
                i =-1;
            }
        }
        for(int l=0; l<n; l++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(arr[l][j] + " ");
            }
            System.out.println();
        }
    }
}

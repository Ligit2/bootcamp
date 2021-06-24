package week2.day4;


import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m=scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int index =0;
        int max =0;
        for (int i = 0; i < matrix.length; i++) {
            int sum =0;
            for (int j = 0; j < matrix[i].length; j++) {
               sum += matrix[i][j] ;
            }
            if(sum>max)
            {
                max = sum;
                index =i;
            }
        }
        System.out.println(max + " " + index);
    }
}

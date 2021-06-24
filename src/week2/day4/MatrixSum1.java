package week2.day4;

import java.util.Random;

public class MatrixSum1 {
    public static void main(String[] args) {
        int [][] matrix = new int[10][10];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10+random.nextInt(90);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
               if(j + i>=matrix[i].length-1)
                    sum+=matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}

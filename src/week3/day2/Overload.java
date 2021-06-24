package week3.day2;

import java.util.Scanner;

public class Overload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][]matrix = new int[n][m];
        int []array = new int [n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            array[i] = 7;
        }
        System.out.println(average(matrix));
        System.out.println(average(array));


    }
    public static double average(int [][]array){
        double sum =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum/(array.length * array[0].length);
    }
    public static double average(int []array){
        double sum =0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        return sum/array.length;
    }
}

package week3.day2;

public class Matrix {
    public static void main(String[] args) {

    }
    public static int[] matrixToArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
        return array;
    }
    public static double[] matrixToArray(int matrix[][]){
        double array[] = new double[matrix.length];
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
            array[i] = sum/matrix[i].length;
            sum = 0;
        }
        return array;
    }

}

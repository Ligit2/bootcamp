package week3.day1;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of students");
        int n = scanner.nextInt();
        if (n < 0) System.out.println("input error");
        else if (n==0) System.out.println(0);
        else {
            int array[] = new int[n];
            for (int i = 0; i < n; ) {
                System.out.println("enter the grade of student " + i+1);
                int number = scanner.nextInt();
                if (number > 0 && number <= 100) {
                    array[i] = number;
                    i++;
                } else {
                    System.out.println("Pls input the correct grade");
                }
            }

            System.out.println("The average is " + String.format("%.2f", average(array)));
            System.out.println("The max grade is "+max(array));
            System.out.println("The min garde is " + min(array));
        }
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}

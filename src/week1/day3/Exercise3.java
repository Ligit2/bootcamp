package week1.day3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = fahrenheit / (33.8);
        System.out.println(celsius);
        float cels = (float) celsius;
        System.out.println(cels);
        int celsi = (int) cels;
        System.out.println(celsi);
    }
}

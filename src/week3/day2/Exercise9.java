package week3.day2;

public class Exercise9 {
    public static void main(String[] args) {
        fahrenheitCelsius(1, 32f);
    }

    public static void fahrenheitCelsius(float celsius, int choice) {
        if (choice == 1) {
            int fahrenheit = (int) (celsius * 9 / 5) + 32;
            System.out.println(fahrenheit);
            return;
        } else if (choice == 2) {
            double fahrenheit = (int) (celsius * 9 / 5) + 32;
            System.out.println(fahrenheit);
            return;
        } else {
            System.out.println("Illegal argument");
            return;
        }
    }

    public static void fahrenheitCelsius(int choice, float fahrenheit) {
        if (choice == 1) {
            int celsius = (int) ((fahrenheit - 32) * 5 / 9);
            System.out.println(celsius);
            return;
        } else if (choice == 2) {
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(celsius);
            return;
        } else {
            System.out.println("Illegal argument");
            return;
        }
    }
}

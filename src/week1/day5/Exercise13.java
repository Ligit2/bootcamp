package week1.day5;


import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int num;
        switch (text) {
            case "Monday": {
                num = 1;
                System.out.println(num);
                break;
            }
            case "Tuesday": {
                num = 2;
                System.out.println(num);
                break;
            }
            case "Wednesday": {
                num = 3;
                System.out.println(num);
                break;
            }
            case "Thursday": {
                num = 4;
                System.out.println(num);
                break;
            }
            case "Friday": {
                num = 5;
                System.out.println(num);
                break;
            }
            case "Saturday": {
                num = 6;
                System.out.println(num);
                break;
            }
            case "Sunday": {
                num = 7;
                System.out.println(num);
                break;
            }
            default: {
                System.out.println("Not allowed input");
                break;
            }
        }

    }
}

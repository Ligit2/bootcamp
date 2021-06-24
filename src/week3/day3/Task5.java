package week3.day3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
      reverseString();

    }
    public static void reverseString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.next();
        String reverse = "";
        for (int i = str.length()-1; i >=0; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println("The reverse of the String \n" + reverse);
    }
}

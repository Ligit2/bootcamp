package week3.day3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hex string");
        String text = scanner.next();
        if(checkHexStr(text))
            System.out.println(text + " is a hex string");
        else
            System.out.println(text + " is not a hex string");
    }
    public static boolean checkHexStr(String str){
        for (int i = 0; i < str.length(); i++) {
            if(!((str.charAt(i)>='a' && str.charAt(i)<='f') || (str.charAt(i)>='A' && str.charAt(i)<='F')|| (str.charAt(i)>='0' && str.charAt(i)<='9')))
                return false;
        }
        return true;
    }
}

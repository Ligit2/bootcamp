package week3.day3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input binary string");
        String text = scanner.next();
        if(checkBinStr(text))
            System.out.println(text + " is a binary string");
        else
            System.out.println(text + " is not a binary string");
    }
    public static boolean checkBinStr(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='0' && str.charAt(i)!='1')
                return false;
        }
        return true;
    }
}

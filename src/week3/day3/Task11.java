package week3.day3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input binary string");
        String text = scanner.next();
        if(Task9.checkBinStr(text))
            System.out.println(bin2Dec(text));
        else
            System.out.println(text + " invalid binary string");
    }
    public static int bin2Dec(String str){
        int number=0;
        for (int i = 0; i < str.length();) {
            if(str.charAt(str.length()-1-i)=='1') {
                number += Math.pow(2, i);
                i++;
            }
            else i++;
        }
        return number;
    }
}

package week2.day3;

import java.util.Scanner;

public class ExerciseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
      String text1 = Palindromright(text);
      String text2 = Palindromleft(text);
      int length1 = text1.length();
      int length2 = text2.length();
        System.out.println(text1);
        System.out.println(text2);
        if(length1 <= length2)
          System.out.println(text1);
      else
          System.out.println(text2);
    }
    public static String Palindromright(String text)
    {
        int length = text.length();
        int index=length-1;
        for(int i = 0; i<length-2; i++) {
            String help = text.substring(0,i+2);
            if(Reverse(help)) {
                index = i+2;
                break;
            }
        }
        String helper = text.substring(index, length);
        StringBuilder stringBuilder = new StringBuilder(helper);
        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder.reverse());
        text =stringBuilder1 +text;
        return text;
    }
    public static String Palindromleft(String text)
    {
        int length = text.length();
        int index=length-1;
        for(int i = length-1; i>0; i--) {
            String help = text.substring(i-1);
            if(Reverse(help)) {
                index = i-1;
                break;
            }
        }
        String helper = text.substring(0, index);
        StringBuilder stringBuilder = new StringBuilder(helper);
        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder.reverse());
        text +=stringBuilder1;
       return text;
    }



    public static boolean Reverse(String text) {
        StringBuilder text1 = new StringBuilder(text);
        StringBuilder stringBuilder = new StringBuilder(text1.reverse());
        if( text1.toString().equals(text.toString()))
            return true;
        else return false;
    }
}

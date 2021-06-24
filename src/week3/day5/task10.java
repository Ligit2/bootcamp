package week3.day5;

import java.io.IOException;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /* function call for insertion sort with stringBuilder
        char ch =(char) System.in.read();
        String text = scanner.next();
        text = insertionSort(text);
        System.out.println( text);
        System.out.println();
        System.out.println(searchBinary(text, ch));
        */
        // function call for selection sort by converting String to char[]
        String text= scanner.next();
        char array[] = text.toCharArray();
        selectionSort(array);
        String s = new String(array);
        System.out.println(s);

    }
    public static int searchBinary(String array,char ch){
        int left = 0;
        int right = array.length()-1;
        int middle = left + (right-left)/2;
        while(left<=right){
            if(array.charAt(middle)==ch){
                return middle;
            }
            else if(array.charAt(middle) < ch){
                left = middle+1;
            }
            else{
                right = middle-1;
            }
            middle = left+(right-left)/2;
        }
        return -1;
    }
    public static String insertionSort(String array){
        StringBuilder string = new StringBuilder(array);
        for (int i = 1; i < string.length(); i++) {
            char key = string.charAt(i);
            int j = i-1;
            while(j>=0 && string.charAt(j)>key){
                char temp = string.charAt(j);
                string.replace(j,j+1,string.substring(j+1,j+2));
                string.replace(j+1,j+2,temp+"");
                j--;
            }
        }
        return string.toString();
    }
    public static void selectionSort(char array[]){
        for (int i = 0; i < array.length-1; i++) {
            int indexOfMin=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[indexOfMin])
                    indexOfMin = j;
            }
            char temp = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = temp;
        }
    }
}

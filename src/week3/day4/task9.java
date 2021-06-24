package week3.day4;

public class task9 {
    public static void main(String[] args) {
        System.out.println(endOfString("xabcd"));
    }
    public static String endOfString(String str){
        if(str.length()<1) return "";
        if(str.charAt(0)=='x'){
            return "" + endOfString(str.substring(1))+str.charAt(0);
        }
        else
           return "" + str.charAt(0)+ endOfString(str.substring(1));
    }
}

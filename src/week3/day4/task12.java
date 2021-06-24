package week3.day4;

public class task12 {
    public static void main(String[] args) {
        System.out.println(maxDigit("56"));
    }
    public static char maxDigit(String str){
        //if(str.length()<1) return ' ';
        if(str.length()==1) return str.charAt(0);
        return str.charAt(0)>maxDigit(str.substring(1))?str.charAt(0):maxDigit(str.substring(1));
    }
}

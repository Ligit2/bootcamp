package week3.day4;

public class task7 {
    public static void main(String[] args) {
        System.out.println(newString("xxx",3));
    }
    static String text = "";
    public static String newString(String str,int length){
        if(length-1==0) return "" + str.charAt(0);
        newString(str, length-1);
        if(str.charAt(length-1)!='x')
           text+= str.charAt(length-1);
        return text;
    }
}

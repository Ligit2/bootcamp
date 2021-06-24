package week3.day4;

public class task7sub {
    public static void main(String[] args) {
        String str = "vbnmxvvx";
        System.out.println(subString(str));
    }
    public static String subString(String str){
        if(str.length()-1<0) return "";
        if(str.charAt(0)!='x') return str.charAt(0)+subString(str.substring(1));
        else
            return "" + subString(str.substring(1));
    }
}

package week3.day4;

public class task16new {
    public static void main(String[] args) {
        String text = "a(b((dfgh";
        System.out.println(text + starString(text));
    }
    public static String starString(String str){
        if(str.length()<1) return "";
        if(str.length()==1)
            return "" + str.charAt(0) + str.charAt(0);
        if(str.charAt(str.length()-1)=='(') {
            return "" + ')' + starString(str.substring(0, str.length() - 1));
        }
        else return "" + str.charAt(str.length() - 1) + starString(str.substring(0, str.length() - 1));
    }
}

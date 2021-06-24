package week3.day4;

public class task16 {
    public static void main(String[] args) {
        String text = "a(b((dfg(h((";
        System.out.println( starString(text));
    }
    public static String starString(String str){
        if(str.length()<1) return "";
        if(str.charAt(0)=='(') {
            return "" + str.charAt(0)  + starString(str.substring(1, str.length()))+')';
        }
        else return "" + str.charAt(0)+ starString(str.substring(1, str.length())) +str.charAt(0);
    }
}

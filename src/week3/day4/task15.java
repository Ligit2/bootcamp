package week3.day4;

public class task15 {
    public static void main(String[] args) {
        System.out.println(starString("asdjkfjghkf"));

    }
    public static String starString(String str){
        if(str.length()<1) return "";
        if(str.length()==1)
            return "" +'('+str.charAt(0)+')';
        if(str.length()==2)
            return ""+'('+str.charAt(0)+str.charAt(1)+')';
        else
        {
            return ""+'('+str.charAt(0)+starString(str.substring(1,str.length()-1))+str.charAt(str.length()-1)+')' ;
        }
    }
}

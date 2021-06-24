package week3.day4;

public class task14 {
    public static void main(String[] args) {
        System.out.println(starString("asdfgh"));
    }
    public static String starString(String str){
        if(str.length()<1) return "";
        if(str.length()==1)
            return "" + str.charAt(0);
        else return ""+str.charAt(0)+'*'+starString(str.substring(1));
    }
}

package week3.day1;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(palindromes(67676));
    }
    public static boolean palindromes(int n){
        String text = String.valueOf(n);
        for (int i = 0; i <=(text.length()-1)/2; i++) {
            if(text.charAt(i)!=text.charAt(text.length()-1-i))
                return false;
        }
        return true;
    }

}

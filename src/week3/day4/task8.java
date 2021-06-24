package week3.day4;

public class task8 {
    public static void main(String[] args) {
        String str = "abcdaq";
        System.out.println(reverse(str, str.length()));
    }

    public static String reverse(String str, int length) {
        if (length <= 0) return "";
        return "" + str.charAt(length - 1) + reverse(str, length - 1);
    }
}

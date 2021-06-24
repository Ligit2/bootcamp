package week3.day4;

public class task10 {
    public static void main(String[] args) {
        String str = "abbccdd";
        System.out.println(cleanedString(str));
    }

    public static String cleanedString(String str) {
        if (str.length() < 1) return "";
        if (str.length() == 1) return "" + str.charAt(0);
        if (str.charAt(0) == str.charAt(1)) {
            return "" + cleanedString(str.substring(1));
        } else {
            return "" + str.charAt(0) + cleanedString(str.substring(1));
        }
    }
}

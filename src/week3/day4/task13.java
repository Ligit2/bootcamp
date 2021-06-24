package week3.day4;

public class task13 {
    public static void main(String[] args) {
        System.out.println(maxDigit("agc4536"));
    }

    public static int maxDigit(String str) {
        int count = 0;
        if (str.length() < 1) return 0;
        if (str.charAt(0) <= '9' && str.charAt(0) >= '0') {
            count = 1;
        }
        return count + maxDigit(str.substring(1));
    }
}

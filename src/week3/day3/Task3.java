package week3.day3;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(checkCharacter("cat", 'm'));
    }

    public static boolean checkCharacter(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i))
                return true;
        }
        return false;
    }
}

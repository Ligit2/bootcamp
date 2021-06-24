package week3.day3;

public class Task4 {
    public static void main(String[] args) {

        System.out.println(count("CodeAcademy"));
        System.out.println(count("Codeacademy", 4));
    }

    public static int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'A':
                case 'o':
                case 'O':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'u':
                case 'U': {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int count(String str, int k) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                count++;
            }
        }
        return (count - count(str)) >= 0 ? count - count(str) : 0;
    }

}

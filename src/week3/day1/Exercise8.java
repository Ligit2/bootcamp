package week3.day1;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(isVowel('n'));
    }
    public static boolean isVowel(char ch){
        switch(ch)
        {
            case 'a':
            case 'A':
            case 'o':
            case 'O':
            case 'e':
            case 'E':
            case 'u':
            case 'U':
            case 'i':
            case 'I':
                return true;
            default:
                return false;
        }
    }
}

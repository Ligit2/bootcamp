package week1.day5;


import java.io.IOException;

public class Exercise9 {
    public static void main(String[] args) throws IOException {
        char symbol = (char) System.in.read();
        switch (symbol) {
            case 'a':
            case 'A':
            case 'o':
            case 'O':
            case 'i':
            case 'I':
            case 'e':
            case 'E':
            case 'u':
            case 'U': {
                System.out.println(symbol + " is Vowel");
                break;
            }
            default: {
                System.out.println(symbol + " is a Consonant");
                break;
            }
        }
    }
}

package week1.day5;

import java.io.IOException;

public class Exercise8 {
    public static void main(String[] args) throws IOException {
        System.out.println("What is the correct way to declare a variable to store an integer value in Java\n" +
                " a.int 1x = 10\n" +
                " b.int x = 10\n" +
                " c.float x = 10.0f\n" +
                " d.string x = \"10\"\n" +
                "enter your choice ");
        char answer = (char) System.in.read();
        switch(answer)
        {
            case 'a':
            case 'c':
            case 'd':{
                System.out.println("Invalide choice");
                break;
            }
            case 'b': {
                System.out.println("Congratulation");
                break;
            }
            default : {
                System.out.println("please enter a b c or d");
            }
        }
    }
}

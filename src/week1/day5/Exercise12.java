package week1.day5;

import java.io.IOException;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /) ");
        char symbol = (char) System.in.read();
        switch(symbol)
        {
            case '+':
            {
                double sum = number1 + number2;
                System.out.println(number1 + "+" +number2 +" =" + sum);
                break;
            }
            case '-':
            {
                double sub = number1 - number2;
                System.out.println(number1 + "-" +number2 +" =" + sub);
                break;
            }
            case '*':
            {
                double mult = number1 * number2;
                System.out.println(number1 + "*" +number2 +" =" + mult);
                break;
            }
            case '/':
            {
                double div = number1 / number2;
                System.out.println(number1 + "/" +number2 +" =" + div);
                break;
            }
            default:
            {
                System.out.println("Not allowed input");
                break;
            }
        }
    }
}

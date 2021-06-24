package week1.day5;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quiz score: ");
        double qscore = scanner.nextDouble();
        System.out.println("Mid-term score: ");
        double mscore = scanner.nextDouble();
        System.out.println("Final score");
        double fscore = scanner.nextDouble();
        double average = (qscore + mscore + fscore)/3;
        switch((int )(average + 20)/20)
        {
            case 6:
            case 5:{
                System.out.println("Your grade is A");
                break;
            }
            case 4:
            {
                System.out.println("The grade is B");
                break;
            }
            case 3:
            {
                System.out.println("The grade is C");
                break;
            }
            case 2:
            case 1:
            {
                System.out.println("The grade is F");
                break;
            }
            default:
            {
                System.out.println("enter positive numbers");
                break;
            }
        }
    }
}

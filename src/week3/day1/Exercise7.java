package week3.day1;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        int number = 1;
        for(int i=1; i<=n; i++)
        {
            number *=i;
        }
        return number;
    }
}

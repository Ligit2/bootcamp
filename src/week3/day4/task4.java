package week3.day4;

public class task4 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1006));
    }
    public static int sumOfDigits(int number){
        if(number==0) return 0;
        return number%10 + sumOfDigits(number/10);
    }
}

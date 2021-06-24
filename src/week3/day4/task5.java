package week3.day4;

public class task5 {
    public static void main(String[] args) {
        System.out.println(countOfDigits(677777));
    }
    public static int countOfDigits(int n){
        if(n>=0 && n<=9) {
            if (n == 7) return 1;
            else return 0;
        }
        return countOfDigits(n%10) + countOfDigits(n/10);
    }
}

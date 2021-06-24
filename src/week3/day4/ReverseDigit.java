package week3.day4;

public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println(reverse(34500));
    }
    public static int reverse(int number){
        if(number>=0 && number <=9) return number;
        int help=number;
        int count = 0;
        while(help!=0){
            count++;
            help/=10;
        }
        return number%10 *(int)Math.pow(10,count-1) + reverse(number/10);
    }
}

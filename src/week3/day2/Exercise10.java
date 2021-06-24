package week3.day2;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(reminder(891,3));
    }
    public static int reminder(int number){
        int sum = 0;
        while(number!=0)
        {
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
    public static int reminder(int number, int a){
        return reminder(number)%a;
    }
}

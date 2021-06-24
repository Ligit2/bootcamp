package week3.day1;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(hasEight(99765));
        System.out.println(hasEight(678));
    }
    public static boolean hasEight(int n){
        while(n!=0)
        {
            int digit = n%10;
            if(digit==8) return true;
            n/=10;
        }
        return false;
    }
}

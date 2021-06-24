package week3.day1;

public class Exercise5 {
    public static void main(String[] args) {

        System.out.println(isPrime(23));
    }
    public static boolean isPrime(int n){
        if(n==1 || n==2) return false;
        int count = 2;
        for(int i = 2 ;i <= Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}

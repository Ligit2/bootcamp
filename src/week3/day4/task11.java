package week3.day4;

public class task11 {
    public static void main(String[] args) {
        System.out.println(isPrimeRec(11));
    }
    static int k=2;
    public static boolean isPrimeRec(int number){
        if(number <=1) return false;
        if(k==number)
            return true;
        else if(number%k==0) return false;
        else{
            k++;
            return isPrimeRec(number);
        }
    }
}

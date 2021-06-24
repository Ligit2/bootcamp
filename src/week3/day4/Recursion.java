package week3.day4;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(sum(10));
    }
    public static int sum(int n){
        if(n==1) return 1;
        else {
            return n+ sum(n - 1);
        }
    }
}

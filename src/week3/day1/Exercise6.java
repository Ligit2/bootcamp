package week3.day1;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    public static int fib(int n){
        int x =1;
        int y=1;
        int index =0;
        while(index!=n)
        {
            int z;
            z=x+y;
            x=y;
            y=z;
            index++;
        }
        return x;
    }
}

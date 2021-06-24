package week3.day2;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(max(3, 6, 9));
    }
    public static int max(int a, int b){
        return a>b ?a:b;
    }
    public static int max(int a, int b, int c){
        return max(a,b) > c? max(a,b) :c;
    }
    public static int max(int a, int b, int c, int d){
        return max(a,b,c) > d ? max(a,b,c) : d;
    }
}

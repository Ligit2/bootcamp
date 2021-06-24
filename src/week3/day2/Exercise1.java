package week3.day2;

public class Exercise1 {
    public static void main(String[] args) {
        add(1,2.0);
    }
    public static void add(int x, int y){
        int sum = x+y;
        System.out.println("the first method is called " + sum);
    }
    public static void add(int x){
        System.out.println("the second method is called " + x);
    }
    public static void add(int x, double z){
        double sum = x+z;
        System.out.println("the third method is called " + sum);
    }
}

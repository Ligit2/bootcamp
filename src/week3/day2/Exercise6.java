package week3.day2;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(square(6f));
    }
    public static double square(int radius){
        return Math.PI * radius * radius;
    }
    public static double square(float edge){
        return edge*edge;
    }
    public static double square(double x, double y){
        return x*y;
    }
}

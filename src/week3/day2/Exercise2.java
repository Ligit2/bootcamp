package week3.day2;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(average(2f, 7));
    }
    public static float average(float x, int y){
        System.out.println("first");
        return (x+y)/2;
    }
    public static float average(int x, float y){
        float sum = x+y;
        System.out.println("second");
        return sum/2;
    }
}

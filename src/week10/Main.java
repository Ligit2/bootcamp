package week10;

public class Main {
    public static void main(String[] args) {
        int sum =0;
        long start = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            sum+=i;
        }
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}

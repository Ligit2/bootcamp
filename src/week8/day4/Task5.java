package week8.day4;

import java.util.stream.IntStream;

public class Task5 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(3, 4, 7, 9, 8, 0, 9);
        System.out.println(intStream.sum());
    }
}

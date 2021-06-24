package week8.day4;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Task2 {
    public static void main(String[] args) {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        Stream<String> stringStream = collection.stream().filter((each) -> each.length() <= 4);
        stringStream.forEach((each)-> System.out.println(each));
    }
}

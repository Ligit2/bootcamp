package week8.day4;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Task1 {
    public static void main(String[] args) {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        Stream<String> stream = collection.stream();
        Stream<String> stream1 = expected.stream();
        stream.forEach((eache)-> System.out.println(eache.toUpperCase()));
        stream1.forEach((eache)-> System.out.println(eache.toLowerCase()));
    }
}

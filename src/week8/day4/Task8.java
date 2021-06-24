package week8.day4;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task8 {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Norwegian");
        Person eva = new Person("Eva", 42, "Serbian");
        List<Person> people = asList(sara, viktor, eva);
        Map<String, Set<String>> collect = people.stream()
                .collect(Collectors
                        .groupingBy((person -> person.getNationality()), Collectors
                                .mapping(person -> person.getName(), Collectors.toSet())));
        System.out.println(collect);

    }
}

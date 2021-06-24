package week8.day4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task9 {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Norwegian");
        Person eva = new Person("Eva", 42, "Serbian");
        List<Person> people = asList(sara, viktor, eva);
        Optional<String> reduce = people.stream().
                map(person -> person.getName()).
                reduce((x, y) -> x + " , " + y);
        System.out.println(reduce.stream().collect(Collectors.toList()));
    }
}

package week8.day4;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class Task4 {
    public static void main(String[] args) {
        List<Person> persons = asList(new Person("Anna",13), new Person("Lilit",20), new Person("Ani",17));
        Optional<Person> max = persons.stream().max(new AgeComparator());
        max.ifPresent((each)-> System.out.println(each));
    }
}

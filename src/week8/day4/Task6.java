package week8.day4;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Task6 {
    public static void main(String[] args) {
        Person sara = new Person("Sara",4);
        Person viktor = new Person("Viktor",40);
        Person eva = new Person("Eva",42);
        Person anna = new Person("Anna",5);
        List<Person> people = asList(sara, viktor, eva, anna);
        List<String> collected = new ArrayList<>();
        people.stream().filter((person) -> person.getAge() <= 18).forEach((each)->collected.add(each.getName()));
        System.out.println(collected);


    }
}

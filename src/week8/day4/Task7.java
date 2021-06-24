package week8.day4;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Task7 {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> people = asList(sara, viktor, eva);
        List<String> kids = new ArrayList<>();
        List<String> adults = new ArrayList<>();
        people.stream().filter((person) -> person.getAge() < 18).forEach((each) -> kids.add(each.getName()));
        people.stream().filter((person) -> person.getAge() >= 18).forEach((each) -> adults.add(each.getName()));
        System.out.println(kids);
        System.out.println(adults);
    }
}

package week8.day4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Task3 {
    public static void main(String[] args) {
        List<List<String>> lists = asList(asList("Viktor","Faktik"), asList("John","Doe","Third"));
        Stream<List<String>> stream = lists.stream();
        List<String> collect = stream.flatMap((each) -> each.stream()).collect(Collectors.toList());
        System.out.println(collect);
    }
}

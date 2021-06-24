package week8.day4.Task10;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task15 {
    public static void main(String[] args) {
        Product pan = new Product("cello", "pan", 120.0);
        Product pencil = new Product("2B", "pan", 70.0);
        Product book1 = new Product("Adventures", "book", 2800.0);
        Product baby1 = new Product("Lego", "baby", 800.0);
        Product baby2 = new Product("Balloons", "baby", 560.0);
        Product book2 = new Product("Romeo and Juliette", "book", 5600.0);
        List<Product> products1 = asList(pan, pencil, book1, book2);
        List<Product> products2 = asList(pan, pencil, book1, baby1, baby2);
        List<Order> orders = asList(new Order(LocalDate.of(2021, 4, 15),
                        LocalDate.of(2021, 4, 7), products1),
                new Order(LocalDate.of(2021, 4, 15),
                        LocalDate.of(2001, 5, 7), products2));
        List<Order> collect = orders.stream().filter(order -> order.getLocalDate()
                .equals(LocalDate.of(2021, 4, 15)))
                .collect(Collectors.toList());
        List<Product> collect1 = collect.stream().flatMap(product -> product.getProducts().stream())
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }
}

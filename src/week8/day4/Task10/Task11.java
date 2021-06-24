package week8.day4.Task10;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task11 {
    public static void main(String[] args) {
        Product pan = new Product("cello", "pan", 120.0);
        Product pencil = new Product("2B", "pan", 70.0);
        Product book1 = new Product("Adventures", "book", 2800.0);
        Product baby1 = new Product("Lego", "baby", 800.0);
        Product baby2 = new Product("Balloons", "baby", 560.0);
        Product book2 = new Product("Romeo and Juliette", "book", 5600.0);
        List<Product> products1 = asList(pan, pencil, book1, book2);
        List<Product> products2 = asList(pan, pencil, book1, baby1, baby2);
        Order order1 = new Order();
        Order order2 = new Order();
        order1.setProducts(products1);
        order2.setProducts(products2);
        List<Order> orders = asList(order1, order2);
        List<Order> collect = orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(list -> list.getCategory().equals("baby")))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

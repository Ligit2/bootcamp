package week8.day4.Task10;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task12 {
    public static void main(String[] args) {
        Product pan = new Product("cello", "pan", 120.0);
        Product pencil = new Product("2B", "pan", 70.0);
        Product book1 = new Product("Adventures", "book", 2800.0);
        Product baby1 = new Product("Lego", "baby", 800.0);
        List<Product> products = asList(pan, pencil, book1, baby1);
        Set<Product> toy = products.stream().filter(each -> each.getCategory().equals("Toy"))
                .map((product) -> product.setAndGetPrice(product.getPrice() * 0.9))
                .collect(Collectors.toSet());
        System.out.println(toy);

    }
}

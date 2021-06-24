package week8.day4.Task10;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task10 {
    public static void main(String[] args) {
        Product pan = new Product("cello", "pan", 120.0);
        Product pencil = new Product("2B", "pan", 70.0);
        Product book1 = new Product("Adventures", "book", 2800.0);
        Product book2 = new Product("Romeo and Juliette", "book", 5600.0);
        List<Product> products = asList(pan, pencil, book1, book2);
        Set<Product> books = products.stream()
                .filter(product -> product.getPrice() > 100 && product.getCategory().equals("book"))
                .collect(Collectors.toSet());
        System.out.println(books);


    }
}

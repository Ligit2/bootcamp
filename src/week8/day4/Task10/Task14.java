package week8.day4.Task10;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task14 {
    public static void main(String[] args) {
        Product pan = new Product("cello", "pan", 120.0);
        Product pencil = new Product("2B", "pan", 70.0);
        Product book1 = new Product("Adventures", "book", 2800.0);
        Product baby1 = new Product("Lego", "baby", 560.0);
        Product baby2 = new Product("Balloons", "baby", 560.0);
        Product book2 = new Product("Romeo and Juliette", "book", 5600.0);
        List<Product> products = asList(pan, pencil, baby1, baby2, book1, book2);
        Product baby = products.stream()
                .filter(product -> product.getCategory().equals("baby"))
                .min(new MinComparator()).orElse(null);
        List<Product> babies = products.stream().filter(product -> product.getCategory().equals("baby") && baby
                .getPrice().equals(product.getPrice())).collect(Collectors.toList());
        System.out.println(babies);
    }
}

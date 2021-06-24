package week8.day4.Task10;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task16_17_18 {
    public static void main(String[] args) {
        Product pan = new Product("cello", "pan", 120.0);
        Product pencil = new Product("2B", "pan", 70.0);
        Product book1 = new Product("Adventures", "book", 2800.0);
        Product baby1 = new Product("Lego", "baby", 800.0);
        Product baby2 = new Product("Balloons", "baby", 560.0);
        Product book2 = new Product("Romeo and Juliette", "book", 5600.0);
        List<Product> products = asList(pan, pencil, baby1, baby2, book1, book2);
        List<Product> products1 = asList(pan);
        List<Product> products2 = asList(pan);
        List<Order> orders = asList(new Order(LocalDate.of(2021, 4, 15),
                        LocalDate.of(2021, 4, 7), products1,new Customer(1l,"ki",2)),
                new Order(LocalDate.of(2021, 4, 15),
                        LocalDate.of(2001, 5, 7), products2, new Customer(3l,"bi",3)));
        //task16(orders);
        task17(orders);
        //task18(products);

    }
    private static void task18(List<Product> listOfProduct){
        Map<String, List<String>> collect = listOfProduct.stream()
                .collect(Collectors.groupingBy(product -> product.getCategory(),
                        Collectors.mapping(product -> product.getName(), Collectors.toList())));
        collect.forEach((key,value)-> System.out.println(key+" "+ value));
    }

    private static void task16(List<Order> orders) {
        Double collect = orders.stream().filter(order -> order.getLocalDate()
                .equals(LocalDate.of(2021, 4, 15)))
                .collect(Collectors.averagingDouble(order -> (Double) order.getProducts()
                        .stream().mapToDouble(each -> each.getPrice()).sum()));
        System.out.println(collect);
    }

    public static void task17(List<Order> ordersList){
        Map<Customer, List<Order>> collect = ordersList.stream().collect(Collectors.groupingBy(each -> each.getCustomer()));
        collect.forEach((key,value)-> System.out.println(key+" "+ value));
    }
}

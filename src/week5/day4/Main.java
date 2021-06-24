package week5.day4;

import week5.CoffeeMachine.CommandConverter;
import week5.day4.product.Product;
import week5.day4.utils.Command;
import week5.day4.utils.CommandManager;
import week5.test.urishQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Command command = new Command();
        String str = scanner.next();
        VendingMachine vendingMachine = new VendingMachine();
        Product product[] = vendingMachine.getProduct(CommandManager.convert(str));
        command=CommandManager.convert(str);
        System.out.println(command.getChipsTypes());
        System.out.println(product.length);
    }
}

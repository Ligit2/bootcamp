package week5.day4;

import week5.day4.product.Product;
import week5.day4.product.chips.*;
import week5.day4.product.chocolate.Bounty;
import week5.day4.product.chocolate.KtKat;
import week5.day4.product.chocolate.Snickers;
import week5.day4.product.chocolate.Twix;
import week5.day4.product.drinks.CocaCola;
import week5.day4.product.drinks.Fanta;
import week5.day4.product.drinks.Pepsi;
import week5.day4.product.drinks.Sprite;
import week5.day4.product.sandwich.*;
import week5.day4.utils.Command;

public class VendingMachine {
    public Queue queues[];

    VendingMachine() {
        makeQueues();
        fillQueues();
    }

    public Product[] getProduct(Command command) {
        Product products[] = null;
        if (command.getCount() <= 9) {
            products = new Product[command.getCount()];
            if (command.getDrinkTypes() != null)
                products = getDrink(command, products);
            else if (command.getChipsTypes() != null)
                products = getChips(command, products);
            else if (command.getChocolateTypes() != null)
                products = getChocolate(command, products);
            else
                products = getSandwich(command, products);
        }
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }
        return products;
    }

    private void fillQueues() {
        queues[0].pushAll(new CocaCola());
        queues[1].pushAll(new Fanta());
        queues[2].pushAll(new Pepsi());
        queues[3].pushAll(new Sprite());
        queues[4].pushAll(new Lays());
        queues[5].pushAll(new Doritos());
        queues[6].pushAll(new Pringles());
        queues[7].pushAll(new Wavy());
        queues[8].pushAll(new Snickers());
        queues[9].pushAll(new KtKat());
        queues[10].pushAll(new Twix());
        queues[11].pushAll(new Bounty());
        queues[12].pushAll(new Ham());
        queues[13].pushAll(new Chicken());
        queues[14].pushAll(new Fish());
        queues[15].pushAll(new Egg());
    }

    private void makeQueues() {
        queues = new Queue[16];
        for (int i = 0; i <16; i++) {
            queues[i]=new Queue();
        }
    }

    private Product[] pollProduct(int index, int count) {
        Product products[] = new Product[count];
        if (count <= 9) {
            products = queues[index].popAll(count);
            return products;
        }
        return products;
    }

    private void fillQueue(Product product, int index) {
        if (queues[index].getCount() == 1) {

            queues[index].pushAll(product);
        }
    }

    private Product[] getDrink(Command command, Product products[]) {
        switch (command.getDrinkTypes()) {
            case COCACOLA: {
                if (queues[0].getCount() == 1) {
                    for (int i = 0; i < 9; i++) {
                        queues[0].push(new CocaCola());
                    }
                }
                products = pollProduct(0, command.getCount());
                break;
            }
            case FANTA: {
                fillQueue(new Fanta(), 1);
                products = pollProduct(1, command.getCount());
                break;
            }
            case PEPSI: {
                fillQueue(new Pepsi(), 2);
                products = pollProduct(2, command.getCount());
                break;
            }
            default: {
                fillQueue(new Sprite(), 3);
                products = pollProduct(3, command.getCount());
            }
        }
        return products;
}

    private Product[] getChips(Command command, Product products[]) {
            switch (command.getChipsTypes()) {
                case DORITOS: {
                    fillQueue(new Doritos(), 5);
                    products = pollProduct(5, command.getCount());
                    break;
                }
                case LAYS: {
                    fillQueue(new Lays(), 4);
                    products = pollProduct(4, command.getCount());
                    break;
                }
                case PRINGLES: {
                    fillQueue(new Pringles(), 6);
                    products = pollProduct(6, command.getCount());
                    break;
                }
                default: {
                    fillQueue(new Wavy(), 7);
                    products = pollProduct(7, command.getCount());
                    break;
                }
            }
        return products;
    }

    private Product[] getChocolate(Command command, Product products[]) {
            switch (command.getChocolateTypes()) {
                case SNICKERS: {
                    fillQueue(new Snickers(), 8);
                    products = pollProduct(8, command.getCount());
                    break;
                }
                case BOUNTY: {
                    fillQueue(new Bounty(), 11);
                    products = pollProduct(11, command.getCount());
                    break;
                }
                case KITKAT: {
                    fillQueue(new KtKat(), 9);
                    products = pollProduct(9, command.getCount());
                    break;
                }
                default: {
                    fillQueue(new Twix(), 10);
                    products = pollProduct(10, command.getCount());
                    break;
                }
            }
        return products;
    }

    private Product[] getSandwich(Command command, Product products[]) {
            switch (command.getSandwichTypes()) {
                case HAM: {
                    fillQueue(new Ham(), 12);
                    products = pollProduct(12, command.getCount());
                    break;
                }
                case FISH: {
                    fillQueue(new Fish(), 14);
                    products = pollProduct(14, command.getCount());
                    break;
                }
                case EGG: {
                    fillQueue(new Egg(), 15);
                    products = pollProduct(15, command.getCount());
                    break;
                }
                default: {
                    fillQueue(new Chicken(), 13);
                    products = pollProduct(13, command.getCount());
                    break;
                }
            }
        return products;
    }
}

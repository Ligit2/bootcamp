package week8.vendingmachine;

import week5.day4.product.chips.Doritos;
import week5.day4.product.chips.Lays;
import week5.day4.product.chips.Pringles;
import week8.vendingmachine.chips.Fritos;
import week8.vendingmachine.chocolate.Bounty;
import week8.vendingmachine.chocolate.KitKat;
import week8.vendingmachine.chocolate.Mars;
import week8.vendingmachine.chocolate.Snickers;
import week8.vendingmachine.drinks.CocaCola;
import week8.vendingmachine.drinks.Fanta;
import week8.vendingmachine.drinks.Pepsi;
import week8.vendingmachine.drinks.Sprite;
import week8.vendingmachine.utils.Command;
import week8.vendingmachine.utils.Product;

import java.io.Serializable;
import java.util.*;

public class VendingMachine implements Serializable {
    private HashMap<String, Queue<Product>[]> machine;
    public VendingMachine(){
        fillVendingMachine();
    }

    public  void fillVendingMachine() {
        machine = new HashMap<>();
        ArrayDeque<CocaCola> cocaCola = new ArrayDeque<>();
        ArrayDeque<Fanta> fanta = new ArrayDeque<>();
        ArrayDeque<Sprite> sprite = new ArrayDeque<>();
        ArrayDeque<Pepsi> pepsi = new ArrayDeque<>();
        ArrayDeque<KitKat> kitkat  = new ArrayDeque<>();
        ArrayDeque<Snickers> snickers = new ArrayDeque<>();
        ArrayDeque<Mars> mars = new ArrayDeque<>();
        ArrayDeque<Bounty> bounty = new ArrayDeque<>();
        ArrayDeque<Lays> lays = new ArrayDeque<>();
        ArrayDeque<Doritos> doritos = new ArrayDeque<>();
        ArrayDeque<Pringles> pringles = new ArrayDeque<>();
        ArrayDeque<Fritos> fritos = new ArrayDeque<>();
        Queue<Product>[] drinks = new Queue[]{cocaCola, fanta, sprite, pepsi};
        Queue<Product>[] chips = new Queue[]{lays,doritos,pringles,fritos};
        Queue<Product> [] chocolate = new Queue[]{mars,snickers,bounty,kitkat};
        for (int i = 0; i < 20; i++) {
            cocaCola.add(new CocaCola());
            fanta.add(new Fanta());
            sprite.add(new Sprite());
            pepsi.add(new Pepsi());
            kitkat.add(new KitKat());
            mars.add(new Mars());
            snickers.add(new Snickers());
            bounty.add(new Bounty());
            lays.add(new Lays());
            doritos.add(new Doritos());
            pringles.add(new Pringles());
            fritos.add(new Fritos());
        }
        machine.put("A", drinks);
        machine.put("B",chips);
        machine.put("C",chocolate);
    }
    public List<Product> getProduct(Command command){
        List<Product> products = new LinkedList<>();
        for (int i = 0; i < command.getCount(); i++) {
            check();
            products.add(machine.get(command.getProduct())[command.getIndex()].poll());
        }
        return products;
    }
    public  void check(){
        Iterator<String> iterator = machine.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            for (int i = 0; i < 4; i++) {
                if(machine.get(key)[i].size()==1){
                    refill(key,i);
                }
            }
        }
    }
    public  void refill(String key, int index) {
        for (int i = 0; i < 19; i++) {
            machine.get(key)[index].add(machine.get(key)[index].element());
        }
    }
    public   void f(){
        Iterator<String> iterator = machine.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            for (int i = 0; i < 4; i++) {
                System.out.println(machine.get(key)[i].size());
            }
            System.out.println();
        }
    }
}

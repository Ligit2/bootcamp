package week8.vendingmachine.utils;


import week8.vendingmachine.VendingMachine;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = null;
        File file = new File("vending machine.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                vendingMachine = new VendingMachine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (FileInputStream inputFile = new FileInputStream(file)) {
                if (inputFile.available() != 0) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(inputFile);
                    vendingMachine = (VendingMachine) objectInputStream.readObject();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        String string = scanner.next();
        while (!string.equals("0")) {
            Command convert = CommandManager.convert(string);
            List<Product> product = vendingMachine.getProduct(convert);
            System.out.println(product);
            try (FileOutputStream fileInputStream = new FileOutputStream(file);
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream);) {

                objectOutputStream.writeObject(vendingMachine);
            } catch (IOException e) {
                e.printStackTrace();
            }
            start();
        }
    }
}

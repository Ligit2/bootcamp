package week4.day1;

import java.io.IOException;
import java.util.Scanner;

public class Shop {
    String name;
    String address;
    int countOfProduct;
    double priceForProduct;
    double shopBalance;
    Shop(){}
    Shop(String name) {
        this.name = name;
    }
    Shop(String name, String address){
        this.address=address;
        this.name=name;
    }
    Shop(String name, String address, int countOfProduct){
        this.address=address;
        this.name=name;
        this.countOfProduct = countOfProduct;
    }
    Shop(String name, String address, int countOfProduct, double priceForProduct){
        this.address=address;
        this.name=name;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
    }
    Shop(String name, String address, int countOfProduct, double priceForProduct, double shopBalance){
        this.address=address;
        this.name=name;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }
    boolean checkOrder(int countOfProduct){
        if(countOfProduct<=this.countOfProduct)
           return true;
        else
            return false;
    }
    double calculateOrder(int countOfProduct){
        return countOfProduct * priceForProduct;
    }
    void addToShopBalance(double money){
        this.shopBalance+=money;
    }
    void response() throws IOException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("please input how many product do you want tu buy");
        int countOfProduct = scanner1.nextInt();
        boolean check = checkOrder(countOfProduct);
        if(check){
            Scanner scanner = new Scanner(System.in);
            System.out.println("If you want to buy it, Press 1\nIf you don't want to buy it , Press any bottom");
            char key = (char)System.in.read();
            if(key == '1'){
                double money = calculateOrder(countOfProduct);
                System.out.println("Your product cost " + money);
                addToShopBalance( money);
            }
        }
        else
        {
            System.out.println("Now we don't have so much product, sorry");
        }
    }
}

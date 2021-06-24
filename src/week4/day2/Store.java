package week4.day2;

import java.io.IOException;
import java.util.Scanner;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int array[];
    Store(){}
    Store(int countOfWorkers, String name, String phoneNumber, int array[]){
        this.array=array;
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int[] getArray() {
        return array;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if(countOfWorkers>=2 && countOfWorkers<=50)
            this.countOfWorkers = countOfWorkers;
        else
            System.out.println("invalid count");
    }

    public void setName(String name) {
        if(name.length()>=3)
        {
            boolean check =true;
            for (int i = 0; i < name.length(); i++) {
                if(!(name.charAt(i)>='a' && name.charAt(i)<='z' || name.charAt(i)>='A' && name.charAt(i)<='Z'))
                    check =false;
            }
            if(check)
                this.name = name;
            else
                System.out.println("Invalid name");
        }
        else
            System.out.println("Invalid name");
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()==8)
        {
            boolean check =true;
            for (int i = 0; i < phoneNumber.length(); i++) {
                if(!(phoneNumber.charAt(i)>='0' && phoneNumber.charAt(i)<='9'))
                    check =false;
            }
            if(check)
                this.phoneNumber = phoneNumber;
            else
                System.out.println("Invalid phone number");
        }
        else
            System.out.println("Invalid phone number");
    }
    public void setArray(int[] array) {
        boolean check=true;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0)
                check=false;
        }
        if(check)
            this.array = array;
        else
            System.out.println("array is invalid");
    }
    public void shop() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the id of product that you want ");
        int id = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==id){
                System.out.println("If you want to buy input 1\nElse input any number");
                char c =(char)System.in.read();
                if(c=='1')
                    System.out.println("you buy it");
                else
                    System.out.println("ok");
                return;
            }
        }
        System.out.println("Sorry we don't have such product");
    }
}

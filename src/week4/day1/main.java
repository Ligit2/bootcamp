package week4.day1;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
       /* Employer employer1 = new Employer();
        Employer employer2 = new Employer("Lilith",20, "Eph",0);
        employer1.print();
        employer2.print();*/
        /*Shop shop1 = new Shop("Animals", "Tigran Metsh 36", 768, 789000);
        shop1.response();*/
        /*University university1 = new University("YSU",8000,15000, 22,17);
        university1.professionChoice();*/
       /* Arithmetic arithmetic1 = new Arithmetic();
        arithmetic1.option();*/
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Student array[] = new Student[size];
        for (int i = 0; i < size; i++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            double weight = scanner.nextDouble();
            array[i] = new Student(name,age,weight);
        }
        Sort sort1= new Sort();
        sort1.sort(array,"oop");
        for (int i = 0; i < size; i++) {
            array[i].print();
        }
    }
}

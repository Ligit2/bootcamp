package week4.day1;

public class Employer {
    String name;
    int age;
    String workSpace;
    double salary;
    Employer(){}
    Employer(String name, int age, String workSpace, double salary){
        this.workSpace = workSpace;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    void print(){
        System.out.println("name -> " + this.name);
        System.out.println("age-> " + this.age);
        System.out.println("work Space-> " + workSpace);
        System.out.println("salary-> " + salary);
    }
}

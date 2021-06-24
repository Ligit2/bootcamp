package week4.day4;

public abstract class Animal {
    private int age;
    private String name;
    public abstract void sound();
    Animal(int age,String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

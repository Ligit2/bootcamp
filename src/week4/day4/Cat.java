package week4.day4;

public class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("cat say meow");
    }

    Cat(int age, String name){
        super(age, name);
    };

    @Override
    public String toString() {
        return super.getName()+" "+super.getAge();
    }
}

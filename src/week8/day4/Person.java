package week8.day4;

public class Person {
    private String name;
    private int age;
    private String nationality;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    Person(String name, int age, String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

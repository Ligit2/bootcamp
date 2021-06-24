package week8.day3;

public class SuperClass {
    static int k;
    transient String name="Lilit";
    int age;
    String nationality;
    SuperClass(){
        nationality="Armenian";
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

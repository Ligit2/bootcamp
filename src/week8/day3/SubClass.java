package week8.day3;

import java.io.Serializable;

public class SubClass extends SuperClass implements Serializable {
    transient String surname="Avoyan";

    @Override
    public String toString() {
        return "SubClass{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

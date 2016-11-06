package HomeWorkObjectExample2;

import java.io.Serializable;

/**
 * Created by Владислав on 05.11.2016.
 */
public class Person implements Serializable{
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

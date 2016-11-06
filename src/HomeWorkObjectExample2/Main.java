package HomeWorkObjectExample2;

import HomeWork3.*;

import java.io.*;

/**
 * Created by Владислав on 05.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("A",10);
        Person person2 = new Person("B",11);
        Person person3 = new Person("C",12);
        Person person4 = new Person("D",13);
        Group group = new Group();
        group.addPerson(person1);
        group.addPerson(person2);
        group.addPerson(person3);
        group.addPerson(person4);
        try(ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream("fil.txt"))) {
            oop.writeObject(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Group group1 = null;
        try(ObjectInputStream oip = new ObjectInputStream(new FileInputStream("fil"))){
            group1 = (Group) oip.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        group1.printGroup();

    }
}

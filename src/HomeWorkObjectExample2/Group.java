package HomeWorkObjectExample2;


import java.io.Serializable;

/**
 * Created by Владислав on 05.11.2016.
 */
public class Group implements Serializable {
    private Person[] group;

    public Group() {
        group = new Person[0];
    }
    public void addPerson(Person person){
        Person[] p = new Person[group.length + 1];
       
        p[p.length-1] = person;
        group = p;
    }
    public void printGroup(){
        for (Person p : group) System.out.println(p);
    }
}

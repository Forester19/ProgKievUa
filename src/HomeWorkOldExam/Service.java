package HomeWorkOldExam;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Владислав on 12.11.2016.
 */
public class Service {
    private ArrayDeque<Person> stack;
    private Person sheldon = new Person("Sheldon");
    private Person leonard = new Person("Leonard");
    private Person volovitc = new Person("Volovitc");
    private Person kutrapalli = new Person("Kutrapalli");
    private Person penni= new Person("Penni");
    public ArrayDeque<Person> addPersonToQueue(){
       stack = new ArrayDeque<>();
        stack.push(sheldon);
        stack.push(leonard);
        stack.push(volovitc);
        stack.push(kutrapalli);
        stack.push(penni);
        return stack;
    }
    public ArrayDeque<Person> doingQueue(Integer i){
        addPersonToQueue();
        for (int n=0; n<i; n++) {
            Person p1 = stack.pollFirst();
            Person p2 = p1;
            stack.addLast(p1);
            stack.addLast(p2);
        }
        return stack;
    }

    @Override
    public String toString() {
        return "Service{" +
                "stack=" + stack +
                '}';
    }
}

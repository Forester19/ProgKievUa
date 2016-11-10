package HomeWorkCollectionsExamole1;

import java.util.ArrayList;

/**
 * Created by Владислав on 10.11.2016.
 */
public class Main {

    public static void createListAnrRemove() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++){
            list.add(i+3);
        }
        list.remove(0);
        list.remove(0);
        list.remove(7);

        System.out.println(list);
        System.out.println(list.size());


    }
    public static void main(String[] args) {
      createListAnrRemove();
    }
}

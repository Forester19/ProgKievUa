package HomeWorkShips;

import java.util.concurrent.Callable;

/**
 * Created by Владислав on 04.11.2016.
 */
public class Ship1 implements Callable<String> {
    private   Port port;
    public int[] boxes = {0,1,2,3,4,5,6,7,8,9};



    @Override
    public String call() throws Exception {
        System.out.println("Ship1 unloading");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Unloaded ship1";
    }
}

package HomeWorkShips;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by Владислав on 04.11.2016.
 */
public class Port implements Runnable {

     public int[] portRepository = new int[30];

    @Override
    public void run() {
        ExecutorService service = Executors.newFixedThreadPool(2);
        ArrayList<Future<String>> res = new ArrayList<>();
        res.add(service.submit(new Ship1()));
        res.add(service.submit(new Ship2()));
        res.add(service.submit(new Ship3()));
        for(Future<String> fs : res){
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            finally {
                service.shutdown();

            }
        }

    }
}
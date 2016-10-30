package HomeWorkMultiThreading;

/**
 * Created by Владислав on 29.10.2016.
 */
public class Main {
    public static void main(String[] args) {
           Thread thread = new Thread(new ArrayOfThreads());
        thread.start();
    }
}

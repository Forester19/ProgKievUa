package HomeWorkMultiThreading;

/**
 * Created by Владислав on 29.10.2016.
 */
public class ArrayOfThreads implements Runnable {
    Thread t = new Thread(new MyFirstThread());
    Thread[] threads = new Thread[100];
    public void init(){
    for (int i=0; i<100; i++){
        threads[i] = new Thread(new MyFirstThread());
    }
        for (int y =0;y<threads.length;y++)
            threads[y].start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }

    public Thread[] getThreads() {
        return threads;
    }

    @Override
    public void run() {
        init();
    }
}

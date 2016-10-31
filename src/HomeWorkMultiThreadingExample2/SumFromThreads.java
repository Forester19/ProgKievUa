package HomeWorkMultiThreadingExample2;

/**
 * Created by Владислав on 30.10.2016.
 */
public class SumFromThreads implements Runnable {
    int sum1;
    int sum2;
    int sum;

    private int  start(){
        FirstThreadOfSumming f = new FirstThreadOfSumming();
        Thread thread =new Thread(f);
        thread.start();
        sum1 = f.getSum();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        SecondThreadOfSumming s = new SecondThreadOfSumming();
        Thread thread1 = new Thread(s);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sum2 = s.getSum();
        sum = sum1+ sum2;
return sum;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
            start();

    }
}

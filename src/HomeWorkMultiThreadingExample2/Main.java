package HomeWorkMultiThreadingExample2;

/**
 * Created by Владислав on 30.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        NormalSumOfArray normalSumOfArray = new NormalSumOfArray();
        long start = System.currentTimeMillis();
        System.out.println(normalSumOfArray.normalSuming());
        long end = System.currentTimeMillis() - start;
        System.out.println("Normal summing ---  " + end + "sec");

        long s = System.currentTimeMillis();
        SumFromThreads f = new SumFromThreads();
        Thread t = new Thread(f);
        t.start();
        long en = System.currentTimeMillis() - s;
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( f.getSum());

        System.out.println("Threading summing ----" + en + "sec ");

    }
}

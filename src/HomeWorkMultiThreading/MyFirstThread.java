package HomeWorkMultiThreading;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Владислав on 29.10.2016.
 */
public class MyFirstThread implements Runnable {



    private int numberOfThread() {
        String s = Thread.currentThread().getName();
        String m = s.substring(7);
        int res = Integer.parseInt(m);
        return res;
    }

    private int factorial(){
        int fact =1;
       //if (numberOfThread() == 0) fact = 1;
        for (int i=1; i<=numberOfThread();i++){
            fact *= i;
        }
        return fact;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +"   " + "Factorial  " + numberOfThread() + " -- " +   factorial() );
        while (!Thread.interrupted()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

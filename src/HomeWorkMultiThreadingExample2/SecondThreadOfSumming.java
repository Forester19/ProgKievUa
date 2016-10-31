package HomeWorkMultiThreadingExample2;

/**
 * Created by Владислав on 30.10.2016.
 */
public class SecondThreadOfSumming implements Runnable{
    ArrayOfIntegers  arrayOfIntegers = new ArrayOfIntegers();
    int[] num = arrayOfIntegers.addNumbersToArray();
    int sum =0;
    private int sumFirstFifeMillion(){
        for (int i =50000;i<num.length; i++){
            sum = sum+ num[i];
        }
        return sum;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        sumFirstFifeMillion();
    }
}

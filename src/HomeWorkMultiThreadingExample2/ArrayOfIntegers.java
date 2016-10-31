package HomeWorkMultiThreadingExample2;

import java.util.Random;

/**
 * Created by Владислав on 30.10.2016.
 */
public class ArrayOfIntegers {
    int[] n =new int[100000];
    public int[] addNumbersToArray(){
        Random random = new Random();
        for (int i =0; i<n.length; i++){
            n[i] = random.nextInt(10);
        }
        return n;
    }
}

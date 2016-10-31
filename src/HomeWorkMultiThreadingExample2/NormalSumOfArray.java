package HomeWorkMultiThreadingExample2;

/**
 * Created by Владислав on 30.10.2016.
 */
public class NormalSumOfArray {
    ArrayOfIntegers arrayOfIntegers = new ArrayOfIntegers();
    int[] num = arrayOfIntegers.addNumbersToArray();
    int sum =0;
    public int normalSuming(){
              for (int i=0; i<num.length;i++){
              sum = sum+num[i];
              }
        return  sum;
    }
}

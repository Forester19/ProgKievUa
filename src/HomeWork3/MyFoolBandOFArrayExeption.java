package HomeWork3;

/**
 * Created by Владислав on 20.10.2016.
 */
public class MyFoolBandOFArrayExeption extends Exception {
    @Override
    public String getMessage() {
        String s = "it's fool group";
        return s;
    }
}

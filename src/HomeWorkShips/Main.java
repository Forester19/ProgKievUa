package HomeWorkShips;

/**
 * Created by Владислав on 03.11.2016.
 */
public class Main {
    public static void main(String[] args) {
   Thread thread = new Thread(new Port());
        thread.start();
    }
}

package HomeWork.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Владислав on 13.10.2016.
 */
public class Main {
     private static List<Phone> phones = new ArrayList<>();
    private static Network n =new Network();
    public static void main(String[] args) {
        n.allGroup(phones);
        n.teltphonia(phones);


}}

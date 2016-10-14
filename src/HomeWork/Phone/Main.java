package HomeWork.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Владислав on 13.10.2016.
 */
public class Main {
     private static Random random = new Random();
 private static List<Phone> p = new ArrayList<Phone>(){{
     new Phone("w",1);
     new Phone("q",2);
     new Phone("e",3);
     new Phone("t",4);
     new Phone("y",5);
 }};
    private static Network n = new Network();
    public static void main(String[] args) {
         n.registrationPhone(p);
         n.registrationPhone(p);
         n.registrationPhone(p);
         n.registrationPhone(p);
         n.registrationPhone(p);
        n.CallToSomeOne(p,random.nextInt(10000)+ 10000);
}}

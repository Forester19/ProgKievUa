package HomeWork.Phone;

import java.util.List;
import java.util.Random;

/**
 * Created by Владислав on 13.10.2016.
 */
public class Network {
     private Random random = new Random();
    private List phones;
    int number;
    int NUM;

    public int registrationPhone(List<Phone> phone){
        this.phones = phone;


        int numberN = number + random.nextInt(10000)+ 10000;
        System.out.println(numberN);
        return numberN;
    }

    public void CallToSomeOne(List<Phone> phone,Integer NUM){

        for(int i =0; i<phone.size(); i++) {
            if (NUM != number){
                System.out.println("All right now you have calling to: " + NUM);
            }else System.out.println("Error!! you have not this number");
        }

    }



}

package HomeWork.Phone;

import java.util.Random;

/**
 * Created by Владислав on 13.10.2016.
 */
public class Phone {

    private int number;

    public Phone( int number) {

        this.number = number;
    }
   public int  registr(){
       System.out.println(number);
      return number;
   }
   public void callToSomeOne(Phone phone){
       if(phone.number != number){
           System.out.println("Sorry but this number of phone does no exist!");
       }else{
           System.out.println("Right now you call to: " + number);
       }

   }

    public int getNumber() {
        return number;
    }
}

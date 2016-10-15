package HomeWork.Phone;

import java.util.List;
import java.util.Random;

/**
 * Created by Владислав on 13.10.2016.
 */
public class Network {
    private Phone phone1 = new Phone(123);
    private Phone phone2 = new Phone(234);
    private Phone phone3 = new Phone(456);
    private Phone phone4 = new Phone(567);
    private Phone phone5 = new Phone(678);
 private List<Phone> phones;
    public void allGroup(List<Phone> phones){
        System.out.println("All numbers of phones: ");
        phone1.registr();
        phone2.registr();
        phone3.registr();
        phone4.registr();
        phone5.registr();
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);
        this.phones =phones;
    }
    public void teltphonia(List<Phone> phones){
        this.phones=phones;
        for (int p =0; p<phones.size(); p++) {
            phones.get(p).registr();
        }
    }






}

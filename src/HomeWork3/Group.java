package HomeWork3;

import java.util.Arrays;

/**
 * Created by Владислав on 20.10.2016.
 */
public class Group {
    private Student[] persons = new Student[10];
    public void addStudent(Student s, int i) throws MyFoolBandOFArrayExeption{
      // if(persons[i] == null){
        if(i >= 10) throw new MyFoolBandOFArrayExeption();
        persons[i] = s;
       //}else System.out.println("Sry the are some other student");
    }
    public void removeStudent(Student s){
        for (int i =0; i<persons.length; i++){
            if(persons[i] == s){
                persons[i] = null;}
            else {
                System.out.println("This student does not exist");}
        }
    }
    public void selectStudentToSurname(String surname){
        for (int i =0; i<persons.length; i++){
            if(persons[i].getSurname() == surname){
                System.out.println( persons[i].toString() );

            }else System.out.println("This student does not exist");
        }

    }

    @Override
    public String toString() {
        Arrays.sort(persons);
        return "Group{" +
                "persons=" + Arrays.toString(persons) +
                '}';
    }
}

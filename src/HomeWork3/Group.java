package HomeWork3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Владислав on 20.10.2016.
 */
public class Group implements ArmyComitet{
    public Student[] persons = new Student[10];

    public Group(Student[] persons) {
        this.persons = persons;
        persons[0] = new Student("Vlad","Kovalsky", "man",19," Programmer");
        persons[1] = new Student("Valera","Pax", "man",20," Programmer");
        persons[2] = new Student("Sergiy","Dvoreckiy", "man",21," Programmer");
        persons[3] = new Student("Jack","Jonson", "man",22," Programmer");
        persons[4] = new Student("Erick","Ekkel", "man",23," Programmer");
        persons[5] = new Student("Andrew","Momot", "man",34," Programmer");
        persons[6] = new Student("Georg","Faser", "man",24," Programmer");
        persons[7] = new Student("Brew","Misery", "man",25," Programmer");
        persons[8]= new Student("Andrew","Rogovets", "man",26," Programmer");
        persons[9] = new Student("Splesh","Friendly", "man",18," Programmer");
    }

    public void addStudent(Group s,int i) throws MyFoolBandOFArrayExeption{
      // if(persons[i] == null){
        if(i >= 10) throw new MyFoolBandOFArrayExeption();
       // persons[i] = s.getPersons();
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
                System.out.println( persons[i] );

            }
        }

    }
    public void writerInFile(){
        try(PrintWriter printWriter = new PrintWriter("gr.txt")){
            for (Student s:persons)
            printWriter.print(s.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
      //  Arrays.sort(persons);
        return "Group{" +
                "persons=" + Arrays.toString(persons) +
                '}';
    }


    @Override
    public ArrayList<Student> returnStudentsForArmy() {
        ArrayList<Student> students = new ArrayList<>();
        for (Student s: persons){
            if (s.getAge()> 18){
                students.add(s);
            }
        }
        return students;
    }

    public Student[] getPersons() {
        return persons;
    }

    public Student sortArraytoSurname(String s) {
        Student stud;
        for (Student v:persons) {
            if(v.getSurname() == s){
             stud = v;
            }
        }
        return null;
    }
    public String getInfomationOfPerson(){
        String a =null;
        for (int y =0;y<persons.length;y++){
            a = persons[y].toString();
        }
        return a;
    }
}

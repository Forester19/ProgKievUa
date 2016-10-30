package HomeWork3;

/**
 * Created by Владислав on 20.10.2016.
 */
public class Main {
    public static void main(String[] args)  {
        Student[] students = new Student[10];
        Group group = new Group(students);
        group.writerInFile();
        try {
            group.addStudent(group,10);
        } catch (MyFoolBandOFArrayExeption myFoolBandOFArrayExeption) {
            myFoolBandOFArrayExeption.printStackTrace();
        } finally {

            System.out.println(group);
           // group.selectStudentToSurname("Momot");
           // group.sortArraytoSurname();
            //System.out.println(group);
            System.out.println(group.returnStudentsForArmy());
        }


    }
}

package HomeWork3;

/**
 * Created by Владислав on 20.10.2016.
 */
public class Main {
    public static void main(String[] args)  {
        Student student1 = new Student("Vlad","Kovalsky", "man",19," Programmer");
        Student student2 = new Student("Valera","Pax", "man",20," Programmer");
        Student student3 = new Student("Sergiy","Dvoreckiy", "man",21," Programmer");
        Student student4 = new Student("Jack","Jonson", "man",22," Programmer");
        Student student5 = new Student("Erick","Ekkel", "man",23," Programmer");
        Student student6 = new Student("Andrew","Momot", "man",34," Programmer");
        Student student7 = new Student("Georg","Faser", "man",24," Programmer");
        Student student8 = new Student("Brew","Misery", "man",25," Programmer");
        Student student9 = new Student("Andrew","Rogovets", "man",26," Programmer");
        Student student10 = new Student("Splesh","Friendly", "man",18," Programmer");
       Student student11 = new Student("Boris","Juk", "man",19," Programmer");
        Group group = new Group();
        try {
            group.addStudent(student1,0);
            group.addStudent(student3,2);
            group.addStudent(student4,3);
            group.addStudent(student5,4);
            group.addStudent(student2,1);
            group.addStudent(student6,5);
            group.addStudent(student7,6);
            group.addStudent(student8,7);
            group.addStudent(student9,8);
            group.addStudent(student10,9);
            group.addStudent(student1,10);
            group.addStudent(student1,11  );
        } catch (MyFoolBandOFArrayExeption myFoolBandOFArrayExeption) {
            myFoolBandOFArrayExeption.printStackTrace();
        } finally {

            group.selectStudentToSurname("Momot");
        group.toString();
        }

}
}

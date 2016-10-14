package HomeWork;

/**
 * Created by Владислав on 12.10.2016.
 */
public class Main  {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color = "dfff";
        cat.height =10;
        cat.weight =10;
        cat.year =10;
        cat.ViewAll();

        Triangle triangle = new Triangle(2,3,4);
        triangle.S();
        triangle.toString();

        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(2,3,4);
        v1.Sum(v2);
        v1.Scal(v2);
        v1.Vect(v2);

    }
}

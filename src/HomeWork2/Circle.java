package HomeWork2;

/**
 * Created by Владислав on 16.10.2016.
 */
public class Circle extends Shape {
    private Point A = new Point(1,1);// центр круга
    private Point B = new Point(1,3);// точка круга

    public Circle(Point a, Point b) {
        A = a;
        B = b;
    }

    double a = Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2)); // радиус круга


    @Override
    double getPerimetr() {
        double P = 2*Math.PI*a;
        System.out.println("The length of circle:  " + P);

        return P;
    }

    @Override
    double getArea() {

        double s = Math.PI*Math.pow(a,2);
        System.out.println("The area of circle: " + s);
        return s;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "A=" + A +
                ", B=" + B +
                ", a=" + a +
                '}' + super.toString();
    }
}

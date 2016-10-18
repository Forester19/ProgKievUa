package HomeWork2;

/**
 * Created by Владислав on 15.10.2016.
 */
public class Triagle extends Shape {

    private Point A = new Point(1,1);
    private Point B = new Point(1,3);
    private Point C = new Point(3,1);

    public Triagle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }


    double a = Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
    double b = Math.sqrt(Math.pow(C.getX() - B.getX(), 2) + Math.pow(C.getY() - B.getY(), 2));
    double c = Math.sqrt(Math.pow(A.getX() - C.getX(), 2) + Math.pow(A.getY() - C.getY(), 2));


    @Override
    double getPerimetr() {
        double P = a + b + c;
        System.out.println("The perimeter of triangle:  " + P);

        return P;
    }

    @Override
    double getArea() {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("The area of triangle: " + s);
        return s;
    }

    @Override
    public String toString() {
        return "Triagle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}' + super.toString();
    }

}

package HomeWork2;

/**
 * Created by Владислав on 16.10.2016.
 */
public class Square extends Shape {
    Point A = new Point(1,1);
    Point B = new Point(3,1);
    Point C = new Point(1,3);
    Point D = new Point(3,3);


    double a = Math.sqrt(Math.pow(B.getX()-A.getX(),2) + Math.pow(B.getY()-A.getY(),2));
    double b = Math.sqrt(Math.pow(C.getX()-A.getX(),2) + Math.pow(C.getY()-A.getY(),2));
    double c = Math.sqrt(Math.pow(D.getX()-C.getX(),2) + Math.pow(D.getY()-C.getY(),2));
    double d = Math.sqrt(Math.pow(D.getX()-B.getX(),2) + Math.pow(D.getY()-B.getY(),2));

    @Override
    double getPerimetr() {
        double P = a+b+c+d;
        System.out.println("The perimeter of square:  " +P);
        return P;
    }

    @Override
    double getArea() {
        double s = a*b;
        System.out.println("The area of square: " + s);
        return s;
    }

    @Override
    public String toString() {
        return "Square{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ", D=" + D +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}' + super.toString();
    }
}

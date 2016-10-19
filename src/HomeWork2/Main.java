package HomeWork2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владислав on 16.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Point A = new Point(1, 1);
        Point B = new Point(3, 1);
        Point C = new Point(1, 3);
        Point D = new Point(3, 3);

        Triagle triagle = new Triagle(A,B,C);
        triagle.getPerimetr();
        triagle.getArea();

        Circle circle = new Circle(A,B);
        circle.getPerimetr();
        circle.getArea();

        Square square = new Square(A,B,C,D);
        square.getPerimetr();
        square.getArea();

        Board b = new Board();
        b.addShape(0,triagle);
        b.addShape(1,circle);
        b.addShape(2,square);
        b.addShape(3,triagle);
        b.addShape(1,triagle);
        b.showAllOfShapesAndSummaryArea();

    }
}

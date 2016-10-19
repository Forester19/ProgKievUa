package HomeWork2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владислав on 16.10.2016.
 */
public class Board {

    private Shape[] shapes = new Shape[4];

    public void addShape(Integer i, Shape s) {
        if(shapes[i] != null ){
            System.out.println("in this place " + s.toString());
        }else {
            shapes[i] =s;
        }
    }


    public void removeShape(Shape s) {
        for (int i = 0; i < 4; i++) {
            if (shapes[i] == s) {
                shapes[i] = null;
            } else System.out.println("this shape don't exist");
        }
    }

    public double showAllOfShapesAndSummaryArea() {
        double sum = 0;
        double s = 0;
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            sum = shapes[i].getArea();
            s = s + sum;
        }
        System.out.println("Summary area: " + s);
        return s;
    }
}

package HomeWork2;

/**
 * Created by Владислав on 16.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Triagle triagle = new Triagle();
        triagle.getPerimetr();
        triagle.getArea();

        Circle circle = new Circle();
        circle.getPerimetr();
        circle.getArea();

        Square square = new Square();
        square.getPerimetr();
        square.getArea();

        Board b = new Board();
        b.addShape(triagle,circle,square,triagle);
        b.showAllOfShapesAndSummaryArea();

    }
}

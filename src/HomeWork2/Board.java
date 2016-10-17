package HomeWork2;

/**
 * Created by Владислав on 16.10.2016.
 */
public class Board {
    private Shape shape[] = new Shape[4];
    public void addShape( Shape s, Shape sh, Shape sha,Shape shap){
        shape[0] = s;
        shape[1] = sh;
        shape[2] = sha;
        shape[3] = shap;

    }
    public void removeShape(Shape s){
        for (int i =0; i<4; i++ ){
            if(shape[i] == s ){
                shape[i] = null;
            }
            else System.out.println("this shape don't exist");
        }
    }
    public double showAllOfShapesAndSummaryArea(){
        double sum = 0;
        for (Shape s : shape) {
            System.out.println(s);
            sum = sum + s.getArea();
        }
        System.out.println("Summary area: " + sum);
        return sum;
    }
}

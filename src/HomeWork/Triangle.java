package HomeWork;

/**
 * Created by Владислав on 12.10.2016.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
   // public int angle;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void S(){
        //int h;
        double s;
        double p;
        p = (a+b+c)/2;
        s =Math.sqrt(p*(p-a)*(p-b)*(p-c)) ;
        System.out.println("so s = " + s);

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

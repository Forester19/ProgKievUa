package HomeWork;

/**
 * Created by Владислав on 12.10.2016.
 */
public class Vector {
    private double x;
    private double y;
    private double z;
    private double V1x;
    private double V1y;
    private double V1z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void Sum(Vector v){
        V1x = v.x+x;
        V1y = v.y+y;
        V1z = v.z+z;
        System.out.println("вектор исходный = " + "("+V1x+";"+V1y+";"+V1z+")");
    }
    public void Scal(Vector v){
        V1x = v.x*x;
        V1y = v.y*y;
        V1z = v.z*z;
        double scal = V1x +V1y+V1z;
        System.out.println("Скалярное произведение = " + scal);
    }
    public void Vect(Vector v){
        V1x = v.y*z-v.z*y;// ормула определителя с матрици
        V1y = v.x*y-v.y*z;
        V1z = v.z*x-v.x*z;
        System.out.println("екторное произведение = "+ V1x +"i"+";"+ V1y+"j" + ";" + V1z+ "k"+";");
    }


}

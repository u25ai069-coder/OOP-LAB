package LAB_3;
import java.util.Scanner;

class Figure{
    double r, a, v;
    
    public void displayArea()
    {
        System.out.println("Area: " + a);
    }

    public void displayVolume()
    {
        System.out.println("Volume: " + v);
    }
}

class Cone extends Figure{
    double h, s;

    Cone(double r,double h)
    {
        this.r = r;
        this.h = h;
        this.s = Math.sqrt(h*h + r*r);
    }

    public void calcArea()
    {
        a = Math.PI * (r*r + r*s);
    }
    
    public void calcVolume()
    {
        v = (Math.PI * r * r * h) / 3;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double r = sc.nextDouble();

        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        
        Cone cn = new Cone(r, h);

        cn.calcArea();
        cn.displayArea();

        cn.calcVolume();
        cn.displayVolume();

        sc.close();
    }
}

package LAB_3;

import java.util.Scanner;

abstract class Figures{
    double pi = 3.1420;
    double r, a, v;

    public void displayArea()
    {
        System.out.println("Area: " + a);
    }

    public void displayVolume()
    {
        System.out.println("Volume: " + v);
    }

    abstract public void calcArea();
    abstract public void calcVolume();
}

class Cone extends Figures{
    double h, s;

    Cone(double r, double h)
    {
        this.r = r;
        this.h = h;
        this.s = Math.sqrt(h*h + r*r);
    }

    public void calcArea()
    {
        a = pi * (r*r + r*s); 
    }

    public void calcVolume()
    {
        v = (pi * r * r * h) / 3;
    }
}

class Sphere extends Figures{

    Sphere(double r)
    {
        this.r = r;
    }

    public void calcArea()
    {
        a = 4 * pi * r * r; 
    }

    public void calcVolume()
    {
        v = (4 * pi * r * r * r) / 3;
    }
}

class Cylinder extends Figures{
    double h;

    Cylinder(double r, double h)
    {
        this.r = r;
        this.h = h;
    }

    public void calcArea()
    {
        a = 2 * pi * r * (h + r);
    }

    public void calcVolume()
    {
        v = pi * r * r * h;
    }

}

public class Abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 for Cone, 2 for Sphere, 3 for Cylinder");
        System.out.println("Enter choise: ");
        int x = sc.nextInt();
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        double h;

        switch (x) {
            case 1: System.out.println("Enter Height: ");
                    h = sc.nextDouble();
                    Cone cn = new Cone(r, h);

                    cn.calcArea();
                    cn.displayArea();
                    cn.calcVolume();
                    cn.displayVolume();
                
                break;
        
            case 2: Sphere s = new Sphere(r);

                    s.calcArea();
                    s.displayArea();
                    s.calcVolume();
                    s.displayVolume();

                break;

            case 3: System.out.println("Enter Height: ");
                    h = sc.nextDouble();

                    Cylinder cy = new Cylinder(r, h);

                    cy.calcArea();
                    cy.displayArea();
                    cy.calcVolume();
                    cy.displayVolume();

                break;

            default: System.out.println("Invalid input");

                break;
        }

        sc.close();
    }
}
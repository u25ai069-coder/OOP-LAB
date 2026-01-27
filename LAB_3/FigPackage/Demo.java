package LAB_3.FigPackage;
import java.util.Scanner;

public class Demo {
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

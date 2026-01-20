package LAB_1;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int r = sc.nextInt();

        int diameter = 2*r;

        double circumference = 2 * Math.PI * r;

        double area = Math.PI * r * r;
        
        System.out.println("Diameter: " + diameter + "\nCircumferece: " + circumference + "\nArea: " + area);

        sc.close();
    }
}

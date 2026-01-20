package LAB_2;
import java.util.Scanner;

class Car {
    int total_miles, cost_per_gallon, avg_fees, tolls;

    Car(int total_miles, int cost_per_gallon, int avg_fees, int tolls)
    {
        this.total_miles = total_miles;
        this.cost_per_gallon = cost_per_gallon;
        this.avg_fees = avg_fees;
        this.tolls = tolls;
    }

    int costPerDay()
    {
        return ((total_miles / 30) * cost_per_gallon) + avg_fees + tolls;
    }
}

public class DrivingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles driven: ");
        int total_miles = sc.nextInt();

        System.out.print("Enter cost per gallon: ");
        int cost_per_gallon = sc.nextInt();

        System.out.print("Enter average fees: ");
        int avg_fees = sc.nextInt();

        System.out.print("Enter total tolls: ");
        int tolls = sc.nextInt();

        Car c = new Car(total_miles, cost_per_gallon, avg_fees, tolls);

        System.out.println("Cost per day: " + c.costPerDay());

        sc.close();
    }
}

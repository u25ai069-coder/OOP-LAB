package LAB_5.Q_3;

import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ElectricalProduct EP = new ElectricalProduct(0, null, 0, 0, 0, 0);
        System.out.println("Enter product ID: ");
        EP.productID = sc.nextInt();

        System.out.println("Enter name: ");
        EP.name = sc.next();

        System.out.println("Enter categoryID: ");
        EP.categoryID = sc.nextInt();

        System.out.println("Enter unit price: ");
        EP.unitPrice = sc.nextInt();

        System.out.println("Enter voltage: ");
        EP.voltageRange = sc.nextInt();

        System.out.println("Enter wattage: ");
        EP.wattage = sc.nextInt();

        System.out.println("would you like to change the price: ");
        boolean ans1 = sc.nextBoolean();

        if (ans1)
        {
            System.out.println("Enter new price: ");
            int price = sc.nextInt();
            EP.changePrice(price);
        }

        System.out.println("would you like to change the wattage: ");
        boolean ans2 = sc.nextBoolean();

        if (ans2)
        {
            System.out.println("Enter new wattage: ");
            int wattage = sc.nextInt();
            EP.changeWattage(wattage);
        }

        EP.display();

        sc.close();
    }
}

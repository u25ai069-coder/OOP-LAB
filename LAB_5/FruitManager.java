package LAB_5;

import java.util.Scanner;

class Fruit {

    String name;
    boolean bunch;
    float price;

    Fruit(String name, boolean bunch, float price)
    {
        this.name = name;
        this.bunch = bunch;
        this.price = price;
    }

    void displayFruit()
    {
        System.out.println("Nmae : " + name);
        System.out.println("bunch or not : " + bunch);
        System.out.println("Price (rs/kg): " + price);
    }
}

public class FruitManager {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Fruit mango = new Fruit("Mango", false, 70);
        Fruit banana = new Fruit("Banana", true, 60);

        System.out.println("Attributes of fruit " + mango.name + " : ");
        mango.displayFruit();

        System.out.println("\nAttributes of fruit " + banana.name + " : ");
        banana.displayFruit();

        sc.close();
    }
}

package Case_Based;

import java.util.Scanner;

public class EnergyNeeded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilogram: ");
        float mass = sc.nextFloat();

        System.out.println("Enter the initial temperature: ");
        float temp0 = sc.nextFloat();

        System.out.println("Enter the final temperature: ");
        float temp1 = sc.nextFloat();

        System.out.println("The Energy needed: " + mass*(temp1 - temp0)*4184);

        sc.close();
    }
}

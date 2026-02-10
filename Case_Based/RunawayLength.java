package Case_Based;

import java.util.Scanner;

public class RunawayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter speed and acceleration: ");
        float v = sc.nextFloat();
        float a = sc.nextFloat();

        System.out.println("Minimum runaway length: " + ((v*v) / (2*a)));

        sc.close();
    }
}

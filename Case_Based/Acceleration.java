package Case_Based;

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start velocity: ");
        float v0 = sc.nextFloat();

        System.out.print("Enter End velocity: ");
        float v1 = sc.nextFloat();

        System.out.print("Enter Time: ");
        float t = sc.nextFloat();

        float acc = (v1-v0) / t;

        System.out.println("Acceleration: " + acc);

        sc.close();
            
    }
}


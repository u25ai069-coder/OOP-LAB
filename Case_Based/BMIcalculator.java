package Case_Based;

import java.util.Scanner;

public class BMIcalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        float weight = sc.nextFloat();

        System.out.print("Enter height in inches: ");
        float height = sc.nextFloat();

        weight *= 0.45359237;
        height *= 0.0254;

        float BMI = weight / (height * height);

        System.out.println("BMI is " + BMI);

        sc.close();
    }
}

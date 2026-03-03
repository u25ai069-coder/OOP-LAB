package LAB_6;

import java.util.Scanner;

class WashingMachine {

    boolean ON_status;
    float detergentAmount;
    int clothsAmount;

    void switchON() {
        this.ON_status = true;
    }

    void switchOFF() {
        this.ON_status = false;
    }

    int acceptCloths(int x) {
        this.clothsAmount = x;
        return clothsAmount;
    }

    float acceptDetergent(float x) {
        this.detergentAmount = x;
        return detergentAmount;
    }
}

public class WashingMachineShowCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        WashingMachine wm = new WashingMachine();

        System.out.println("Enter cloth amount: ");
        int cloths = sc.nextInt();

        System.out.println("Enter detergent amount(in grams): ");
        float detergent = sc.nextFloat();

        System.out.println("Cloth amount: " + wm.acceptCloths(cloths));
        System.out.println("Detergent amount(in grams): "  + wm.acceptDetergent(detergent));

        System.out.println("Enter on status (true/false) : ");
        boolean status = sc.nextBoolean();

        if (status == true) {
            wm.switchON();
            System.out.println("Washing machine is switched ON");
        }
        else {
            wm.switchOFF();
            System.out.println("Washing machine is switched OFF");
        }

        sc.close();
    }
}

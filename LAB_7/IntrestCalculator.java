package LAB_7;

import java.util.Scanner;

class NegativeException extends Exception {
    public NegativeException(String message) {
        super(message);
    }
}

class Calculator {

    int principal;
    float rate;
    int months;

    static void checkNegative(double parameter) throws NegativeException {
        if (parameter < 0) {
            throw new NegativeException("Should be +ve \"" + parameter + "\"");
        }
    }

    Calculator(int p, float r, int m) throws NegativeException
    {
        checkNegative(p);
        checkNegative(r);
        checkNegative(m);

        this.principal = p;
        this.rate = r;
        this.months = m;
    }

    float amount() {
        return principal + (principal * rate * (int)(months/12)) / 100;
    }
}

public class IntrestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle, rate, months");
        int p = sc.nextInt();
        float r = sc.nextFloat();
        int m = sc.nextInt();

        try {
            Calculator cl = new Calculator(p, r, m);
            System.out.println("Amount: " + cl.amount());
        }
        catch (NegativeException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}

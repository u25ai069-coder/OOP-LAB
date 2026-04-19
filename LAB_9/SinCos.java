package LAB_9;

import java.util.Scanner;

public class SinCos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degree : ");
        float angle = sc.nextFloat();

        double angleRadian = angle * Math.PI / 180;

        SinThread sinThread = new SinThread(angleRadian);
        CosThread cosThread = new CosThread(angleRadian);

        Thread t1 = new Thread(sinThread);
        Thread t2 = new Thread(cosThread);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Comparision");
        System.out.println("Sin by Thread: " + sinThread.result + " Sin by Math: " + Math.sin(angleRadian));
        System.out.println("Cos by Thread: " + cosThread.result + " Cos by Math: " + Math.cos(angleRadian));

        sc.close();
    }
}

class SinThread implements Runnable {

    double x, result;

    SinThread(double x) {
        this.x = x;
    }

    @Override
    public void run() {

        result = 0;
        int terms = 10;             // more terms for more accuracy but more computational time

        for (int i=0; i<terms; i++) {

            int power = 2*i + 1;
            
            result += Math.pow(-1, i) * Math.pow(x, power) / factorial(power);
        }
    }

    long factorial(long n) {

        if (n==0) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}

class CosThread implements Runnable {

    double x, result;

    CosThread(double x) {
        this.x = x;
    }

    @Override
    public void run() {

        result = 0;
        int terms = 10;

        for (int i=0; i<terms ; i++) {

            int power = 2*i;

            result += Math.pow(-1, i) * Math.pow(x, power) / factorial(power);
        }
    }

    long factorial(long n) {

        if (n==0) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
package LAB_9;

public class NumberCalculator {
    public static void main(String[] args) {
        
        FibonachiNum fiboNum = new FibonachiNum();
        PrimeNum primeNum = new PrimeNum();

        Thread fiboThread = new Thread(fiboNum);
        Thread primeThread = new Thread(primeNum);

        fiboThread.setPriority(8);
        primeThread.setPriority(5);

        fiboThread.start();
        primeThread.start();

        
    }
}

class FibonachiNum implements Runnable {

    int[] fibo = new int[50];

    FibonachiNum() {

        fibo[0] = 0;
        fibo[1] = 1;
    }

    public void run() {

        for (int i=2; i<50; i++) {

            fibo[i] = fibo[i-1] + fibo[i-2];
        }

    }

    void display() {

        for (int i=0; i<50; i++) {

            System.out.print(fibo[i] + "  ");
        }
    }
}

class PrimeNum implements Runnable {

    int[] prime = new int[25];
    int i = 0;
    int j = 2;

    public void run() {

        while (i != 25) {

            if (isPrime(j)) {
                prime[i] = j;
                i++;
            }
            j++;
        }
    }

    boolean isPrime(int num) {

        boolean isPrime = true;

        for (int i=0; i<Math.sqrt(num); i++) {

            if (num%i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }

    void display() {

        for (int i=0; i<25; i++) {

            System.out.print(prime[i] + "  ");
        }
    }
}

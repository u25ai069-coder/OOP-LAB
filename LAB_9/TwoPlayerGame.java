package LAB_9;

import java.util.Random;
import java.util.Scanner;

public class TwoPlayerGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Thread GameThread = new Thread(new RandomGenerator());

        System.out.print("Player 1, Enter no: ");
        sc.nextInt();

        System.out.print("Player 2, Enter no: ");
        sc.nextInt();

        GameThread.start();

        sc.close();
    }
}

class RandomGenerator implements Runnable {

    @Override
    public void run() {

        Random rn = new Random();

        int x = rn.nextInt(1000);
        int y = rn.nextInt(1000);

        if (x>y) {

            System.out.println("Player 1 wins by " + (x-y));
        }
        else if (x<y) {
            System.out.println("Player 2 wins by " + (y-x));
        }
        else {
            System.out.println("Tie");
        }
    }
}

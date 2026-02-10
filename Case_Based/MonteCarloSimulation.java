package Case_Based;

import java.util.Random;

public class MonteCarloSimulation {

    public static int randomNumber()
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(201) - 100;

        return randomNumber;
    }

    public static void main(String[] args) {

        int oddCount=0;
        
        for (int i=0; i<1000000; i++)
        {
            int x = randomNumber();
            int y = randomNumber();

            if (x<0)
            {
                oddCount++;
            }
            if(x>=0 && y>=0 && x + y <= 100)
            {
                oddCount++;
            }
        }

        System.out.println("Calculated probability: " + (float)(5.0/8));
        System.out.println("Simulated probability : " + (float)(oddCount/1000000.0));
    }
}

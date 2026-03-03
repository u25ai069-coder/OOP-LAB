package LAB_6;

import java.util.Scanner;

class ProfitCalculator {

    int attendees;

    ProfitCalculator(int attendees) {
        this.attendees = attendees;
    }

    float calculateProfit() {

        float profit;
        profit = (float)(attendees*5 - ((attendees * 0.5) + 20));

        return profit;
    }
}

public class TotalProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of attendees : ");
        int attendees = sc.nextInt();

        ProfitCalculator pf = new ProfitCalculator(attendees);

        float profit = pf.calculateProfit();

        if (profit < 0) {
            System.out.println("Loss : " + (-1)*profit);
        }
        else {
            System.out.println("Profit : " + profit);
        }

        sc.close();
    }
    
}

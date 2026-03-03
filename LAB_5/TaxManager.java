package LAB_5;

import java.util.Scanner;

class Tax 
{
    int rate = 15;

    float calculateTax(int grossPay)
    {
        return (float)(grossPay*rate/100);
    }

    float netPay(int hoursWorked)
    {
        int pay = hoursWorked * 12;
        pay -= calculateTax(pay);

        return pay;
    }
}

public class TaxManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tax tax = new Tax();

        System.out.println("Choose 1 for gross pay to tax & 2 for hours worked to net pay: ");
        int choice = sc.nextInt();

        if (choice == 1)
        {
            System.out.println("Enter gross pay: ");
            int grossPay = sc.nextInt();
            System.out.println("Tax = " + tax.calculateTax(grossPay));
        }
        else if (choice == 2)
        {
            System.out.println("Enter hours worked: ");
            int hours = sc.nextInt();
            System.out.println("Net pay = " + tax.netPay(hours));
        }

        sc.close();
    }
}

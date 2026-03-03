package LAB_6;

import java.util.Scanner;

class Bank {

    int deposit(int amount, int balance) {
        return balance + amount;
    }

    int withdraw(int amount, int balance) {
        
        if (amount <= balance) {
            return balance - amount;
        }
        else {
            return 0;
        }
    }
}

public class BankManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Bank b = new Bank();

        System.out.println("Enter 1 for deposit and 2 for withdraw: ");
        int choise = sc.nextInt();

        if (choise == 1) {
            System.out.println("Enter balance: ");
            int balance = sc.nextInt();
            System.out.println("Enter amount: ");
            int amount = sc.nextInt();
            int newBalance = b.deposit(amount, balance);
            System.out.println("new balance = " + newBalance);
        }
        else if (choise == 2) {
            System.out.println("Enter balance: ");
            int balance = sc.nextInt();
            System.out.println("Enter amount: ");
            int amount = sc.nextInt();
            int newBalance = b.withdraw(amount, balance);
            System.out.println("new balance = " + newBalance);
        }
        else {
            System.out.println("Enter 1 or 2");
        }       

        sc.close();
    }
}

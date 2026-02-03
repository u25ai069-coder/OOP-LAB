package LAB_4;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter pass: ");
        String pass = sc.next();
        int upper = 0, lower = 0, digit = 0;

        for (int i=0; i<pass.length(); i++)
        {
            char c = pass.charAt(i);
            if (Character.isLowerCase(c)) lower++;
            else if (Character.isUpperCase(c)) upper++;
            else if (Character.isDigit(c)) digit++;
        }

        if (upper > 0 || lower == 0 || digit == 0)
        {
            System.out.println("Not acceptable password");
        }
        else
        {
            System.out.println("Acceptable");
        }

        sc.close();
    }
}

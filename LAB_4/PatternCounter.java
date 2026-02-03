package LAB_4;

import java.util.Scanner;

public class PatternCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start range: ");
        int a = sc.nextInt();

        System.out.print("Enter end range: ");
        int b = sc.nextInt();

        System.out.print("Enter pattern: ");
        String pattern = sc.next();

        int count = 0;

        for (int i=a; i<b; i++)
        {
            String st = Integer.toString(i);

            if (st.contains(pattern)) count++;
        }

        System.out.println("the no. times " + pattern + " occurred between " + a + " and " + b + " is: " + count);

        sc.close();
    }
}

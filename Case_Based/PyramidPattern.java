package Case_Based;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of lines: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++)
        {
            for (int j=n-i; j>0; j--)
            {
                System.out.print("    ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.printf("%4d", (Math.powExact(2, j)));
            }

            for (int j=i-2; j>-1; j--)
            {
                System.out.printf("%4d", (Math.powExact(2, j)));
            }

            System.out.println();
        }


        sc.close();
    }
}

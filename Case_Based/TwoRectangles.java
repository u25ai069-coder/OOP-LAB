package Case_Based;

import java.util.Scanner;

public class TwoRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For rectangle 1: ");
        System.out.print("Enter x, y, w, h: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int w1 = sc.nextInt();
        int h1 = sc.nextInt();

        System.out.println("For rectangle 2: ");
        System.out.print("Enter x, y, w, h: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int w2 = sc.nextInt();
        int h2 = sc.nextInt();

        int conditionCount=0;

        if ((x2 - (w2/2)) > (x1 - (w1/2))) conditionCount++;
        if ((x2 + (w2/2)) < (x1 - (w1/2))) conditionCount++;
        if ((y2 - (h2/2)) < (y1 - (h1/2))) conditionCount++;
        if ((y2 + (h2/2)) > (y1 + (h1/2))) conditionCount++;

        
        if (w2<w1 && h2<h1)
        {
            if (conditionCount == 4)
            {
                System.out.println("Rectangle 2 is inside rectangle 1");
            }
            else if (conditionCount == 3 || conditionCount ==  2)
            {
                System.out.println("Rectangle 2 overlap");
            }
            else
            {
                System.out.println("Rectangle 2 is outside of rectangle one");
            }
        }
        else
        {
            System.out.println("2nd rectangle cant be equal or bigger to first rectangle");
            System.out.println("Please enter correct dimensions");
        }

        sc.close();
    }
}

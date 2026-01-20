package LAB_1;
import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        int a = sc.nextInt();

        System.out.print("Enter num 2: ");
        int b = sc.nextInt();

        if (a > b)
        {
            System.out.println(a + " is Larger");
        }
        else if (a < b)
        {
            System.out.println(b + " is Larger");
        }
        else
        {
            System.out.println("the number are Equal");
        }

        sc.close();
    }
}

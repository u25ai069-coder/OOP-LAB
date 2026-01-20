package LAB_1;
import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do
        {
            System.out.println("Enter number: ");
            num = sc.nextInt();
        } while (num > 99999);
        
        int[] a = new int[5];

        int i=0;
        while (num != 0)
        {
            a[i] = num % 10;  
            i++;
            num /= 10;
        }

        for (i=4; i>=0; i--)
        {
            System.out.printf("%d   ", a[i]);
        }

        sc.close();
    }
}

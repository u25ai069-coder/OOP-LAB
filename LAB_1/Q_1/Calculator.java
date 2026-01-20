package LAB_1.Q_1;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Int a: ");
        int a = sc.nextInt();

        System.out.print("Enter Int b: ");
        int b = sc.nextInt();

        Operations op = new Operations();

        int sum = op.add(a, b);
        System.out.println("Sum = " + sum);

        int sub = op.sub(a, b);
        System.out.println("Sub = " + sub);

        int mul = op.mul(a, b);
        System.out.println("Mul = " + mul);

        double div = op.div(a, b);
        System.out.println("Div = " + div);

        sc.close();
    }
}
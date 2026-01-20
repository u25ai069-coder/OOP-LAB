package LAB_1;
import java.util.Scanner;

class Operate {
        int a, b, c;
        
        Operate(int a, int b, int c)
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        int sum()
        {
            return a + b + c;
        }

        float average()
        {
            return (float)((a + b + c) / 3.0);
        }

        int product()
        {
            return a * b * c;
        }

        int largest()
        {
            return (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
        }

        int smallest()
        {
            return (a<b) ? ((a<c) ? a : c) : ((b<c) ? b : c);
        }
    }

public class Abstract {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        Operate op = new Operate(a, b, c);

        int sum = op.sum();
        float avg = op.average();
        int mul = op.product();
        int max = op.largest();
        int min = op.smallest();

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
        System.out.println("mul: " + mul);
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        sc.close();
    }
}

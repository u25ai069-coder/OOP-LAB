package LAB_3;
import java.util.Scanner;

class X{
    int i, j;

    X(int i, int j)
    {
        this.i = i;
        this.j = j;
    }

    int finalSum()
    {
        return i + j;
    }
}

class Y extends X{

    Y(int i, int j)
    {
        super(i, j);
    }

    int finalProduct()
    {
        return i*j;
    }
}

class Z extends Y{

    Z(int i, int j)
    {
        super(i, j);
    }

    double finalDiv()
    {
        return (i / j);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter i: ");
        int i = sc.nextInt();

        System.out.println("Enter j: ");
        int j = sc.nextInt();

        Z obj = new Z(i, j);

        System.out.println("sum = " + obj.finalSum() + "\nProduct = " + obj.finalProduct() + "\nDivision = " + obj.finalDiv());

        sc.close();
    }
}

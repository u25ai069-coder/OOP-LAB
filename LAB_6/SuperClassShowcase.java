package LAB_6;

import java.util.Scanner;

class A {

    int data;

    A(int data) {
        this.data = data;
    }
}

class B extends A {

    int value = super.data * 2;

    B(int data) {
        super(data);
    }
}

public class SuperClassShowcase {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data: ");
        int x = sc.nextInt();

        B objectB = new B(x);

        System.out.println("Class B data : " + objectB.data);
        System.out.println("Class B value : " + objectB.value);

        sc.close();
    }
}

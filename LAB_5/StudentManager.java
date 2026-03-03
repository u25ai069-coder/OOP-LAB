package LAB_5;

import java.util.Scanner;

class Student 
{
    Scanner sc = new Scanner(System.in);

    boolean passed(int marks1, int marks2, int marks3)
    {
        if ((marks1 + marks2 + marks3)/3.0 >= 50.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    String inputName()
    {
        System.out.println("Enter name: ");
        String name = sc.next();
        return name;
    }
}

public class StudentManager {  
    public static void main(String[] args) {
        
        Student st = new Student();
        String name = st.inputName();
        System.out.println("Name of students : " + name);

        System.out.println("\nEnter marks of 3 examinations: ");
        int marks1 = st.sc.nextInt();
        int marks2 = st.sc.nextInt();
        int marks3 = st.sc.nextInt();

        System.out.println("Passed status : " + st.passed(marks1, marks2, marks3));
    }
}

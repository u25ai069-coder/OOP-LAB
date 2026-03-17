package LAB_7;

class Teacher {

    String Name;
    int age;
    String Qualification;

    Teacher(String Name, int age, String Qualification) {
        this.Name = Name;
        this.age = age;
        this.Qualification = Qualification;
    }
}

class Students extends Teacher {

    int Class;
    char Div;

    Students(String Name, int age, int Class, char Div) {
        super(Name, age, "Studying");
        this.Class = Class;
        this.Div = Div;
    }
}

public class StudentTeacherSystem {
    public static void main(String[] args) {
        
        Teacher T1 = new Teacher("Jatin", 35, "PHd");
        Students S1 = new Students("Ram", 18, 12, 'A');

        System.out.println("Teacher : " + T1.Name + " Age : " + T1.age + " Qual. : " + T1.Qualification);
        System.out.println("Student : " + S1.Name + " Age : " + S1.age + " Qual. : " + S1.Qualification + " Class : " + S1.Class + " Div : " + S1.Div);
    }
}

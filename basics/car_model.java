class Car {
    String model;
    int year;

    Car(String model, int year)
    {
        this.model = model;
        this.year = year;
    }

    void display()
    {
        System.out.println(model + " " + year);
    }
}

public class car_model {
    public static void main(String[] args) {
        Car mycar = new Car("Toyota", 2020);
        mycar.display();
    }
}

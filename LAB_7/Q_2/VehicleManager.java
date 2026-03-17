package LAB_7.Q_2;

public class VehicleManager {
    public static void main(String[] args) {
        
        Car c = new Car(500, 2100, 1500000, 100, 5);
        Scooty s = new Scooty(100, 3400, 150000, 80, true);

        System.out.println("Max Speed of Car : " + c.maxSpeed());
        System.out.println("Max Speed of Scooty : " + s.maxSpeed());
    }
}

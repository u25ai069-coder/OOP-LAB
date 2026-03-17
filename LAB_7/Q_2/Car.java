package LAB_7.Q_2;

class Car extends Vehicle{
    
    int numberOfSeats;
    
    Car(float weight, int modelNumber, int price, int speed)
    {
        super(weight, modelNumber, price, speed);
    }

    Car(float weight, int modelNumber, int price, int speed, int numberOfSeats)
    {
        super(weight, modelNumber, price, speed);
        this.numberOfSeats = numberOfSeats;
    }

    float maxSpeed()
    {
        return speed * (numberOfSeats * 100 / weight);
    }
}

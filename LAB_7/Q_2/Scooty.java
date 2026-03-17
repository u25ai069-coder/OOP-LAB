package LAB_7.Q_2;

class Scooty extends Vehicle{

    Scooty(float w, int mN, int p, int s) 
    {
        super(w, mN, p, s);
    }
    
    boolean isElectric;

    Scooty(float w, int mN, int p, int s, boolean isElec) 
    {
        super(w, mN, p, s);
        this.isElectric = isElec;
    }

    float maxSpeed()
    {
        return speed * (100/weight);
    }
}

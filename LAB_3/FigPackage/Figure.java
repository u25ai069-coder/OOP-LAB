package LAB_3.FigPackage;

public abstract class Figure {
    double r, a, v;
    double pi = 3.1428;

    public void displayArea()
    {
        System.out.println("Area: " + a);
    }

    public void displayVolume()
    {
        System.out.println("Volume: " + v);
    }

    public abstract void calcArea();
    public abstract void calcVolume();
}

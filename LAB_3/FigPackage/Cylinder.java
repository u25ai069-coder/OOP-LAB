package LAB_3.FigPackage;

class Cylinder extends Figure{
    double h;

    Cylinder(double r, double h)
    {
        this.r = r;
        this.h = h;
    }

    public void calcArea()
    {
        a = 2 * pi * r * (h + r);
    }

    public void calcVolume()
    {
        v = pi * r * r * h;
    }
}

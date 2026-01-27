package LAB_3.FigPackage;

class Cone extends Figure{
    double h, s;

    Cone(double r, double h)
    {
        this.r = r;
        this.h = h;
        this.s = Math.sqrt(h*h + r*r);
    }

    public void calcArea()
    {
        a = pi * (r*r + r*s); 
    }

    public void calcVolume()
    {
        v = (pi * r * r * h) / 3;
    }
}
